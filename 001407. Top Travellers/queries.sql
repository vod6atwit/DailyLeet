# Write your MySQL query statement below
SELECT name, IFNULL(travelled_distance, 0) as travelled_distance
FROM Users u
LEFT JOIN (
    SELECT user_id, SUM(distance) as travelled_distance
    FROM Rides
    GROUP BY user_id
) r on u.id = r.user_id
ORDER BY travelled_distance desc , name