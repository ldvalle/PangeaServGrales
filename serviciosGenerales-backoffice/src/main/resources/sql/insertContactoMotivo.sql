INSERT INTO ct_motivo (
    mo_co_numero,
    mo_cod_motivo,
    mo_cod_mot_empresa,
    mo_fecha_vto,
    mo_vto_real_com,
    mo_rol_inicio,
    mo_suc_ag_contacto,
    mo_suc_contacto,
    mo_oficina,
    mo_fecha_inicio,
    mo_tipo_contacto,
    mo_fecha_proceso,
    mo_principal,
    mo_estado,
    mo_fecha_estado
)
VALUES(
    :#numero,
    :#motivo,
    :#motivoEmpresa,
    :#fechaVencimiento,
    :#fechaVencimiento,
    :#rolInicio,
    :#sucAgContacto,
    :#sucContacto,
    :#oficina,
    :#fechaInicio,
    :#tipo,
    :#fechaProceso,
    :#principal,
    :#estado,
    :#fechaEstado
)
