SELECT  * FROM estados;
SELECT nome, sigla FROM estados;
SELECT nome AS 'Nome do Estado', sigla FROM estados;
SELECT nome, regiao FROM estados WHERE populacao >= 10;
SELECT nome, regiao FROM estados WHERE populacao >= 10 ORDER BY populacao DESC;