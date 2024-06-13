-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas, sorted alphabetically.
-- (5 rows)

SELECT title
FROM movie
JOIN collection ON movie.collection_id = collection.collection_id
JOIN person ON director_id = person_id
WHERE person_name != 'George Lucas' AND collection_name = 'Star Wars Collection'
ORDER BY title
