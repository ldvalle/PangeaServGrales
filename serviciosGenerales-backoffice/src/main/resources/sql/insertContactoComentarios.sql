INSERT INTO ct_observ(
    ob_co_numero,
    ob_suc_contacto,
    ob_descrip,
    ob_pagina
)
VALUES(
    :#${header.Contacto.getNumero()},
    :#${header.Contacto.getSucContacto()},
    :#${body},
    :#${header.CamelSplitIndex} + 1
)
