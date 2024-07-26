/* Write your T-SQL query statement below */
SELECT c.customer_id, c.name
FROM Customers c 
JOIN Orders o ON c.customer_id=o.customer_id
JOIN Product p ON o.product_id=p.product_id
WHERE YEAR(order_date) = 2020
GROUP BY c.customer_id, c.name
HAVING
    SUM((CASE WHEN MONTH(order_date) = 06 THEN quantity ELSE 0 END) * price) >= 100
        AND SUM((CASE WHEN MONTH(order_date) = 07 THEN quantity ELSE 0 END) * price) >= 100



