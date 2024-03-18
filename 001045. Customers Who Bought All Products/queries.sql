# Write your MySQL query statement below
SELECT customer_id
FROM (
    SELECT customer_id, COUNT(DISTINCT product_key) as c
    FROM customer
    GROUP BY customer_id
    HAVING c = (SELECT COUNT(DISTINCT product_key) FROM product)
) a