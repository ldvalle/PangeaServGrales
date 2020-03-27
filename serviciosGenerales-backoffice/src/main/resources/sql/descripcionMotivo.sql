SELECT trim(tc_desc_motivo) motivo_cliente, trim(te_desc_mot_empres) motivo_empresa
  FROM ct_tab_motivo
       JOIN ct_tab_mot_empresa ON (tc_cod_motivo = te_cod_motivo)
 WHERE tc_cod_motivo = :#${header.MotivoContacto.getMotivoCliente().getCodigo()}
   AND tc_fecha_alta <= TODAY
   AND (tc_fecha_baja IS NULL OR tc_fecha_baja > TODAY)
   AND te_cod_mot_empresa = :#${header.MotivoContacto.getMotivoEmpresa().getCodigo()}
   AND te_fecha_alta <= TODAY
   AND (te_fecha_baja IS NULL OR te_fecha_baja > TODAY)
