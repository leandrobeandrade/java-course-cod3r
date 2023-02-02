SELECT regiao AS 'Regiao', SUM(populacao) as Total FROM estados GROUP BY regiao ORDER BY Total desc; 

SELECT SUM(populacao) as Total FROM estados;