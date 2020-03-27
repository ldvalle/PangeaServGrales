SELECT te_plazo_com plazo_respuenta,
       (te_plazo_com + 1) plazo_c_t,
       NVL(te_tipo_contacto, '0') tipo_contacto
  FROM ct_tab_mot_empresa
 WHERE te_cod_motivo = :#${body.getRequest().getMotivo()}
   AND te_cod_mot_empresa = :#${body.getRequest().getSubMotivo()}
