CREATE TABLE pessoa(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    ativo BOOLEAN NOT NULL,
    logradouro varchar(100),
    numero varchar(8),
    complemento varchar(20),
    bairro varchar(20),
    cep varchar(8),
    cidade varchar(10),
    estado varchar(2)
    
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome,ativo,logradouro,numero,complemento,bairro,cep,cidade,estado) 
values ('alesi',true, 'rua do uziel', 123, null, 'esqueleto paulo', '08142910', 'ararangua', 'SC');