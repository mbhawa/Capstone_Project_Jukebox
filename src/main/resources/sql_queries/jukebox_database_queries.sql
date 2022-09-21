-- create a database `jukebox`
create database if not exists `jukebox`;

-- use database `jukebox`
use `jukebox`;

-- create a table `song_name`
create table if not exists `song_details`(
`song_id` int not null primary key auto_increment,
`song_name` varchar(30) not null,
`album_name` varchar(30) not null,
`duration` time not null,
`genre` varchar(20) not null,
`song_path` varchar(60) not null
);