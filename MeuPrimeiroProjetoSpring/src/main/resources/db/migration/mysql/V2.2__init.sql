
INSERT INTO `empresa` (`id`, `cnpj`, `data_atualizacao`, `data_criacao`, `razao_social`) 
VALUES (NULL, '123', CURRENT_DATE(), CURRENT_DATE(), 'Uni-FACEF');


INSERT INTO `funcionario` (`id`, `nome`, `email`, `senha`, `cpf`, `valorHora`,`qtdHorasTrabalhoDia`,`qtdHorasAlmoco`,`dataCriacao`,`dataAtualiacao`,`PerfilEnum`) 
VALUES (NULL, 'João da Silva','joao@joao.com.br','abc123','22222222222',15.6,8,1,CURRENT_DATE(), CURRENT_DATE(), '54');
