create database db_escola;
use db_escola;
CREATE TABLE tb_estudantes (
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    idade INT NOT NULL,
    serieEnsinoMedio INT,
    nota DECIMAL NOT NULL,
    dataNascimento DATE,
    endereco VARCHAR(255),
    situacao VARCHAR(255),
    primary key(id)
);

INSERT INTO tb_estudantes (nome, idade, serieEnsinoMedio, nota, dataNascimento, endereco)
VALUES
  ("Maria Silva", 16, 1, 9.5, '2007-03-15', 'Rua A, 123'),
  ("João Santos", 17, 2, 8.7, '2006-08-22', 'Avenida B, 456'),
  ("Pedro Vieira", 16, 3, 9.8, '2007-01-10', 'Rua C, 789'),
  ("Ana Oliveira", 18, 3, 2.2, '2005-10-30', 'Praça D, 789'),
  ("Luana Pereira", 17, 2, 8.9, '2006-07-05', 'Rua E, 987'),
  ("Gustavo Ribeiro", 16, 1, 9.3, '2007-05-20', 'Avenida F, 654'),
  ("Julia Martins", 18, 1, 3.8, '2005-12-14', 'Rua G, 555'),
  ("Lucas Costa", 16, 3, 5.7, '2007-02-28', 'Praça H, 234');

SELECT * from tb_estudantes;
SELECT * from tb_estudantes where nota > 7;
SELECT * from tb_estudantes where nota < 7;
update tb_estudantes set situacao = "Aprovado" where nota >= 7;
update tb_estudantes set situacao = "Reprovado" where nota < 7;
SELECT 
    *
FROM
    tb_estudantes;

