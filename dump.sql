CREATE TABLE IF NOT EXISTS tb_product
(
    id          INT          NOT NULL,
    name        VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    price       NUMERIC(10, 2),
    isbn        VARCHAR(17) NOT NULL
);

ALTER TABLE tb_product
    ADD CONSTRAINT PK_Product PRIMARY KEY (id);

CREATE SEQUENCE tb_product_id_seq;

ALTER TABLE tb_product
    ALTER column id SET DEFAULT nextval('tb_product_id_seq');
    
INSERT INTO tb_product VALUES
  (1,'Java 8 Prático','Novos recursos da linguagem','59.90','978-85-66250-46-6'),
  (2,'Java SE 7 Programmer I','O guia para sua certificação','59.90','123-45-67890-11-2'),
  (3,'Test-Driven Development','Teste e Design no Mundo Real','59.90','123-45-67890-11-2'),
  (4,'Lógica de Programação','Crie seus primeiros programas','59.90','978-85-66250-22-0')
  (5,'Thoughtworks Antologia','Histórias de aprendizado','59.90','123-45-67890-11-2'),
  (6,'Jogos em HTML5','Explore o mobile e física','59.90','123-45-67890-11-2'),
  (7,'UX Design','Introdução e boas práticas','59.90','978-85-66250-48-0'),
  (8,'O Programador Apaixonado','Construindo uma carreira notável','59.90','978-85-66250-44-2'),
  (9,'Google Android','crie aplicações para celulares','59.90','978-85-66250-02-2'),
  (10,'HTML5 e CSS3','Domine a web do futuro','59.90','978-85-66250-05-3'),
  (11,'JSF e JPA','Aplicações Java para a web','59.90','978-85-66250-01-5'),
  (12,'A Web Mobile','Programe para um mundo de muitos dispositivos','59.90','978-85-66250-23-7'),
  (13,'Desbravando Java e OO','Um guia para o iniciante da linguagem','59.90','123-45-67890-11-2');