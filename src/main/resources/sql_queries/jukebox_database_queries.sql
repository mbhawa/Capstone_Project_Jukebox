-- create a database `jukebox`
create database if not exists `jukebox`;

-- use database `jukebox`
use `jukebox`;

-- create a table `song_name`
create table if not exists `song_details`(
`song_id` int not null primary key auto_increment,
`song_name` varchar(30) not null,
`artist_name` varchar(30) not null,
`album_name` varchar(30) not null,
`duration` time not null,
`genre` varchar(20) not null,
`song_path` varchar(60) not null
);

-- create a table `playlist_details`
create table if not exists `playlist_details`(
`playlist_id` int not null primary key,
`playlist_name` varchar(20) not null
);

-- add values to the song_details table
INSERT INTO `jukebox`.`song_details` (`song_id`, `song_name`, `artist_name`, `album_name`, `duration`, `genre`, `song_path`) VALUES ('1', 'Ganstas Paradise', 'Coolio', 'unknown', '00:04:16', 'rock', 'src/main/resources/songs_list/GangstasParadise.wav');
INSERT INTO `jukebox`.`song_details` (`song_id`, `song_name`, `artist_name`, `album_name`, `duration`, `genre`, `song_path`) VALUES ('2', 'Hall of fame', 'The Script', 'unknown', '00:03:54', 'pop', 'src/main/resources/songs_list/HallOfFame.wav');
INSERT INTO `jukebox`.`song_details` (`song_id`, `song_name`, `artist_name`, `album_name`, `duration`, `genre`, `song_path`) VALUES ('3', 'Heat Waves', 'Glass Animals', 'unknown', '00:03:56', 'pop', 'src/main/resources/songs_list/HeatWaves.wav');
INSERT INTO `jukebox`.`song_details` (`song_id`, `song_name`, `artist_name`, `album_name`, `duration`, `genre`, `song_path`) VALUES ('4', 'Nights', 'Avicii', 'Stories', '00:03:11', 'house music', 'src/main/resources/songs_list/Nights.wav');
INSERT INTO `jukebox`.`song_details` (`song_id`, `song_name`, `artist_name`, `album_name`, `duration`, `genre`, `song_path`) VALUES ('5', 'Peeky Blinders', 'Nick Caves', 'Peeky Blinders', '00:06:14', 'pop', 'src/main/resources/songs_list/PeekyBlinderTheme.wav');
INSERT INTO `jukebox`.`song_details` (`song_id`, `song_name`, `artist_name`, `album_name`, `duration`, `genre`, `song_path`) VALUES ('6', 'See You Again', 'Charlie Puth', 'unknown', '00:03:58', 'pop', 'src/main/resources/songs_list/SeeYouAgain.wav');


