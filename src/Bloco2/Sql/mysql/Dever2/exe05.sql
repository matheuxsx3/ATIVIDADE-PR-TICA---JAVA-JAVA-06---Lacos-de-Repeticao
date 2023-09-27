CREATE DATABASE db_construindo_vidas;
USE db_construindo_vidas;
CREATE TABLE tb_categorias (
    id_categoria INT AUTO_INCREMENT,
    nome_categoria VARCHAR(255) NOT NULL,
    descricao_categoria VARCHAR(255),
    PRIMARY KEY (id_categoria)
);
INSERT INTO tb_categorias (nome_categoria, descricao_categoria)
VALUES
    ('Ferramentas', 'Ferramentas para construção e reforma'),
    ('Elétrica', 'Materiais elétricos e fios'),
    ('Hidráulica', 'Materiais hidráulicos e encanamentos'),
    ('Pintura', 'Tintas e acessórios para pintura'),
    ('Madeira', 'Materiais de madeira e marcenaria');
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
    ('Furadeira', 'Furadeira elétrica profissional', 180.00, 1),
    ('Fio Elétrico', 'Rolo de fio elétrico 20m', 80.00, 2),
    ('Tubo PVC', 'Tubo de PVC para encanamento', 15.00, 3),
    ('Tinta Látex', 'Lata de tinta látex branca', 40.00, 4),
    ('Viga de Madeira', 'Viga de madeira tratada', 120.00, 5),
    ('Martelo', 'Martelo de carpinteiro', 25.00, 1),
    ('Interruptor', 'Interruptor simples', 5.00, 2),
    ('Torneira', 'Torneira para pia de cozinha', 30.00, 3);
SELECT nome_produto, valor
FROM tb_produtos
WHERE valor > 100.00;
SELECT nome_produto, valor
FROM tb_produtos
WHERE valor BETWEEN 70.00 AND 150.00;
SELECT nome_produto
FROM tb_produtos
WHERE nome_produto LIKE '%C%';
SELECT tb_produtos.nome_produto, tb_produtos.descricao_produto, tb_categorias.nome_categoria
FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria;
SELECT tb_produtos.nome_produto, tb_produtos.descricao_produto, tb_categorias.nome_categoria
FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Hidráulica';