SELECT FIRST 1 area
  FROM (
        SELECT 1 orden, r.area
          FROM recla_tecni_proce t
               LEFT OUTER JOIN rol r ON (r.rol = t.car_proc_pendiente)
         WHERE t.procedimiento = :#${header.TipoProcedimiento}
           AND t.motivo_cliente = :#${header.MotivoContacto.getMotivoCliente().getCodigo()}
           AND t.motivo_empresa = :#${header.MotivoContacto.getMotivoEmpresa().getCodigo()}
           AND t.tema = :#${header.TemaTrabajo.getTema().getCodigo()}
           AND t.trabajo = :#${header.TemaTrabajo.getTrabajo().getCodigo()}
           AND t.fecha_activacion <= TODAY
           AND (t.fecha_desactivac IS NULL OR t.fecha_desactivac > TODAY)
        UNION ALL
        SELECT 2 orden, te_carpeta_destino area
          FROM contacto:ct_tab_mot_empresa
         WHERE te_cod_motivo =  :#${header.MotivoContacto.getMotivoCliente().getCodigo()}
           AND te_cod_mot_empresa = :#${header.MotivoContacto.getMotivoEmpresa().getCodigo()}
           AND te_fecha_alta <= TODAY
           AND (te_fecha_baja IS NULL OR te_fecha_baja > TODAY)
  )
 ORDER BY orden
