drop table if exists category cascade;
drop table if exists video cascade;
drop table if exists users cascade;
drop table if exists likes;

create table category(
id_category integer primary key not null,
name_category varchar(100) not null
);

create table video(
id_video integer primary key not null,
name_video varchar(100) not null,
link_video varchar(100) not null,
fk_id_category integer not null,
constraint fk_video_category foreign key (fk_id_category) references category(id_category)

);

create table users(
id_user integer primary key not null,
name_user varchar(100) not null,
firstName_user varchar(100) not null,
mail_user varchar(100) not null,
password_user varchar(100) not null
);

create table likes(
fk_id_user integer not null,
fk_id_video integer not null,
constraint fk_like_user foreign key (fk_id_user) references users(id_user),
constraint fk_like_video foreign key (fk_id_video) references video(id_video)
);

insert into category(id_category, name_category)
values 
(1, 'Categorie Abdo'),
(2, 'Categorie Cardio'),
(3, 'Categorie Fessier');

insert into video(id_video, name_video, link_video, fk_id_category)
values
(1, '7 minutes ABS intense !', 'https://www.youtube.com/embed/l0EIkTZpHvw', 1),
(2, '7 minutes de gainage', 'https://www.youtube.com/embed/6EwSGMrpueM', 1),
(3, '7 minutes ABS', 'https://www.youtube.com/embed/joC8jsRTOYA', 1),
(4, '7 exercices ABS', 'https://www.youtube.com/embed/LebPal5gKrc', 1),
(5, '7 minutes ABS', 'https://www.youtube.com/embed/RI_YNrDYTFA', 1),
(6, '7 minutes de cardio', 'https://www.youtube.com/embed/obiX6uGNCEc', 2),
(7, 'Cardio brule graisse extreme', 'https://www.youtube.com/embed/NE_HqVQIAAs', 2),
(8, '7 minutes intense', 'https://www.youtube.com/embed/tnzb9MrvSvo', 2),
(9, '7 exercices de cardio', 'https://www.youtube.com/embed/0PET7imkXWU', 2),
(10, '7 minutes ABS intense !', 'https://www.youtube.com/embed/l0EIkTZpHvw', 2),
(11, '7 minutes pour avoir des fesses de Jen Selter', 'https://www.youtube.com/embed/P2tXlQ-xTMQ', 3),
(12, '7 minutes fesses bombées', 'https://www.youtube.com/embed/Sf4vSfwyyag', 3),
(13, 'Fess express', 'https://www.youtube.com/embed/oLayhiYhkCM', 3),
(14, 'Fesses bombées et musclées', 'https://www.youtube.com/embed/IJSb0IjNA8w', 3),
(15, '7 exercices de cardio', 'https://www.youtube.com/embed/0PET7imkXWU', 3);



