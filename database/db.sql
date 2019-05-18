use jdbctutorial;

CREATE TABLE student (
	  id           BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
	  code         VARCHAR(10) NULL,
	  fullname     VARCHAR(255) NULL,
	  address 	   VARCHAR(255) NULL,
	  score        INT NULL
);