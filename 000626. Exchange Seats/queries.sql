# Write your MySQL query statement below
SELECT IF(id % 2 != 0
    ,IF(id != counts, id + 1, id)
    ,id - 1) as id, student
FROM 
    Seat,
    (SELECT 
        COUNT(*) AS counts
    FROM 
        Seat) as seat_counts
ORDER BY id