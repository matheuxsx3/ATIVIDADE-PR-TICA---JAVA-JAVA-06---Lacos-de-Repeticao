CREATE DATABASE db_cidade_das_carnes; 
USE db_cidade_das_carnes; 
CREATE TABLE tb_categorias (
    id_categoria INT AUTO_INCREMENT,
    nome_categoria VARCHAR(255) NOT NULL,
    descricao_categoria VARCHAR(255),
    PRIMARY KEY (id_categoria)
);
INSERT INTO tb_categorias (nome_categoria, descricao_categoria)
VALUES
    ('Carnes Bovinas', 'Carnes de gado para churrasco e cozimento'),
    ('Carnes Suínas', 'Carnes de porco e derivados'),
    ('Frutas', 'Variedade de frutas frescas'),
    ('Verduras', 'Diversos tipos de verduras e folhas'),
    ('Aves', 'Frangos e aves diversas');
CREATE TABLE tb_produtos (
    id_produto INT AUTO_INCREMENT,
    nome_produto VARCHAR(255) NOT NULL,
    descricao_produto VARCHAR(255),
    valor DECIMAL(10, 2) NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias (id_categoria)
);
INSERT INTO tb_produtos (nome_produto, descricao_produto, valor, id_categoria)
VALUES
    ('Picanha', 'Picanha premium para churrasco', 70.00, 1),
    ('Lombo', 'Lombo suíno fresco', 45.00, 2),
    ('Maçãs', 'Maçãs vermelhas e verdes', 5.00, 3),
    ('Alface', 'Alface crespa e lisa', 2.50, 4),
    ('Peito de Frango', 'Peito de frango sem pele', 12.00, 5),
    ('Costela de Porco', 'Costela de porco defumada', 40.00, 2),
    ('Bananas', 'Bananas maduras', 4.00, 3),
    ('Cenouras', 'Cenouras frescas', 3.00, 4);
SELECT nome_produto, valor
FROM tb_produtos
WHERE valor > 50.00;
SELECT nome_produto, valor
FROM tb_produtos
WHERE valor BETWEEN 50.00 AND 150.00;

SELECT nome_produto
FROM tb_produtos
WHERE nome_produto LIKE '%C%';
SELECT tb_produtos.nome_produto, tb_produtos.descricao_produto, tb_categorias.nome_categoria
FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria;
SELECT tb_produtos.nome_produto, tb_produtos.descricao_produto, tb_categorias.nome_categoria
FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria IN ('Aves');