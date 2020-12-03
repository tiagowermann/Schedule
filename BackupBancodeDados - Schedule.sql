--
-- PostgreSQL database dump
--

-- Dumped from database version 11.2
-- Dumped by pg_dump version 11.2

-- Started on 2020-12-02 23:55:52

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2885 (class 1262 OID 32876)
-- Name: schedule; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE schedule WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';


ALTER DATABASE schedule OWNER TO postgres;

\connect schedule

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 203 (class 1259 OID 57587)
-- Name: agenda; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.agenda (
    id_agenda integer NOT NULL,
    nome_agendado character varying(150),
    servico_agendado character varying(50),
    horario_agendado character varying(10),
    data_agenda character varying(10)
);


ALTER TABLE public.agenda OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 57585)
-- Name: agenda_id_agenda_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.agenda_id_agenda_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.agenda_id_agenda_seq OWNER TO postgres;

--
-- TOC entry 2886 (class 0 OID 0)
-- Dependencies: 202
-- Name: agenda_id_agenda_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.agenda_id_agenda_seq OWNED BY public.agenda.id_agenda;


--
-- TOC entry 199 (class 1259 OID 57531)
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente (
    id_cliente integer NOT NULL,
    nome_cliente character varying(150),
    email_cliente character varying(50),
    usuario character varying(50),
    senha character varying(50),
    situacao_cliente character varying(15)
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 57607)
-- Name: cliente_agenda; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente_agenda (
    id_cliente integer NOT NULL,
    id_agenda integer NOT NULL
);


ALTER TABLE public.cliente_agenda OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 57605)
-- Name: cliente_agenda_id_agenda_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cliente_agenda_id_agenda_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_agenda_id_agenda_seq OWNER TO postgres;

--
-- TOC entry 2887 (class 0 OID 0)
-- Dependencies: 205
-- Name: cliente_agenda_id_agenda_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cliente_agenda_id_agenda_seq OWNED BY public.cliente_agenda.id_agenda;


--
-- TOC entry 204 (class 1259 OID 57603)
-- Name: cliente_agenda_id_cliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cliente_agenda_id_cliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_agenda_id_cliente_seq OWNER TO postgres;

--
-- TOC entry 2888 (class 0 OID 0)
-- Dependencies: 204
-- Name: cliente_agenda_id_cliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cliente_agenda_id_cliente_seq OWNED BY public.cliente_agenda.id_cliente;


--
-- TOC entry 198 (class 1259 OID 57529)
-- Name: cliente_id_cliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cliente_id_cliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_id_cliente_seq OWNER TO postgres;

--
-- TOC entry 2889 (class 0 OID 0)
-- Dependencies: 198
-- Name: cliente_id_cliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cliente_id_cliente_seq OWNED BY public.cliente.id_cliente;


--
-- TOC entry 197 (class 1259 OID 41077)
-- Name: login; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.login (
    id integer NOT NULL,
    usuario character varying(50),
    senha character varying(50)
);


ALTER TABLE public.login OWNER TO postgres;

--
-- TOC entry 196 (class 1259 OID 41075)
-- Name: login_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.login_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.login_id_seq OWNER TO postgres;

--
-- TOC entry 2890 (class 0 OID 0)
-- Dependencies: 196
-- Name: login_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.login_id_seq OWNED BY public.login.id;


--
-- TOC entry 201 (class 1259 OID 57539)
-- Name: servico; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.servico (
    id_servico integer NOT NULL,
    nome_servico character varying(45),
    valor_servico character varying(6),
    tempo_servico character varying(4)
);


ALTER TABLE public.servico OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 73856)
-- Name: servico_agenda; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.servico_agenda (
    id_servico integer NOT NULL,
    id_agenda integer NOT NULL
);


ALTER TABLE public.servico_agenda OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 73854)
-- Name: servico_agenda_id_agenda_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.servico_agenda_id_agenda_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.servico_agenda_id_agenda_seq OWNER TO postgres;

--
-- TOC entry 2891 (class 0 OID 0)
-- Dependencies: 208
-- Name: servico_agenda_id_agenda_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.servico_agenda_id_agenda_seq OWNED BY public.servico_agenda.id_agenda;


--
-- TOC entry 207 (class 1259 OID 73852)
-- Name: servico_agenda_id_servico_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.servico_agenda_id_servico_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.servico_agenda_id_servico_seq OWNER TO postgres;

