CREATE TABLE IF NOT EXISTS roles (
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);


INSERT INTO roles (id, name)
VALUES (1, 'ADMIN')
ON CONFLICT DO NOTHING;

INSERT INTO roles (id, name)
VALUES (2, 'EMPLOYEE')
ON CONFLICT DO NOTHING;

INSERT INTO roles (id, name)
VALUES (3, 'CLIENT')
ON CONFLICT DO NOTHING;


CREATE TABLE IF NOT EXISTS users (
    id               BIGSERIAL PRIMARY KEY,
    name             VARCHAR(30)                 NOT NULL,
    lastname         VARCHAR(30)                 NOT NULL,
    email            VARCHAR(100)                NOT NULL,
    document_number  VARCHAR(20)                 NOT NULL,
    birth_date       TIMESTAMP                   NOT NULL,
    row_created_date TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    information      VARCHAR(1000),
    role_id          BIGINT                     NOT NULL REFERENCES roles (id)
);


INSERT INTO users (id, name, lastname, email, document_number, birth_date, row_created_date, information, role_id)
VALUES (1, 'Admin', 'Main', 'noreply@example.com', '', current_date, current_timestamp, '', 1);

