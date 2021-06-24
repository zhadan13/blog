CREATE DATABASE blog_service;

CREATE TABLE users
(
    id         BIGINT  NOT NULL GENERATED ALWAYS AS IDENTITY,
    login      VARCHAR NOT NULL UNIQUE,
    password   VARCHAR NOT NULL,
    email      VARCHAR NOT NULL UNIQUE,
    first_name VARCHAR NOT NULL,
    last_name  VARCHAR NOT NULL,
    country    VARCHAR NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE posts
(
    id        BIGINT  NOT NULL,
    title     VARCHAR NOT NULL,
    full_text VARCHAR NOT NULL,
    date      VARCHAR NOT NULL,
    views     INTEGER NOT NULL,
    author    BIGINT  NOT NULL,
    FOREIGN KEY (author) REFERENCES users (id),
    PRIMARY KEY (id)
);