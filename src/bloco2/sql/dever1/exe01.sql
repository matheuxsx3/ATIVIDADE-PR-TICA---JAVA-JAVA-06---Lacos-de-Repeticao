CREATE database db_recursoshumanos;
use db_recursoshumanos;
create table tb_colaboradores(
id bigint auto_increment,
nome varchar(255)not null,
idade int not null,
cargo varchar(255)not null,
cargaHorariaDia int not null,
numeroContato bigint not null,
salario int not null,
primary key(id)
);
insert into tb_colaboradores(nome,idade,cargo,cargaHorariaDia,numeroContato,salario)
values ("Marcos",22,"gerente de TI",8,21990434576, 10000);
insert into tb_colaboradores(nome,idade,cargo,cargaHorariaDia,numeroContato,salario)
values ("Miguel",19,"atendente",8,21973826493,1500);
insert into tb_colaboradores(nome,idade,cargo,cargaHorariaDia,numeroContato,salario)
values ("Mycon",29,"faxineiro",8,21976276493,1500);
insert into tb_colaboradores(nome,idade,cargo,cargaHorariaDia,numeroContato,salario)
values ("jorge",24,"operador de caixa",8,21972046273,1500);
insert into tb_colaboradores(nome,idade,cargo,cargaHorariaDia,numeroContato,salario)
values ("Natanael",18,"estagiario",6,21837483735,1000);
SELECT 
    *
FROM
    tb_colaboradores
WHERE
    salario > 2000;
select * from tb_colaboradores where salario < 2000;
select * from tb_colaboradores;
UPDATE tb_colaboradores 
SET 
    salario = 2001
WHERE
    id = 2;

