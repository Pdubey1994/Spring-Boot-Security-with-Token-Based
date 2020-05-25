# Spring-Boot-Security-with-Token-Based

CREATE DATABASE TestDB;

CREATE TABLE employee (
  [id] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[email] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[username] [varchar](255) NULL
);


CREATE TABLE Roles (
  [id] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[name] [varchar](255) NULL
);

CREATE TABLE User_roles (
  [user_id] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[user_roles] [varchar](255) NULL
);




INSERT INTO roles (name)
VALUES ('ROLE_USER');                    

INSERT INTO roles (name)
VALUES ('ROLE_SUPER_ADMIN');

INSERT INTO roles (name)
VALUES ('ROLE_SUPER_ADMIN');

INSERT INTO Employee (username,password,email)
VALUES ('Pdubey','$2a$10$3k0W4rHf33Iqah/ltJCM.Ov/Z.8zwvUTs9b2qNQLaZqMJ/d7UxIlC','pdubey@gmail.com'); 

INSERT INTO User_roless (user_id,role_id)
VALUES (1,1);  

INSERT INTO User_roless (user_id,role_id)
VALUES (2,2);   

INSERT INTO User_roless (user_id,role_id)
VALUES (3,3);   
