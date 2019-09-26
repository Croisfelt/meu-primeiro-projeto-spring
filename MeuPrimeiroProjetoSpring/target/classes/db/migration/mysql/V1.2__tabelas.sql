CREATE TABLE `empresa` (
id bigint(20) AUTO_INCREMENT PRIMARY KEY,
cnpj varchar(255) NOT NULL,
data_atualizacao datetime NOT NULL,
data_criacao datetime NOT NULL,
razao_social varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=`utf8`;




CREATE TABLE `funcionario` (
  id bigint(20) AUTO_INCREMENT PRIMARY KEY,
  nome varchar(250) NOT NULL,
  email varchar(250) NOT NULL,
  senha varchar(50) NOT NULL,
  cpf varchar(11) NOT NULL,
  valorHora float NOT NULL,
  qtdHorasTrabalhoDia float NOT NULL,
  qtdHorasAlmoco float NOT NULL,
  dataCriacao datetime NOT NULL,
  dataAtualiacao datetime NOT NULL,
  PerfilEnum varchar(250) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = `utf8`;





