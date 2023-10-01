CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;
CREATE TABLE tb_categorias (
    id_categoria INT AUTO_INCREMENT,
    nome_categoria VARCHAR(255) NOT NULL,
    descricao_categoria VARCHAR(255),
    PRIMARY KEY (id_categoria)
);
INSERT INTO tb_categorias (nome_categoria, descricao_categoria)
VALUES
    ('Medicamentos', 'Produtos farmacêuticos para tratamento de doenças'),
    ('Higiene', 'Produtos de higiene pessoal'),
    ('Cosméticos', 'Produtos de beleza e cuidados com a pele'),
    ('Vitaminas', 'Suplementos vitamínicos e minerais'),
    ('Alimentos', 'Produtos alimentícios para dietas especiais');
CREATE TABLE tb_produtos (
    id_produto INT AUTO_INCREMENT,
    nome_produto VARCHAR(255) NOT NULL,
    descricao_produto VARCHAR(255),
    valor DECIMAL(10, 2) NOT NULL CHECK (valor > 0),
    id_categoria INT NOT NULL,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias (id_categoria)
);
INSERT INTO tb_produtos (nome_produto, descricao_produto, valor, id_categoria)
VALUES
    ('Paracetamol', 'Analgésico para dor de cabeça', 10.00, 1),
    ('Sabonete', 'Sabonete líquido para banho', 5.50, 2),
    ('Creme Facial', 'Creme hidratante para o rosto', 20.00, 3),
    ('Vitamina C', 'Suplemento de vitamina C', 15.00, 4),
    ('Barra de Cereal', 'Lanche saudável', 3.50, 5),
    ('Ibuprofeno', 'Anti-inflamatório', 8.00, 1),
    ('Shampoo', 'Shampoo para cabelos', 6.50, 2),
    ('Protetor Solar', 'Protetor solar FPS 30', 25.00, 3);
SELECT nome_produto, valor
FROM tb_produtos
WHERE valor > 50.00;
SELECT nome_produto, valor
FROM tb_produtos
WHERE valor BETWEEN 5.00 AND 60.00;
SELECT nome_produto
FROM tb_produtos
WHERE nome_produto LIKE '%C%';
SELECT tb_produtos.nome_produto, tb_produtos.descricao_produto, tb_categorias.nome_categoria
FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria;
SELECT tb_produtos.nome_produto, tb_produtos.descricao_produto, tb_categorias.nome_categoria
FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Cosméticos';
