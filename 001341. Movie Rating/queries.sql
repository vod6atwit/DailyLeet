# Write your MySQL query statement below
(SELECT name as results
FROM Users
JOIN MovieRating ON Users.user_id = MovieRating.user_id
GROUP BY name
ORDER BY COUNT(*) DESC, name
LIMIT 1)

UNION ALL

(SELECT title as results
FROM Movies
JOIN MovieRating ON Movies.movie_id = MovieRating.movie_id
WHERE created_at >= '2020-02-01' AND created_at <= '2020-02-29'
GROUP BY title
ORDER BY AVG(rating) DESC, title
LIMIT 1)