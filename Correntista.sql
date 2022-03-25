create database revisao;

use revisao;

create table tbcorrentista(
ag int not null,
conta int not null,
nome varchar(50) not null,
email varchar(80) not null,
telefone char(11) not null,
saldo decimal(8,2) not null,
primary key (ag,conta));

describe tbcorrentista;

insert into tbcorrentista
(ag,conta,nome,email,telefone,saldo)
values
("1111","226860","João","joao@gmail.com","98153-0122","1000"),
("1234","223450","Daniela","daniela@ig.com.br","98153-0333","2000"),
("5678","226670","Júlia","julia@yahoo.com.br","98153-4567","5000");

select * from tbcorrentista;

use revisao;

create table tbfluxocaixa(
ag int not null,
conta int not null,
fluxo int not null,
entrada decimal(8,2) not null,
saida decimal(8,2) not null,
primary key(ag,conta,fluxo));

describe tbfluxocaixa;

insert into tbfluxocaixa
(ag,conta,fluxo,entrada,saida)
values
("1111","226860","100","100","200"),
("1234","223450","200","200","400"),
("5678","226670","300","300","600");

select * from tbfluxocaixa;
