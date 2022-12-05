--liquibase formatted sql

--changeset trungtmnguyen:1
create schema audit;

create table PROPERTIES (
    id bigserial primary key,
    KEY varchar(100),
    VALUE varchar(255),
    PROFILE varchar(50),
    APPLICATION varchar(50),
    LABEL varchar(20)
);