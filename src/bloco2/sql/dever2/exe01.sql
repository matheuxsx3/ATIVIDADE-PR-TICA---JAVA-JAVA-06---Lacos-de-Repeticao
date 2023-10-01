create database db_generation_game_online;
use db_generation_game_online;

CREATE TABLE tb_classes (
    id BIGINT AUTO_INCREMENT,
    classe VARCHAR(255) NOT NULL,
    descricaoClasse VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    poder_de_ataque int not null,
    poder_de_defesa int not null
);
CREATE TABLE tb_personagens (
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    habilidade VARCHAR(255),
    vigor INT NOT NULL,
    poder INT NOT NULL,
    id_classe BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_classe) REFERENCES tb_classes (id)
);

INSERT INTO tb_classes (classe, descricaoClasse,poder_de_ataque, poder_de_defesa)
VALUES
    ('Mago', 'Usuário de magia arcana',3000,1000),
    ('Guerreiro', 'Mestre em combate corpo a corpo',8000,500),
    ('arqueiro', 'Especialista em arco e flecha encantados',1000,7000),
    ('assassino', 'Especialista em furtividade',6000,1000),
    ('toxico', 'Especialista em armamentos tóxicos',10000,300);

INSERT INTO tb_personagens (nome, habilidade, vigor, poder, id_classe)
VALUES
    ('maximus', 'Magia poderosa', 100, 90, 1),
    ('gumball', 'arquinho sorrateiro', 95, 80, 3),
    ('darwin', 'Furto e astúcia', 70, 60, 4),
    ('heitor', 'Precisão com arco', 85, 75, 2),
    ('penny', 'Magia divina', 80, 70, 1),
    ('ben', 'Magia da natureza', 75, 85, 5),
    ('gwen', 'Entretenimento e charme', 60, 50, 4),
    ('rapunzel', 'Fé inquebrável', 90, 85, 5);

SELECT tb_personagens.nome, tb_personagens.habilidade, tb_classes.poder_de_ataque
FROM tb_personagens
INNER JOIN tb_classes ON tb_personagens.id_classe = tb_classes.id
WHERE tb_classes.poder_de_ataque > 2000;

SELECT tb_personagens.nome, tb_personagens.habilidade, tb_classes.poder_de_defesa
FROM tb_personagens
INNER JOIN tb_classes ON tb_personagens.id_classe = tb_classes.id
WHERE tb_classes.poder_de_defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nome LIKE "c%";
select * from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.id_classe order by tb_personagens.id;

SELECT 
    *
FROM
    tb_personagens
        INNER JOIN
    tb_classes ON tb_classes.id = tb_personagens.id_classe
WHERE
    tb_classes.classe = 'arqueiro';