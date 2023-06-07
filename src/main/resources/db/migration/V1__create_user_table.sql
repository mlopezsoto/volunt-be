CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  username VARCHAR(50),
  password VARCHAR(50)
);

INSERT INTO users (id, username, password) VALUES (1, 'john', 'jpwd');
INSERT INTO users (id, username, password) VALUES (2, 'carla', 'cpwd');