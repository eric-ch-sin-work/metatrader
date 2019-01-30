--Change the password
CREATE DATABASE METATRADER;
GRANT ALL PRIVILEGES ON METATRADER.* TO 'metatrader'@'%' IDENTIFIED BY 'Abcd!1234';
USE METATRADER;

CREATE TABLE TB_OPERATION_CENTER ( 
	ID int unsigned not null auto_increment, 
	NAME varchar(20) not null, 
	TOTAL_USERS int unsigned not null,
	PROFIT double(63, 10),
	constraint PK_OPERATION_CENTER primary key (id) 
);

CREATE TABLE TB_GAIN_LOSS_SUMMARY ( 
	ID int unsigned not null auto_increment, 
	USER_ID int unsigned not null,  
	USER_NAME varchar(20) not null, 
	SYMBOL varchar(20) not null, 
	NET_PROFIT double(64,10) not null,
	constraint PK_GAIN_LOSS_SUMMARY primary key (id) 
);


CREATE TABLE TB_USER ( 
	ID int unsigned not null auto_increment, 
	OPERATION_CENTER_ID int unsigned not null,  
	FIRST_NAME varchar(20) not null, 
	LAST_NAME varchar(20) not null, 
	EMAIL_ADDRESS varchar(20) not null, 
	USER_NAME varchar(20) not null, 
	PASSWORD varchar(20) not null, 
	DATA_OF_BIRTH varchar(20) not null, 
	BIO varchar(20) not null, 
	PHONE_NUMBER varchar(20) not null, 
	FAX_NUMBER varchar(20) not null, 
	constraint PK_USER primary key (id) 
);

