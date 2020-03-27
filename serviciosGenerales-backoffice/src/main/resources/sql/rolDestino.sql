SELECT FIRST 1 destino, codigo_agrupacion
  FROM (
        SELECT 1 orden, trim(t.car_proc_pendiente) destino, t.cod_agrupacion codigo_agrupacion
          FROM recla_tecni_proce t
         WHERE t.procedimiento = :#${header.TipoProcedimiento}
           AND t.motivo_cliente = :#${header.MotivoContacto.getMotivoCliente().getCodigo()}
           AND t.motivo_empresa = :#${header.MotivoContacto.getMotivoEmpresa().getCodigo()}
           AND t.tema = :#${header.TemaTrabajo.getTema().getCodigo()}
           AND t.trabajo = :#${header.TemaTrabajo.getTrabajo().getCodigo()}
           AND t.fecha_activacion <= TODAY
           AND (t.fecha_desactivac IS NULL OR t.fecha_desactivac > TODAY)
        UNION ALL
        SELECT 2,
               CASE
                   WHEN cod_sucur = 2 THEN 'CAPITAL'
                   WHEN cod_sucur = 3 THEN 'RIBERA'
                   WHEN cod_sucur = 4 THEN 'ROCA'
                   ELSE ''
               END,
               null::char
          FROM sucur_centro_op
         WHERE cod_centro_op = :#${header.DatosCliente.getSucursal()}
  )
 ORDER BY orden
