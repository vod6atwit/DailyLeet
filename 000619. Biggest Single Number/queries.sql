# Write your MySQL query statement below
SELECT IFNULL(MAX(num), null) as num
FROM (
    SELECT num, COUNT(num)
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) n