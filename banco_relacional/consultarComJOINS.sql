select * from cidades inner join prefeitos p on c.id = p.cidade_id;

select * from cidades c left join prefeitos p on c.id = p.cidade_id;

select * from cidades c left outer join prefeitos p on c.id = p.cidade_id;

select * from cidades c right join prefeitos p on c.id = p.cidade_id;

select * from cidades c right outer join prefeitos p on c.id = p.cidade_id;

select * from cidades c left join prefeitos p on c.id = p.cidade_id;

select * from cidades c left outer join prefeitos p on c.id = p.cidade_id; -- equivalente a full join que não é suportado
union
select * from cidades c right join prefeitos p on c.id = p.cidade_id;

select * from cidades c left outer join prefeitos p on c.id = p.cidade_id;
union all
select * from cidades c right join prefeitos p on c.id = p.cidade_id;