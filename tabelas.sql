CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    usuario VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(50) NOT NULL
);

CREATE TABLE artista (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE musica (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    genero VARCHAR(50),
    id_artista INTEGER REFERENCES artista(id)
);

CREATE TABLE playlist (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    id_usuario INTEGER REFERENCES usuario(id)
);

CREATE TABLE musica_playlist (
    id_musica INTEGER REFERENCES musica(id),
    id_playlist INTEGER REFERENCES playlist(id),
    PRIMARY KEY (id_musica, id_playlist)
);

CREATE TABLE curtida (
    id SERIAL PRIMARY KEY,
    id_usuario INTEGER REFERENCES usuario(id),
    id_musica INTEGER REFERENCES musica(id),
    status BOOLEAN,
    data TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE historico_busca (
    id SERIAL PRIMARY KEY,
    id_usuario INTEGER REFERENCES usuario(id),
    id_musica INTEGER REFERENCES musica(id),
    data TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);