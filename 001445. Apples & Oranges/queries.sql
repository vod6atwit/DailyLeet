# Write your MySQL query statement below
SELECT 
    sale_date,
    SUM(CASE WHEN fruit IN ('apples') THEN sold_num 
             WHEN fruit IN ('oranges') THEN (sold_num)*-1 
        END) AS diff
FROM 
    Sales
GROUP BY 1
ORDER BY 1