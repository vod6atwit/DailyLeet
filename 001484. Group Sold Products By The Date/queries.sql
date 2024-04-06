# Write your MySQL query statement below
SELECT 
    sell_date, 
    COUNT(sell_date) as num_sold, 
    GROUP_CONCAT(product ORDER BY product) as products
FROM(
    SELECT DISTINCT sell_date, product
    FROM Activities 
) n
GROUP BY sell_date