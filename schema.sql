CREATE DATABASE "Pets"
WITH
OWNER = postgres
ENCODING = 'UTF8'
LC_COLLATE = 'Russian_Russia.1251'
LC_CTYPE = 'Russian_Russia.1251'
TABLESPACE = pg_default
CONNECTION LIMIT = -1;

CREATE TABLE public.masters
(
  master_id bigint NOT NULL DEFAULT nextval('masters_master_id_seq'::regclass),
  master_name text COLLATE pg_catalog."default" NOT NULL,
  phone text COLLATE pg_catalog."default",
  mail text COLLATE pg_catalog."default",
  CONSTRAINT masters_pkey PRIMARY KEY (master_id)
)
WITH (
OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.masters
  OWNER to postgres;

CREATE TABLE public.pets
(
  pet_id bigint NOT NULL DEFAULT nextval('pets_pet_id_seq'::regclass),
  birthdate date,
  pet_type text COLLATE pg_catalog."default",
  pet_name text COLLATE pg_catalog."default",
  master bigint,
  CONSTRAINT pets_pkey PRIMARY KEY (pet_id),
  CONSTRAINT pets_master_fkey FOREIGN KEY (master)
  REFERENCES public.masters (master_id) MATCH SIMPLE
  ON UPDATE NO ACTION
  ON DELETE CASCADE
)
WITH (
OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.pets
  OWNER to postgres;