# Write your MySQL query statement below
SELECT name as warehouse_name, SUM(Width * Length * Height * units) as volume
FROM Warehouse w 
JOIN Products p ON w.product_id = p.product_id
GROUP BY name