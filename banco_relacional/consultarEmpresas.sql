select e.nome, c.nome 
from empresas e, empresas_unidades eu, cidades c 
where e.id = eu.empresa_id 
and c.id = eu.cidade_id
and sede;

-- select * from tbl_algo limit 4 offset 3;     limita a busca em 4 registros a partir do que foi especificado no offset
--                                              limit 10 offset 0 trás os 10 primeiros registros
--                                              limit 10 offset 10 trás do 11 ao 20 registro