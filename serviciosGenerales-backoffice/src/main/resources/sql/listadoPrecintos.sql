SELECT codigo_ubicacion, 
	fecha_movimiento 
	FROM sellos 
	WHERE numero_cliente = :#${headerS.NumeroCliente}
	AND numero_medidor = :#${header.Cliente.getNumeroMedidor()}
	AND marca_medidor  = :#${header.Cliente.getMarcaMedidor()} 
	AND estado_insta = '6' 
UNION 
SELECT '0', 
	DATE(fecha_estado) 
	FROM prt_precintos e 
	WHERE e.numero_cliente = :#${header.NumeroCliente}
	AND e.estado_actual = '08' 
	AND e.fecha_estado = (SELECT MAX(e2.fecha_estado) 
	   FROM prt_precintos e2 
	   WHERE e.numero_cliente = e2.numero_cliente 
	   AND e.estado_actual = e2.estado_actual ) 
ORDER BY 2 DESC 
