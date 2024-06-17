-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
--INSERT into genre(genre_name)
--VALUES ('Sports')
--
--INSERT into movie_genre(movie_id,genre_id)
--VALUES (7214,11771)




INSERT INTO genre (genre_id, genre_name) VALUES (2,'Sports');
INSERT INTO movie_genre(movie_id,genre_id) VALUES (7214,2);



