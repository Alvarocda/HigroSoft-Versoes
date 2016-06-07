# HigroSoft-Versoes
Strings SQL:
Fazer na seguinte sequencia:

1)
CREATE SEQUENCE public.agendamentos_id_agendamento_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.agendamentos_id_agendamento_seq
  OWNER TO postgres;
  
  2)
  CREATE SEQUENCE public.culturas_id_cultura_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.culturas_id_cultura_seq
  OWNER TO postgres;
  
  3)
  CREATE SEQUENCE public.dados_arduino_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.dados_arduino_id_seq
  OWNER TO postgres;
  
  4)
  CREATE SEQUENCE public.usuario_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.usuario_id_seq
  OWNER TO postgres;
  
  5)
  CREATE TABLE public.usuario
(
  id integer NOT NULL DEFAULT nextval('usuario_id_seq'::regclass),
  email character varying NOT NULL,
  senha character varying,
  CONSTRAINT usuario_pkey PRIMARY KEY (email)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.usuario
  OWNER TO postgres;
  
  6)
  
CREATE TABLE public.dados_arduino
(
  id integer NOT NULL DEFAULT nextval('dados_arduino_id_seq'::regclass),
  temperatura integer,
  umidade integer,
  hora time without time zone,
  data character varying,
  CONSTRAINT dados_arduino_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.dados_arduino
  OWNER TO postgres;

7)

CREATE TABLE public.culturas
(
  nome_cultura character varying NOT NULL,
  umidade_minima integer,
  id_cultura integer NOT NULL DEFAULT nextval('culturas_id_cultura_seq'::regclass),
  usuario_que_adicionou character varying,
  frequencia_agua character varying,
  frequencia_fertilizante character varying,
  CONSTRAINT culturas_pkey PRIMARY KEY (id_cultura)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.culturas
  OWNER TO postgres;
  
  8)
  CREATE TABLE public.agendamentos
(
  id_agendamento integer NOT NULL DEFAULT nextval('agendamentos_id_agendamento_seq'::regclass),
  id_cultura_agendada integer,
  dia_inicial integer,
  mes_inicial integer,
  dia_final integer,
  mes_final integer,
  usuario_que_agendou character varying,
  ano_inicial integer,
  ano_final integer,
  em_andamento boolean,
  CONSTRAINT agendamentos_pkey PRIMARY KEY (id_agendamento),
  CONSTRAINT agendamentos_id_cultura_agendada_fkey FOREIGN KEY (id_cultura_agendada)
      REFERENCES public.culturas (id_cultura) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT agendamentos_usuario_que_agendou_fkey FOREIGN KEY (usuario_que_agendou)
      REFERENCES public.usuario (email) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.agendamentos
  OWNER TO postgres;
