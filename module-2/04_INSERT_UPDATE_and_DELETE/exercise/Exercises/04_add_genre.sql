-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
--INSERT into genre(genre_name)
--VALUES ('Sports')
--
--INSERT into movie_genre(movie_id,genre_id)
--VALUES (7214,11771)



START TRANSACTION;
INSERT into genre(genre_name) VALUES ('Sports');
SELECT genre_id AS genre FROM genre WHERE genre_name = 'Sports';



INSERT into movie_genre(movie_id,genre_id) VALUES (7214,genre);
