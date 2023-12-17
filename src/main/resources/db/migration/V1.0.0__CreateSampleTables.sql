DROP TABLE if EXISTS TASKS;
DROP SEQUENCE if EXISTS hibernate_sequence;

CREATE SEQUENCE hibernate_sequence START 1 INCREMENT 1;

CREATE TABLE tasks
(
    id        int8 NOT NULL,
    createdat TIMESTAMP,
    PRIMARY KEY (id)
);
