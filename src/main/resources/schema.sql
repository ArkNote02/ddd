CREATE TABLE credentials (login_id SERIAL PRIMARY KEY, password VARCHAR(128), updated_at TIMESTAMP);
CREATE TABLE customer (id SERIAL PRIMARY KEY, first_name VARCHAR(255), last_name VARCHAR(255));
