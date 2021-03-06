INSERT INTO ct_contacto (
    co_numero,
    co_numero_cliente,
    co_tipo_doc,
    co_nro_doc,
    co_es_cliente,
    co_tarifa,
    co_suc_cli,
    co_cen_cli,
    co_plan,
    co_nombre,
    co_telefono,
    co_backoffice,
    co_fecha_vto,
    co_direccion,
    co_partido,
    co_codpos,
    co_nro_cuit,
    co_rol_inicio,
    co_rol_resp,
    co_cod_medio,
    co_fecha_inicio,
    co_suc_ag_contacto,
    co_suc_contacto,
    co_oficina,
    co_fecha_proceso,
    co_fecha_estado,
    co_multi
)
VALUES(
    :#numero,
    :#numeroCliente,
    :#tipoDocumento,
    :#numeroDocumento,
    :#esCliente,
    :#tarifa,
    :#sucursalCliente,
    :#centroOperativo,
    :#plan,
    :#nombre,
    :#telefono,
    :#backoffice,
    :#fechaVencimiento,
    :#direccion,
    :#partido,
    :#codigoPostal,
    :#cuit,
    :#rolInicio,
    :#rolInicio,
    :#medio,
    :#fechaInicio,
    :#sucAgContacto,
    :#sucContacto,
    :#oficina,
    :#fechaProceso,
    :#fechaEstado,
    :#coMulti
)
