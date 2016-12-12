# --- First database schema

# --- !Ups

create table comida (
  id                        bigint not null,
  name                      varchar(255),
  precio		            bigint,
  ingrediente	            varchar(255),
  constraint pk_comida primary key (id))
;


create sequence comida_seq start with 1000;



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists comida;


SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists comida_seq;



