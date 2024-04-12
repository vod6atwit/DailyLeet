# Write your MySQL query statement below
SELECT name as Customers
FROM Customers 
WHERE id NOT IN (
    SELECT customerId as id
    FROM Orders
)