--
-- TOC entry 2892 (class 0 OID 0)
-- Dependencies: 207
-- Name: servico_agenda_id_servico_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.servico_agenda_id_servico_seq OWNED BY public.servico_agenda.id_servico;


--
-- TOC entry 200 (class 1259 OID 57537)
-- Name: servico_id_servico_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.servico_id_servico_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.servico_id_servico_seq OWNER TO postgres;

--
-- TOC entry 2893 (class 0 OID 0)
-- Dependencies: 200
-- Name: servico_id_servico_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.servico_id_servico_seq OWNED BY public.servico.id_servico;


--
-- TOC entry 2722 (class 2604 OID 57590)
-- Name: agenda id_agenda; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agenda ALTER COLUMN id_agenda SET DEFAULT nextval('public.agenda_id_agenda_seq'::regclass);


--
-- TOC entry 2720 (class 2604 OID 57534)
-- Name: cliente id_cliente; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente ALTER COLUMN id_cliente SET DEFAULT nextval('public.cliente_id_cliente_seq'::regclass);


--
-- TOC entry 2723 (class 2604 OID 57610)
-- Name: cliente_agenda id_cliente; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente_agenda ALTER COLUMN id_cliente SET DEFAULT nextval('public.cliente_agenda_id_cliente_seq'::regclass);


--
-- TOC entry 2724 (class 2604 OID 57611)
-- Name: cliente_agenda id_agenda; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente_agenda ALTER COLUMN id_agenda SET DEFAULT nextval('public.cliente_agenda_id_agenda_seq'::regclass);


--
-- TOC entry 2719 (class 2604 OID 41080)
-- Name: login id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.login ALTER COLUMN id SET DEFAULT nextval('public.login_id_seq'::regclass);


--
-- TOC entry 2721 (class 2604 OID 57542)
-- Name: servico id_servico; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servico ALTER COLUMN id_servico SET DEFAULT nextval('public.servico_id_servico_seq'::regclass);


--
-- TOC entry 2725 (class 2604 OID 73859)
-- Name: servico_agenda id_servico; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servico_agenda ALTER COLUMN id_servico SET DEFAULT nextval('public.servico_agenda_id_servico_seq'::regclass);


--
-- TOC entry 2726 (class 2604 OID 73860)
-- Name: servico_agenda id_agenda; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servico_agenda ALTER COLUMN id_agenda SET DEFAULT nextval('public.servico_agenda_id_agenda_seq'::regclass);


