# Write your MySQL query statement below
SELECT seller_name
FROM Seller
WHERE seller_id NOT IN(
    SELECT DISTINCT Seller.seller_id
    FROM Orders
    JOIN Seller ON Orders.seller_id = Seller.seller_id
    WHERE sale_date BETWEEN "2020-01-01" AND "2020-12-31"
)
ORDER BY seller_name