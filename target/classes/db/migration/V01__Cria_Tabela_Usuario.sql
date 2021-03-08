  create table usuario (
  id int primary key auto_increment,
  nome varchar(200) not null,
  idade int(3) not null,
  profissao varchar(350) not null

) engine=InnoDB default charset=utf8;

INSERT INTO usuario.usuario
(nome, idade, profissao)
VALUES('rodrigo', 24, 'developer');
