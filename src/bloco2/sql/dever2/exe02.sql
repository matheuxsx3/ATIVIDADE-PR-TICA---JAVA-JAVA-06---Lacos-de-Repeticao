CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;
CREATE TABLE tb_categorias (
    id_categoria INT AUTO_INCREMENT,
    nome_categoria VARCHAR(255) NOT NULL,
    descricao_categoria VARCHAR(255),
    PRIMARY KEY (id_categoria)
);
INSERT INTO tb_categorias (nome_categoria, descricao_categoria)
VALUES
    ('Salgadas', 'Pizzas com recheios salgados'),
    ('Doces', 'Pizzas com recheios doces'),
    ('Vegetarianas', 'Pizzas com recheios vegetarianos'),
    ('Especiais', 'Pizzas especiais com ingredientes exclusivos'),
    ('Clássicas', 'Pizzas tradicionais');

CREATE TABLE tb_pizzas (
    id_pizza INT AUTO_INCREMENT,
    nome_pizza VARCHAR(255) NOT NULL,
    descricao_pizza VARCHAR(255),
    valor DECIMAL(10, 2) NOT NULL),
    id_categoria INT NOT NULL,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias (id_categoria)
);

INSERT INTO tb_pizzas (nome_pizza, descricao_pizza, valor, id_categoria)
VALUES
    ('Margherita', 'Molho de tomate, mussarela e manjericão', 45.00, 5),
    ('Pepperoni', 'Molho de tomate, pepperoni e queijo', 55.00, 1),
    ('Calabresa', 'Molho de tomate, calabresa e cebola', 40.00, 1),
    ('Chocolate', 'Chocolate, morango e chantilly', 60.00, 2),
    ('Vegetariana', 'Molho de tomate, vegetais frescos', 45.00, 3),
    ('Frango com Catupiry', 'Molho de tomate, frango e catupiry', 50.00, 4),
    ('Quatro Queijos', 'Molho de tomate e quatro tipos de queijo', 50.00, 1),
    ('Portuguesa', 'Molho de tomate, presunto, ovo, azeitona e cebola', 45.00, 5);

SELECT nome_pizza, valor
FROM tb_pizzas
WHERE valor > 45.00;

SELECT nome_pizza, valor
FROM tb_pizzas
WHERE valor BETWEEN 50.00 AND 100.00;

SELECT nome_pizza
FROM tb_pizzas
WHERE nome_pizza LIKE '%M%';

SELECT tb_pizzas.nome_pizza, tb_pizzas.descricao_pizza, tb_categorias.nome_categoria
FROM tb_pizzas
INNER JOIN tb_categorias ON tb_pizzas.id_categoria = tb_categorias.id_categoria;

SELECT tb_pizzas.nome_pizza, tb_pizzas.descricao_pizza, tb_categorias.nome_categoria
FROM tb_pizzas
INNER JOIN tb_categorias ON tb_pizzas.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Doces';
