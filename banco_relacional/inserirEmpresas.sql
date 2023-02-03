alter table empresas modify cnpj varchar(20);

insert into empresas(nome, cnpj)
values('Bradesco', '92.870.189/0001-91'),('Vale', '35.646.283/0001-28'),('Cielo', '08.608.623/0001-53');

desc empresas; -- descreve a tabela

insert into empresas_unidades(empresa_id, cidade_id, sede)
values(1, 1, 1), (1, 2, 0),(2, 1, 0),(2, 2, 1);