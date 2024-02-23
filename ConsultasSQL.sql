

    http://10.250.18.3:8080/h2-console


-- 1.- Cambio de nombre de algunas columnas

SELECT ISMN             AS CODIGO,
       TITULO           AS TITLE,
       DURACION
FROM CANCIONES;

-- 2.- Nuevas columnas calculadas. Ejemplo en el que sumamos 10 a una columna

SELECT ISMN                   AS CODIGO,
                TITULO        AS TITLE,
                DURACION      AS DURACION_ORIGINAL,
                DURACION + 10 AS DURACION_AMPLIADA
FROM CANCIONES;

-- 3.- No todos los cálculos son aritméticos. Podemos "calcular" cosas como la cantidad de
--     caracteres de un texto...

SELECT ISMN               AS CODIGO,
       TITULO             AS TITLE,
       LENGTH(TITULO)     AS NUMERO_CARACTERES_TITULO
FROM CANCIONES;

-- 4.- Cualquier consulta podemos solicitarla en cualquier orden (por defecto es ascencende). 
--     Si nos interesa en orden descendente pondremos DESC

SELECT ISMN            AS CODIGO,
       TITULO          AS TITLE,
       LENGTH(TITULO)  AS NUMERO_CARACTERES_TITULO
FROM CANCIONES
ORDER BY NUMERO_CARACTERES_TITULO DESC

-- 5.- Igual que lo anterior, pero con un segundo criterio de ordenación

SELECT ISMN            AS CODIGO,
       TITULO          AS TITLE,
       LENGTH(TITULO)  AS NUMERO_CARACTERES_TITULO
FROM CANCIONES
ORDER BY NUMERO_CARACTERES_TITULO DESC, TITULO DESC

-- 6.- Para filtrar los registros utilizaremos la clausula WHERE. Ejemplo:

SELECT ISMN, TITULO, CODIGO_GENERO
FROM CANCIONES
WHERE CODIGO_GENERO = 8

-- 7.- Para obtener resultados procedentes de diferentes tablas "combinadas" utilizaremos el JOIN. Ejemplo:

SELECT      C.ISMN, 
            C.TITULO,
            C.FECHA_CREACION,
            C.EXPLICITA,
            C.DURACION,
          --C.CODIGO_GENERO,
          --G.CODIGO,
            G.NOMBRE,
            G.OBSERVACIONES

FROM CANCIONES C JOIN GENEROS G ON (C.CODIGO_GENERO = G.CODIGO);


-- 8.- La misma consulta anterior pero sin alias (por si os gusta más)

SELECT  CANCIONES.ISMN, 
        CANCIONES.TITULO,
        CANCIONES.FECHA_CREACION,
        CANCIONES.EXPLICITA,
        GENEROS.NOMBRE,
        GENEROS.OBSERVACIONES
FROM CANCIONES JOIN GENEROS ON (CANCIONES.CODIGO_GENERO = GENEROS.CODIGO);

-- 9.- Cálculos de sumam, media, minimo, maximo y conteo

SELECT SUM(DURACION) FROM CANCIONES;
SELECT MIN(DURACION) FROM CANCIONES;
SELECT MAX(DURACION) FROM CANCIONES;
SELECT AVG(DURACION) AS DURACION_MEDIA FROM CANCIONES;
-- SELECT COUNT(*) AS NUMERO_TOTAL_CANCIONES FROM CANCIONES;  

SELECT COUNT(*) AS NUMERO_TOTAL_CANCIONES_GENERO_8 FROM CANCIONES WHERE CODIGO_GENERO = 8;


-- 10.- Obtener los elementos "distintos" usando la clausula DISTINCT

SELECT  DISTINCT ORDENADOR FROM ALUMNOS;

-- 11.- Cálculos con el GROUP-BY


SELECT ORDENADOR, COUNT(*) 
FROM ALUMNOS 
GROUP BY ORDENADOR;

-- 12.- Otro ejemplo de GROUP BY con calculos de todo tipo...

SELECT CODIGO_GENERO, 
               COUNT(*)                 AS NUMERO_CANCIONES, 
               AVG(DURACION)            AS DURACION_MEDIA, 
               MIN(DURACION)            AS DURACION_MINIMA, 
               MAX(DURACION)            AS DURACION_MAXIMA, 
               SUM(DURACION) / 60       AS SUMA_TOTAL_MINUTOS
FROM CANCIONES
GROUP BY CODIGO_GENERO


-- 13.- Mejora del ejemplo anterior en la que aparecen los nombres de los generos. Faltaría incluir aquellos géneros 
--         que no están en ninguna canción.

SELECT G.NOMBRE, 
       COUNT(*)                 AS NUMERO_CANCIONES, 
       AVG(DURACION)            AS DURACION_MEDIA, 
       MIN(DURACION)            AS DURACION_MINIMA, 
       MAX(DURACION)            AS DURACION_MAXIMA, 
       SUM(DURACION) / 60       AS SUMA_TOTAL_MINUTOS
FROM CANCIONES C JOIN GENEROS G
ON (C.CODIGO_GENERO = G.CODIGO)
GROUP BY G.NOMBRE

 