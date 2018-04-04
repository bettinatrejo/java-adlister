# CREATE DATABASE adlister_db;

USE adlister_db;


CREATE TABLE users (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  email VARCHAR(150) NOT NULL,
  password VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);

describe USERS;


Select * from ads;


CREATE TABLE ads (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id INT UNSIGNED NOT NULL,
  title VARCHAR(200) NOT NULL,
  description TEXT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
    ON DELETE CASCADE
);

describe ads;

INSERT INTO users (username, email, password) VALUES ('heythere', 'green2bean@gmail.com', 'heythere');

INSERT INTO ads(user_id,title, description) VALUES (1, 'test', 'testing');