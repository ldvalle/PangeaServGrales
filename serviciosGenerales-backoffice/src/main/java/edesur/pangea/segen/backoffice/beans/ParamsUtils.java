package edesur.pangea.segen.backoffice.beans;

import edesur.pangea.segen.backoffice.Headers;
import org.apache.camel.Header;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ParamsUtils {
    public Map<String, Object> getContactoProperties(@Header(Headers.CONTACTO) Object object) throws Exception {
        return getProperties(object);
    }

    public Map<String, Object> getProcedimientoProperties(@Header(Headers.PROCEDIMIENTO) Object object) throws Exception {
        return getProperties(object);
    }

    public Map<String, Object> getOrdenProperties(@Header(Headers.ORDEN) Object object) throws Exception {
        return getProperties(object);
    }
    
    public Map<String, Object> getEtapaOrdenProperties(@Header(Headers.ETAPA_ORDEN) Object object) throws Exception { //LDV
        return getProperties(object);
    }

    public Map<String, Object> getCtoSegenProperties(@Header(Headers.CONTACTO_SEGEN) Object object) throws Exception { //LDV
        return getProperties(object);
    }


    public Map<String, Object> getOtMacProperties(@Header(Headers.OT_MAC) Object object) throws Exception { //LDV
        return getProperties(object);
    }
    
    public Map<String, Object> getOtHisEvenProperties(@Header(Headers.OT_HISEVEN) Object object) throws Exception { //LDV
        return getProperties(object);
    }
    
    public Map<String, Object> getOtMacSapProperties(@Header(Headers.OT_MAC_SAP) Object object) throws Exception { //LDV
        return getProperties(object);
    }

    public Map<String, Object> getRecRecUniProperties(@Header(Headers.REC_REC_UNI) Object object) throws Exception {
        return getProperties(object);
    }

    private Map<String, Object> getProperties(Object object) throws Exception {
        final Map<String, Object> map = new HashMap<>();

        Method[] methods = object.getClass().getMethods();
        for (Method method : methods) {
            String name = method.getName();
            if (isGetter(name)) {
                map.put(getPropertyName(name), method.invoke(object));
            }
        }
        return map;
    }

    private boolean isGetter(String name) {
        return name.startsWith("get") || name.startsWith("is");
    }

    private String getPropertyName(String name) {
        String s = (name.startsWith("get") ? name.substring(3) : name.substring(2));
        return s.substring(0, 1).toLowerCase() + s.substring(1);
    }
}
