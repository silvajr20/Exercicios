create table marca(
	id_marca int not null,
	descricao varchar(50),
	primary key(id_marca)


);

insert into marca values (1, 'Volkswagen');
insert into marca values (2, 'Chevrolet');	
insert into marca values (3, 'Ford');
insert into marca values (4, 'Renault');
insert into marca values (5, 'Jac');
insert into marca values (6, 'Fiat');
insert into marca values (7, 'Honda');
insert into marca values (8, 'Nissan');
insert into marca values (9, 'hyundai');
insert into marca values (10, 'peugeot');


create table veiculo(
	id int not null,
	veiculo varchar(30),
	marca int,
	ano int,
	descricao varchar(50),
	vendido boolean,
	created datetime,
	updated datetime,
	primary key(id),
	foreign key (marca) references marca(id_marca)

);



insert into veiculo values (1, 'Uno', 6, 2021, 'carro de passeio', false, '2021-03-21', '2021-03-25');
insert into veiculo values (2, 'Gol', 1, 2005, 'carro de passeio', false, '2021-02-15', '2021-02-20');
insert into veiculo values (3, 'Ka', 3, 1995, 'carro de passeio', true, '1990-02-15', '1990-02-20');	
insert into veiculo values (4, 'Fusca', 1, 1985, 'carro de passeio', true, '1980-02-15', '1980-02-20');
insert into veiculo values (5, 'Chevette', 2, 1975, 'carro de passeio', true, '1970-02-15', '1970-02-20');


