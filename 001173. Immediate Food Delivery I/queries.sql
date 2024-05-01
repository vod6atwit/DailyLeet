# Write your MySQL query statement below
SELECT ROUND(COUNT(delivery_id)/(
    SELECT count(*)
    FROM Delivery
) * 100, 2) as immediate_percentage
FROM Delivery
WHERE order_date = customer_pref_delivery_date