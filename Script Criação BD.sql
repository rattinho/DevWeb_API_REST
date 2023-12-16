CREATE TABLE Usuario (
    id SERIAL PRIMARY KEY,
    login VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    nome VARCHAR(255),
    afiliacao VARCHAR(255),
    perfil VARCHAR(255),
    senha VARCHAR(255)
);

CREATE TABLE Evento (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    sigla VARCHAR(10),
    descricao text
);

CREATE TABLE Edicao (
    id SERIAL PRIMARY KEY,
    ano INT NOT NULL,
    data_inicial DATE NOT NULL,
    data_final DATE NOT NULL,
    cidade VARCHAR(255) NOT NULL,
        organizador_id INT references Usuario(id),
   evento_id INT REFERENCES Evento(id)
);

CREATE TABLE Espaco (
  id SERIAL PRIMARY KEY, 
  nome VARCHAR (255), 
  localizacao TEXT, 
  capacidade INT
);


CREATE TABLE Atividade (
   id SERIAL PRIMARY KEY, 
   nome VARCHAR (255), 
   tipo VARCHAR (255), 
   descricao TEXT, 
   data_inicial DATE, 
   horario_inicial TIME, 
   horario_final TIME,
	espaco_id int references Espaco(id)
);


create table turmas (
	id SERIAL primary key,
	usuario_id int references Usuario(id),
	atividade_id int references Atividade(id)
);

create table edicao_atividade (
	id SERIAL primary key,
	edicao_id int references Edicao(id),
	atividade_id int references Atividade(id)
);

create table mensagem (
	id SERIAL primary key,
	owner_id int references Usuario(id),
	to_id int references Atividade(id),
	content VARCHAR (255)
);

