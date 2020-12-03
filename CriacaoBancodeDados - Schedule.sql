
CREATE TABLE IF NOT EXISTS agenda (
    id_agenda SERIAL NOT NULL,
    nome_agendado VARCHAR(150),
    servico_agendado VARCHAR(50),
    horario_agendado VARCHAR(10),
    data_agenda VARCHAR(10),
    PRIMARY KEY (id_agenda)
);


CREATE TABLE IF NOT EXISTS cliente (
    id_cliente SERIAL NOT NULL,
    nome_cliente VARCHAR(150),
    email_cliente VARCHAR(50),
    usuario VARCHAR(50),
    senha VARCHAR(50),
    situacao_cliente VARCHAR(15),
    PRIMARY KEY (id_cliente)
);


CREATE TABLE IF NOT EXISTS servico (
    id_servico SERIAL NOT NULL,
    nome_servico VARCHAR(45),
    valor_servico VARCHAR(6),
    tempo_servico VARCHAR(4),
    PRIMARY KEY (id_servico)
);


CREATE TABLE IF NOT EXISTS login (
    id SERIAL NOT NULL,
    usuario VARCHAR(50),
    senha VARCHAR(50)
);


CREATE TABLE IF NOT EXISTS cliente_agenda (
    id_cliente SERIAL NOT NULL,
    id_agenda SERIAL NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente),
	FOREIGN KEY (id_agenda) REFERENCES agenda (id_agenda)
);


CREATE TABLE IF NOT EXISTS servico_agenda (
    id_servico SERIAL NOT NULL,
    id_agenda SERIAL NOT NULL,
    FOREIGN KEY (id_servico) REFERENCES servico (id_servico),
	FOREIGN KEY (id_agenda) REFERENCES agenda (id_agenda)
);


-- Exemplo de cadastro de cliente:

INSERT INTO cliente VALUES ( default, 'Tiago Wermann','tiago@gmail.com', 'tiago', MD5('1234'), 0 )