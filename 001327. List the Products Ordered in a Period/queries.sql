# Write your MySQL query statement below
SELECT DISTINCT t.product_name, t.total as unit
FROM (
    SELECT p.product_name, SUM(unit) OVER(PARTITION BY product_name) as total
    FROM Products p
    JOIN Orders o ON p.product_id = o.product_id
    WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
) t
WHERE total >= 100