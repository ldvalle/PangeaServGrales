SELECT su_cod_superior
  FROM ct_tab_suctrof
 WHERE su_cate_suctrof = 'C'
   AND su_cod_suctrof = :#${header.DatosCliente.getSucursal()}

