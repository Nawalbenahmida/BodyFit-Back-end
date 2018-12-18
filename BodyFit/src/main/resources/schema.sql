drop table if exists category cascade;
drop table if exists video cascade;
drop table if exists users cascade;
drop table if exists likes;

create table category(
idCategory integer primary key not null,
nameCategory varchar(100) not null,
classCategory varchar(100) not null,
routingCategory varchar not null
);

create table video(
idVideo integer primary key not null,
nameVideo varchar(100) not null,
linkVideo varchar(100) not null,
classVideo varchar(100) not null,
blockVideo varchar(100) not null,
fkIdCategory integer not null,
constraint fkVideoCategory foreign key (fkIdCategory) references category(idCategory)

);

create table users(
idUser bigserial  primary key not null,
nameUser varchar(100) not null,
firstNameUser varchar(100) not null,
mailUser varchar(100) not null,
passwordUser varchar(100) not null

);

create table likes(
fkIdUser integer not null,
fkIdVideo integer not null,
constraint fkLikeUser foreign key (fkIdUser) references users(idUser),
constraint fkLikeVideo foreign key (fkIdVideo) references video(idVideo)
);

insert into category(idCategory, nameCategory, classCategory, routingCategory)
values 
(1, 'Categorie Abdo', 'abdo', '/video/abdo'),
(2, 'Categorie Cardio', 'cardio', '/video/cardio'),
(3, 'Categorie Fessier', 'fessier', '/video/fessier');

insert into video(idVideo, nameVideo, linkVideo, classVideo, blockVideo, fkIdCategory)
values
(1,'7 minutes ABS intense !', 'https://www.youtube.com/embed/l0EIkTZpHvw', 'img1', 'block1', 1),
(2, '7 minutes de gainage', 'https://www.youtube.com/embed/6EwSGMrpueM', 'img2', 'block2', 1),
(3, '7 minutes ABS', 'https://www.youtube.com/embed/joC8jsRTOYA','img3', 'block3', 1),
(4, '7 exercices ABS', 'https://www.youtube.com/embed/LebPal5gKrc','img4', 'block4', 1),
(5, '7 minutes ABS', 'https://www.youtube.com/embed/RI_YNrDYTFA','img5', 'block5', 1),
(6, '7 minutes de cardio', 'https://www.youtube.com/embed/obiX6uGNCEc','img6', 'block6', 2),
(7, 'Cardio brule graisse extreme', 'https://www.youtube.com/embed/NE_HqVQIAAs','img7', 'block7', 2),
(8, '7 minutes intense', 'https://www.youtube.com/embed/tnzb9MrvSvo','img8', 'block8', 2),
(9, '7 exercices de cardio', 'https://www.youtube.com/embed/0PET7imkXWU','img9', 'block9', 2),
(10, '7 minutes ABS intense !', 'https://www.youtube.com/embed/l0EIkTZpHvw','img10', 'block10', 2),
(11, '7 minutes pour avoir des fesses de Jen Selter', 'https://www.youtube.com/embed/P2tXlQ-xTMQ','img11', 'block11', 3),
(12, '7 minutes fesses bombées', 'https://www.youtube.com/embed/Sf4vSfwyyag','img12', 'block12', 3),
(13, 'Fess express', 'https://www.youtube.com/embed/oLayhiYhkCM','img13', 'block13', 3),
(14, 'Fesses bombées et musclées', 'https://www.youtube.com/embed/IJSb0IjNA8w','img14', 'block14', 3),
(15, '7 exercices de cardio', 'https://www.youtube.com/embed/0PET7imkXWU','img15', 'block15', 3);



