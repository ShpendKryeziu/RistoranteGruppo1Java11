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
    table_id int auto_increment foreign key references tables(table_id)
);

create table if not exists drink (
	drink_id int auto_increment not null primary key,
	name varchar(255),
	price double,
	capacity double,
	alcoholic boolean
);

create table if not exists first (
    first_id int auto_increment not null primary key,
    name varchar(255) not null,
    price double not null
);

create table if not exists second (
    second_id int auto_increment not null primary key,
    name varchar(255) not null,
    price double not null
);

create table if not exists dessert (
    dessert_id int auto_increment not null primary key,
    name varchar(255) not null,
    price double not null,
    glycemicIndex int,
    colourants boolean,
    calories int
);

create table if not exists allergens (
    allergens_id int auto_increment not null primary key,
    name varchar(25) not null
);

insert into drink(name,price,capacity,alcoholic)
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

insert into first(name,price)
values('Pappardelle al ragù di Cinghiale',6.50),
('Gnocchetti al riso nero con carpaccio di Vitello crudo e peperoni',7.5),
('Moussaka',6.5),
('Ravioli di pasta fresca con ripieno di Vitello, caprino e marsala',11.0),
('Fagioli con costine affumicate',7.5),
('Canederli alla tirolese',9.5),
('Tortellini in brodo di Cappone',12.0),
('Ciorba di Capra transilvana',10.0);

insert into second(name,price)
values('Cervello fritto di Capra montana',12.5),
('Fegatelli di Airone grigio dei Balcani',11.5),
('Piottino di Cinghiale non selvatico alla vodka',9.5),
('Lingua di Yak brasata',16.8),
('Budini di sangue di Maiale allevato allo stato brado',18.0);

insert into dessert(name,price)
values('Nocciolato Caramellato',4.0),
('Semifreddo al Limone',5.5),
('Salame al cioccolato con bacche',7.0),
('Panna fatta in casa con Mirtilli e Lamponi',13.0),
('Crema Catalana',8.0),
('Zucchero filato',14.0);

insert into client(username, name, surname, address, phone)
values ('Tommaso', 'Rossi', 'Via Fasulla 33', '3331119911'),
('Maria', 'Papavero', 'Via Disneglia 12', '3332124553'),
('Zorro', 'Garcia', 'Via del Spadigno 2', '3221229202'),
('Spenzio', 'Carietti', 'Via dello Spresio 9', '3039491822'),
('Piccola', 'Trilly', 'Dorsoduro 1922', '29339224241');
