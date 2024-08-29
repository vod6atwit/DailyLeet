/* Write your T-SQL query statement below */
SELECT MIN(ABS(p1.x - p2.x)) as shortest
FROM Point p1
JOIN Point p2 ON p1.x != p2.x