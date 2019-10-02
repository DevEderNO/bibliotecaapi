-- users SENHA admin
INSERT INTO usuario (id, nome, email, senha) 
	values
	(1, 'Administrador', 'admin@admin.com', '$2a$10$3y4RPg/.MZOCz9bsKoHtbOWmBlg4L43rLyU1ee/r0UeOg0Sa5SvzO'),
	(2, 'Usuario', 'usuario@usuario.com', '$2a$10$ty2/AZo9.V6OHWNVzDRPpexyxRWNTBbeR87Ag..r3qozSA1p64pEu');

-- roles
INSERT INTO permissao (id, descricao) 
	values
	(1, 'ROLE_INCLUIR_LIVRO'),
	(2, 'ROLE_ALTERAR_LIVRO'),
	(3, 'ROLE_EXCLUIR_LIVRO'),
	(4, 'ROLE_PESQUISAR_POR_ID_LIVRO'),
	(5, 'ROLE_LISTAR_LIVRO'),

	(6, 'ROLE_INCLUIR_GENERO'),
	(7, 'ROLE_ALTERAR_GENERO'),
	(8, 'ROLE_EXCLUIR_GENERO'),
	(9, 'ROLE_PESQUISAR_POR_ID_GENERO'),
	(10, 'ROLE_LISTAR_GENERO'),

	(11, 'ROLE_INCLUIR_AUTOR'),
	(12, 'ROLE_ALTERAR_AUTOR'),
	(13, 'ROLE_EXCLUIR_AUTOR'),
	(14, 'ROLE_PESQUISAR_POR_ID_AUTOR'),
	(15, 'ROLE_LISTAR_AUTOR'),

	(16, 'ROLE_INCLUIR_CLIENTE'),
	(17, 'ROLE_ALTERAR_CLIENTE'),
	(18, 'ROLE_EXCLUIR_CLIENTE'),
	(19, 'ROLE_PESQUISAR_POR_ID_CLIENTE'),
	(20, 'ROLE_LISTAR_CLIENTE'),

	(21, 'ROLE_INCLUIR_EDITORA'),
	(22, 'ROLE_ALTERAR_EDITORA'),
	(23, 'ROLE_EXCLUIR_EDITORA'),
	(24, 'ROLE_PESQUISAR_POR_ID_EDITORA'),
	(25, 'ROLE_LISTAR_EDITORA'),

	(26, 'ROLE_INCLUIR_EMPRESTIMO'),
	(27, 'ROLE_ALTERAR_EMPRESTIMO'),
	(28, 'ROLE_EXCLUIR_EMPRESTIMO'),
	(29, 'ROLE_PESQUISAR_POR_ID_EMPRESTIMO'),
	(30, 'ROLE_LISTAR_EMPRESTIMO'),

	(31, 'ROLE_INCLUIR_ENDERECO'),
	(32, 'ROLE_ALTERAR_ENDERECO'),
	(33, 'ROLE_EXCLUIR_ENDERECO'),
	(34, 'ROLE_PESQUISAR_POR_ID_ENDERECO'),
	(35, 'ROLE_LISTAR_ENDERECO');

-- ADMIN
INSERT INTO usuario_permissao (id_usuario, id_permissao) 
	values
	(1,1),
	(1,2),
	(1,3),
	(1,4),
	(1,5),
	(1,6),
	(1,7),
	(1,8),
	(1,9),
	(1,10),
	(1,11),
	(1,12),
	(1,13),
	(1,14),
	(1,15),
	(1,16),
	(1,17),
	(1,18),
	(1,19),
	(1,20),
	(1,21),
	(1,22),
	(1,23),
	(1,24),
	(1,25),
	(1,26),
	(1,27),
	(1,28),
	(1,29),
	(1,30),
	(1,31),
	(1,32),
	(1,33),
	(1,34),
	(1,35);

-- Usuario
INSERT INTO usuario_permissao (id_usuario, id_permissao) 
	values
	(2,4),
	(2,5),
	(2,9),
	(2,10),
	(2,14),
	(2,15),
	(2,19),
	(2,20),
	(2,24),
	(2,25),
	(2,29),
	(2,30),
	(2,34),
	(2,35);

insert into genero(descricao) 
	values
	('Ação'),
	('Drama'),
	('Terror'),
	('Ficção'),
	('Comedia');

insert into editora(nome) 
	values
	('Pearson'),
	('Reed Elsevier'),
	('ThomsonReuters'),
	('Wolters Kluwer'),
	('Hachette Livre');

insert into autor(nome,sexo) 
	values
	('Tacilia do Amaral',1),
	('Calos Drumond de andrad',0);