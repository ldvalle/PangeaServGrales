SELECT o1.ot_nro_orden 
FROM ot_mac o1 
WHERE o1.ot_mensaje_xnear = :#${header.Procedimiento.getNumeroMensaje()}
AND o1.ot_fecha_inicio = (SELECT MAX(o2.ot_fecha_inicio) FROM ot_mac o2 
	WHERE o2.ot_mensaje_xnear = o1.ot_mensaje_xnear 
	AND o2.ot_estado = 'C' )
				
