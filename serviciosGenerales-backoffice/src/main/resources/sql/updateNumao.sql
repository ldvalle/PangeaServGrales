UPDATE numao
   SET numero = (
        SELECT trim(area || to_char(substr(numero, 5) + 1, '&&&&&&'))
          FROM numao
         WHERE tipo_orden = 'AC'
           AND area = 'SIC0'
   )
 WHERE tipo_orden = 'AC'
   AND area = 'SIC0'
