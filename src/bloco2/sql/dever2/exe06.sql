CREATE DATABASE db_curso_da_minha_vida;
USE db_curso_da_minha_vida;
CREATE TABLE tb_categorias (
    id_categoria INT AUTO_INCREMENT,
    nome_categoria VARCHAR(255) NOT NULL,
    descricao_categoria VARCHAR(255),
    PRIMARY KEY (id_categoria)
);
INSERT INTO tb_categorias (nome_categoria, descricao_categoria)
VALUES
    ('Programação', 'Cursos de programação e desenvolvimento de software'),
    ('Design Gráfico', 'Cursos de design e criação gráfica'),
    ('Marketing Digital', 'Cursos de marketing online e estratégias digitais'),
    ('Idiomas', 'Cursos de aprendizado de línguas estrangeiras'),
    ('Negócios', 'Cursos de administração e empreendedorismo');

CREATE TABLE tb_cursos (
    id_curso INT AUTO_INCREMENT,
    nome_curso VARCHAR(255) NOT NULL,
    descricao_curso VARCHAR(255),
    preco DECIMAL(10, 2) NOT NULL),
    id_categoria INT NOT NULL,
    PRIMARY KEY (id_curso),
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias (id_categoria)
);
INSERT INTO tb_cursos (nome_curso, descricao_curso, preco, id_categoria)
VALUES
    ('Curso de Desenvolvimento Web', 'Aprenda a criar sites e aplicativos', 699.99, 1),
    ('Curso de Photoshop Avançado', 'Domine as técnicas avançadas de edição de imagens', 599.99, 2),
    ('Curso de Marketing de Conteúdo', 'Estratégias de marketing de conteúdo para negócios', 899.99, 3),
    ('Curso de Inglês Avançado', 'Aprimore suas habilidades no idioma inglês', 799.99, 4),
    ('Curso de Gestão Empresarial', 'Conceitos de administração e empreendedorismo', 799.99, 5),
    ('Curso de Python para Iniciantes', 'Introdução à programação com Python', 499.99, 1),
    ('Curso de Ilustração Digital', 'Técnicas de ilustração e design digital', 699.99, 2),
    ('Curso de SEO e Marketing Online', 'Estratégias de otimização para motores de busca', 899.99, 3);
SELECT nome_curso, preco
FROM tb_cursos
WHERE preco > 500.00;
SELECT nome_curso, preco
FROM tb_cursos
WHERE preco BETWEEN 600.00 AND 1000.00;
select nome_curso
FROM tb_cursos
WHERE nome_curso LIKE '%J%';
SELECT tb_cursos.nome_curso, tb_cursos.descricao_curso, tb_categorias.nome_categoria
FROM tb_cursos
INNER JOIN tb_categorias ON tb_cursos.id_categoria = tb_categorias.id_categoria;
SELECT tb_cursos.nome_curso, tb_cursos.descricao_curso, tb_categorias.nome_categoria
FROM tb_cursos
INNER JOIN tb_categorias ON tb_cursos.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Java';