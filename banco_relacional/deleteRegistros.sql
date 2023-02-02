INSERT INTO estados (id, nome, sigla, regiao, populacao)
VALUES (100, 'Novo', 'NV', 'NORTE', 1.11);
INSERT INTO estados (nome, sigla, regiao, populacao)
VALUES ('Mais Novo', 'MN', 'NORTE', 2.68);

DELETE FROM `estados` WHERE sigla = 'MN';

DELETE FROM estados WHERE id >= 1000;