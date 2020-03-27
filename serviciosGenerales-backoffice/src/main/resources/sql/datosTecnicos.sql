SELECT trim(codigo_voltaje) codigo_voltaje,
       trim(tec_cod_suc) codigo_sucursal, trim(tec_sucursal) sucursal,
       trim(tec_cod_part) codigo_partido, trim(tec_partido) partido,
       trim(tec_cod_local) codigo_localidad, trim(tec_localidad) localidad,
       trim(tec_cod_calle) codigo_calle, trim(tec_nom_calle) calle,
       trim(tec_nro_dir) numero, trim(tec_piso_dir) piso, trim(tec_depto_dir) depto,
       trim(tec_cod_entre) codigo_entre_calle1, trim(tec_entre_calle1) entre_calle1,
       trim(tec_cod_ycalle) codigo_entre_calle2, trim(tec_entre_calle2) entre_calle2,
       trim(tec_manzana) manzana,
       trim(tec_centro_trans) centro_transformacion, trim(tec_alimentador) alimentador,
       trim(tec_subestacion) subestacion, trim(tec_nom_subest) nombre_subestacion
  FROM tecni
 WHERE numero_cliente = :#${headers.NumeroCliente}