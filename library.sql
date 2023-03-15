create database sys_library;

use sys_library;

create table author (
id INT auto_increment,
constraint PK_Author primary key (id),
name VARCHAR(255),
website VARCHAR(255),
note VARCHAR(255)
)

create table category (
id INT auto_increment,
constraint PK_Category primary key (id),
name VARCHAR(255),
note VARCHAR(255)
)

create table publisher (
id INT auto_increment,
constraint PK_Publisher primary key (id),
name VARCHAR(255),
address VARCHAR(255),
email VARCHAR(255),
note VARCHAR(255)
)

create table book (
id INT auto_increment,
constraint PK_BookId primary key (id),
name VARCHAR(255),
author_id INT,
constraint FK_Author foreign key (author_id) references author(id),
category_id INT,
constraint FK_Category foreign key (category_id) references category(id),
publisher_id INT,
constraint FK_Publisher foreign key (publisher_id) references publisher(id),
publishing_date DATE
)

insert into author(name, website, note) values ('arron', 'arron.com',null);
insert into author(name, website, note) values ('bkris', 'bkris.com',null);
insert into author(name, website, note) values ('mossa', 'mossa.com',null);

insert into category(name, note) values ('text book', null);
insert into category(name, note) values ('novel', null);
insert into category(name, note) values ('comic', null);

insert into publisher(name, address, email, note) values ('oxford', 'uk', 'oxford.com', null);
insert into publisher(name, address, email, note) values ('macmillan', 'italy', 'macmillan.com', null);
insert into publisher(name, address, email, note) values ('pearson', 'uk', 'pearson.com', null);

insert into book(name ,author_id ,category_id ,publisher_id ,publishing_date ) values ('blood song',1,1,1,'2012-11-09');
insert into book(name ,author_id ,category_id ,publisher_id ,publishing_date ) values ('the last unicorn',2,2,2,'2012-10-09');
insert into book(name ,author_id ,category_id ,publisher_id ,publishing_date ) values ('the riddle-master of hed ',3,3,3,'2012-09-09');