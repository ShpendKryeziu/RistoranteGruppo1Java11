ognuno avrà il suo database e qui mettiamo la creazione delle tabelle e l' eveuntuali modifiche post creazione
quindi ogni persona che inizierà a lavorare lancerà questo script per avere la struttura base

---------------------------------------------------------------------
create table if not exists restaurant (
    restaurant_id int auto_increment not null primary key,
    name varchar(255),
    address varchar(255),
    rating double
);

create table if not exists client (
    username varchar(255) unique not null primary key,
    name varchar(255),
    surname varchar(255),
    address varchar(255),
    phone varchar(255)
);

create table if not exists tables (
    table_id int auto_increment not null primary key,
    seats int,
    restaurant_id int foreign key references restaurant(restaurant_id)
);

create table if not exists menu (
    chef varchar(255),
    description varchar(255),
    type varchar(255),
    menu_id int auto_increment not null primary key,
    restaurant_id int foreign key references restaurant(restaurant_id)
);

create table if not exists reservation (
    seats int not null,
    time_of_reservation timestamp,
    username varchar(255) foreign key references client(username),
    restaurant_id int foreign key references restaurant(restaurant_id),
    table_id int foreign key references tables(table_id)
);

create table if not exists drink (
	drink_id int auto_increment not null primary key,
	name varchar(255),
	price double,
	capacity double,
	alcoholic boolean
);

insert into bevande(name,price,capacity,alcoholic)
values('Pepsi',3.5,0.33,false),
('Ruou thuoc',5.5,0.02,true),
('Cabernet 2017',2.5,0.15,true),
('Moscato 2021',2.5,0.15,true),
('Merlot 2018',3.5,0.15,true),
('Acqua',1.5,0.75,false),
('Raboso',3.0,0.15,true),
('Pinot Grigio',2.0,0.15,true),
('Bonator 0.66',6.5,0.66,true),
('Jägermeister',4.0,0.02,true),
('Leffe 0.4',5.5,0.4,true),
('Baileys',3.5,0.05,true);