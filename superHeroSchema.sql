Drop database if exists Superhero;

Create database Superhero;

Use Superhero;

create table location(
locationId int not null primary key auto_increment,
locationName varchar(30) not null,
locationDescription varchar(30) not null,
locationAddress varchar(30) not null,
locationState varchar(20) not null,
locationCity varchar(20) not null,
locationZip varchar(10) not null,
locationLatLat decimal(12,8),
locationLong decimal(12,8));

Create Table superOrganization(
organizationId int not null primary key auto_increment,
organizationName varchar(30) not null,
organizationDescription varchar(50) not null,
locationId int,
Constraint foreign key (locationId) references location(locationId)
);

Create Table power(
powerId int not null primary key auto_increment,
powerDescription varchar(30) not null
);

Create Table superPerson(
superId int not null primary key auto_increment,
superName varchar(20)not null,
powerId int,
superDescription varchar(50) not null,
isSuper boolean not null,
 foreign key (powerId) references power(powerId));

Create Table super_Organization(
superId int not null,
organizationId int not null,
primary key (superId, organizationId),
 foreign key (superId) 
   references superPerson(superId),
 foreign key (organizationId) 
   references superOrganization(organizationId));

Create Table sightingLocation(
sightingId int not null primary key auto_increment,
date date not null,
locationId int,
superId int,
foreign key (superId) references superPerson(superId),
foreign key (locationId) references location(locationId));
