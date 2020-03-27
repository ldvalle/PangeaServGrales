SELECT trim(tt_cod_tema) tema_codigo, trim(t1.descripcion) tema_descripcion,
       trim(tt_cod_trabajo) trabajo_codigo, trim(t2.descripcion) trabajo_descripcion
       , TRIM(t1.valor_alf) genOT
  FROM ct_tab_mot_tt tt
       JOIN synergia:tabla t1 ON (t1.codigo = tt.tt_cod_tema)
       JOIN synergia:tabla t2 ON (t2.codigo = tt.tt_cod_trabajo)
 WHERE tt_cod_motivo = :#${header.MotivoContacto.getMotivoCliente().getCodigo()}
   AND tt_cod_mot_empresa = :#${header.MotivoContacto.getMotivoEmpresa().getCodigo()}
   AND t1.nomtabla = 'TEMAS'
   AND t1.sucursal = '0000'
   AND (t1.fecha_desactivac IS NULL OR t1.fecha_desactivac > TODAY)
   AND t2.nomtabla = 'TRABAJ'
   AND t2.sucursal = '0000'
   AND (t2.fecha_desactivac IS NULL OR t2.fecha_desactivac > TODAY)
