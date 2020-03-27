SELECT c.numero_cliente numero, trim(c.nombre) nombre, trim(c.tip_doc) tipo_documento,
       cast(c.nro_doc as int) numero_documento, trim(c.tarifa) tarifa,
       c.sucursal, c.sector plan, c.zona, c.correlativo_ruta,
       trim(c.telefono) telefono, trim(c.rut) cuit,
       trim(c.nom_partido) partido, trim(c.nom_comuna) localidad,
       c.cod_postal codigo_postal,
       trim(c.nom_calle) calle, trim(c.nro_dir) numero_direccion,
       trim(c.depto_dir) depto, trim(c.piso_dir) piso,
       m.numero_medidor, trim(c.nom_sucursal) nombre_sucursal,
       trim(c.cuenta_conver) cuenta_conver,
       partido codigo_partido, comuna codigo_localidad,
       cod_calle codigo_calle,
       cod_entre codigo_entre_calle1, nom_entre entre_calle1,
       cod_entre1 codigo_entre_calle2, nom_entre1 entre_calle2,
       m.marca_medidor, m.modelo_medidor, md.mod_nrocb, o.suc_padre
  FROM cliente c JOIN medid m ON (c.numero_cliente = m.numero_cliente AND m.estado = 'I')
	JOIN modelo md ON(md.mar_codigo = m.marca_medidor AND md.mod_codigo = m.modelo_medidor )
	OUTER JOIN ot_sucursal o (o.suc_hijo = c.sucursal)
 WHERE c.numero_cliente = :#${headers.NumeroCliente}
