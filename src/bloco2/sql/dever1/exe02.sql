create database db_ecommerce;
use db_ecommerce;
CREATE TABLE tb_produtos (
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    precoDeVenda DECIMAL NOT NULL,
    precoDeCusto DECIMAL NOT NULL,
    descricao VARCHAR(255),
    primary key (id));
INSERT INTO tb_produtos (nome, quantidade, precoDeVenda, precoDeCusto)
VALUES
  ("Carregador de Celular", 10, 21, 14),
  ("Fone de Ouvido Bluetooth", 8, 40, 25),
  ("Power Bank 10000mAh", 12, 30, 20),
  ("Smartwatch", 6, 80, 55),
  ("Teclado sem Fio", 10, 35, 22),
  ("Mouse Óptico", 3, 15, 10),
  ("HD Externo 1TB", 7, 60, 40),
  ("Câmera de Segurança", 9, 70, 45);
  SELECT 
    *
FROM
    tb_produtos;
SELECT 
    *
FROM
    tb_produtos
WHERE
    precoDeVenda > 500;
select * from tb_produtos where precoDeVenda < 500;
update tb_produtos set precoDeVenda = 1200 where id>4;