--
-- TOC entry 2873 (class 0 OID 57587)
-- Dependencies: 203
-- Data for Name: agenda; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (10, 'JOÃO SILVEIRA', 'SERVIÇO DE MOLEJO', '07:30', '20/05/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (11, 'SERGIO CAPALONGA', 'SERVIÇO DE MOLEJO', '10:30', '25/05/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (9, 'LORENO FAGUNDES', 'SERVIÇO DE BALANÇA', '07:40', '25/05/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (12, 'JOSEFINA DA SILVA', 'SERVIÇO DE ARQUEAR', '10:00', '11/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (23, 'JOSEFINA DA SILVA', 'SERVIÇO DE BALANÇA', '15:00', '20/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (24, 'SERGIO CAPALONGA', 'SERVIÇO DE BICO DE CORTE', '08:00', '11/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (25, 'JUNIOR DA FONCECA', 'SERVIÇO DE MOLEJO', '08:30', '18/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (26, 'JOÃO SILVEIRA', 'SERVIÇO DE SUPORTE', '08:45', '18/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (27, 'TIAGO MORAES', 'SERVIÇO DE SUPORTE', '07:30', '17/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (28, 'JUNIOR DA FONCECA', 'SERVIÇO DE ARQUEAR', '08:50', '17/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (29, 'TIAGO WERMANN', 'SERVIÇO DE BALANÇA', '07:30', '17/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (30, 'LORENO FAGUNDES', 'SERVIÇO DE EMBUCHAMENTO', '08:00', '17/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (32, 'JOÃO SILVEIRA', 'SERVIÇO DE EMBUCHAMENTO', '08:00', '18/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (33, 'SERGIO CAPALONGA', 'SERVIÇO DE EMBUCHAMENTO', '08:50', '16/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (34, 'JOÃO SILVEIRA', 'SERVIÇO DE BRAÇO TENSOR', '08:00', '18/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (35, 'SERGIO CAPALONGA', 'SERVIÇO DE ARQUEAR', '08:30', '18/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (40, 'TIAGO MORAES', 'SERVIÇO DE BALANÇA', '08:00', '22/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (41, 'SERGIO CAPALONGA', 'SERVIÇO DE BALANÇA', '08:00', '22/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (42, 'LORENO FAGUNDES', 'SERVIÇO DE BRAÇO TENSOR', '09:00', '22/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (43, 'JOÃO SILVEIRA', 'SERVIÇO DE BALANÇA', '08:00', '23/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (44, 'LORENO FAGUNDES', 'SERVIÇO DE EMBUCHAMENTO', '08:30', '23/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (45, 'JUNIOR DA FONCECA', 'SERVIÇO DE ARQUEAR', '07:30', '23/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (46, 'RODOLFO DA SILVA', 'SERVIÇO DE MOLEJO', '08:00', '23/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (31, 'LORENO FAGUNDES', 'SERVIÇO DE EMBUCHAMENTO', '09:00', '21/10/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (13, 'JUCA BALA', 'SERVIÇO DE BRAÇO TENSOR', '10:00', '16/06/2020');
INSERT INTO public.agenda (id_agenda, nome_agendado, servico_agendado, horario_agendado, data_agenda) VALUES (47, 'RODOLFO DA SILVA', 'SERVIÇO DE MOLEJO', '09:30', '03/11/2020');


--
-- TOC entry 2869 (class 0 OID 57531)
-- Dependencies: 199
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (11, 'TIAGO MORAES', 'tiagom@gmail.com', 'tiagom', 'aa1bf4646de67fd9086cf6c79007026c', '1');
INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (7, 'SERGIO CAPALONGA', 'sergio@gmail.com', 'sergioc', '06afa6c8b54d3cc80d269379d8b6a078', '1');
INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (12, 'RODOLFO DA SILVA', 'rodolfo@gmail.com', 'rodolfo', 'aa1bf4646de67fd9086cf6c79007026c', '1');
INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (9, 'LORENO FAGUNDES', 'loreno@hotmail.com', 'lorenof', '81dc9bdb52d04dc20036dbd8313ed055', '1');
INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (8, 'JOÃO SILVEIRA', 'joao@gmail.com', 'joaosilveira', '81dc9bdb52d04dc20036dbd8313ed055', '1');
INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (6, 'JUNIOR DA FONCECA', 'junior@gmail.com', 'juniorf', 'aa1bf4646de67fd9086cf6c79007026c', '1');
INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (5, 'JOSEFINA DA SILVA', 'josefina@gmail.com', 'josefina', '81dc9bdb52d04dc20036dbd8313ed055', '1');
INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (4, 'JUCA BALA', 'juca@gmail.com', 'juca', '81dc9bdb52d04dc20036dbd8313ed055', '1');
INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (1, 'TIAGO WERMANN', 'tiago@gmail.com', 'tiago', '81dc9bdb52d04dc20036dbd8313ed055', '1');
INSERT INTO public.cliente (id_cliente, nome_cliente, email_cliente, usuario, senha, situacao_cliente) VALUES (10, 'CARLOS LOMBARDI', 'carloslombardi@gmailcom', 'carlos', 'f3aa334b5e1c189cbab4393627825cd2', '1');


--
-- TOC entry 2876 (class 0 OID 57607)
-- Dependencies: 206
-- Data for Name: cliente_agenda; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2867 (class 0 OID 41077)
-- Dependencies: 197
-- Data for Name: login; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.login (id, usuario, senha) VALUES (1, 'postgres', '1234');


--
-- TOC entry 2871 (class 0 OID 57539)
-- Dependencies: 201
-- Data for Name: servico; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.servico (id_servico, nome_servico, valor_servico, tempo_servico) VALUES (2, 'SERVIÇO DE MOLEJO', '90,00', '0:45');
INSERT INTO public.servico (id_servico, nome_servico, valor_servico, tempo_servico) VALUES (4, 'SERVIÇO DE BALANÇA', '80,00', '1:00');
INSERT INTO public.servico (id_servico, nome_servico, valor_servico, tempo_servico) VALUES (3, 'SERVIÇO DE EMBUCHAMENTO', '130,00', '1:30');
INSERT INTO public.servico (id_servico, nome_servico, valor_servico, tempo_servico) VALUES (5, 'SERVIÇO DE BRAÇO TENSOR', '70,00', '0:40');
INSERT INTO public.servico (id_servico, nome_servico, valor_servico, tempo_servico) VALUES (6, 'SERVIÇO DE ARQUEAR', '150,00', '1:30');
INSERT INTO public.servico (id_servico, nome_servico, valor_servico, tempo_servico) VALUES (7, 'SERVIÇO DE SUPORTE', '70,00', '0:40');
INSERT INTO public.servico (id_servico, nome_servico, valor_servico, tempo_servico) VALUES (8, 'SERVIÇO DE BICO DE CORTE', '60,00', '0:30');
INSERT INTO public.servico (id_servico, nome_servico, valor_servico, tempo_servico) VALUES (9, 'SERVIÇO DE SOLDA', '50,00', '0:30');


--
-- TOC entry 2879 (class 0 OID 73856)
-- Dependencies: 209
-- Data for Name: servico_agenda; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2894 (class 0 OID 0)
-- Dependencies: 202
-- Name: agenda_id_agenda_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.agenda_id_agenda_seq', 47, true);


--
-- TOC entry 2895 (class 0 OID 0)
-- Dependencies: 205
-- Name: cliente_agenda_id_agenda_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cliente_agenda_id_agenda_seq', 1, false);


--
-- TOC entry 2896 (class 0 OID 0)
-- Dependencies: 204
-- Name: cliente_agenda_id_cliente_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cliente_agenda_id_cliente_seq', 1, false);


--
-- TOC entry 2897 (class 0 OID 0)
-- Dependencies: 198
-- Name: cliente_id_cliente_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cliente_id_cliente_seq', 12, true);


--
-- TOC entry 2898 (class 0 OID 0)
-- Dependencies: 196
-- Name: login_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.login_id_seq', 2, true);


--
-- TOC entry 2899 (class 0 OID 0)
-- Dependencies: 208
-- Name: servico_agenda_id_agenda_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.servico_agenda_id_agenda_seq', 1, false);


--
-- TOC entry 2900 (class 0 OID 0)
-- Dependencies: 207
-- Name: servico_agenda_id_servico_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.servico_agenda_id_servico_seq', 1, false);


--
-- TOC entry 2901 (class 0 OID 0)
-- Dependencies: 200
-- Name: servico_id_servico_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.servico_id_servico_seq', 13, true);


--
-- TOC entry 2740 (class 2606 OID 57592)
-- Name: agenda agenda_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agenda
    ADD CONSTRAINT agenda_pkey PRIMARY KEY (id_agenda);


--
-- TOC entry 2730 (class 2606 OID 57536)
-- Name: cliente cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente);


--
-- TOC entry 2732 (class 2606 OID 65663)
-- Name: cliente const_email_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT const_email_cliente UNIQUE (email_cliente);


--
-- TOC entry 2736 (class 2606 OID 65665)
-- Name: servico const_nome_servico; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servico
    ADD CONSTRAINT const_nome_servico UNIQUE (nome_servico);


--
-- TOC entry 2734 (class 2606 OID 65661)
-- Name: cliente const_usuario; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT const_usuario UNIQUE (usuario);


--
-- TOC entry 2728 (class 2606 OID 41082)
-- Name: login login_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.login
    ADD CONSTRAINT login_pkey PRIMARY KEY (id);


--
-- TOC entry 2738 (class 2606 OID 57544)
-- Name: servico servico_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servico
    ADD CONSTRAINT servico_pkey PRIMARY KEY (id_servico);


--
-- TOC entry 2742 (class 2606 OID 57617)
-- Name: cliente_agenda cliente_agenda_id_agenda_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente_agenda
    ADD CONSTRAINT cliente_agenda_id_agenda_fkey FOREIGN KEY (id_agenda) REFERENCES public.agenda(id_agenda);


--
-- TOC entry 2741 (class 2606 OID 57612)
-- Name: cliente_agenda cliente_agenda_id_cliente_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente_agenda
    ADD CONSTRAINT cliente_agenda_id_cliente_fkey FOREIGN KEY (id_cliente) REFERENCES public.cliente(id_cliente);


--
-- TOC entry 2744 (class 2606 OID 73866)
-- Name: servico_agenda servico_agenda_id_agenda_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servico_agenda
    ADD CONSTRAINT servico_agenda_id_agenda_fkey FOREIGN KEY (id_agenda) REFERENCES public.agenda(id_agenda);


--
-- TOC entry 2743 (class 2606 OID 73861)
-- Name: servico_agenda servico_agenda_id_servico_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.servico_agenda
    ADD CONSTRAINT servico_agenda_id_servico_fkey FOREIGN KEY (id_servico) REFERENCES public.servico(id_servico);


-- Completed on 2020-12-02 23:55:53

--
-- PostgreSQL database dump complete
--

