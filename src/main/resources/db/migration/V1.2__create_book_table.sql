create table book (
   id int auto_increment primary key,
   title varchar(255) not null,
   description varchar(255) not null,
   contributor varchar(255) not null,
   author varchar(255) not null,
   contributor_note varchar(255),
   publisher varchar(255) not null,
   price int(11) not null
);