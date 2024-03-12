# Write your MySQL query statement below
SELECT ROUND(COUNT(immediate.customer_id) / (
    SELECT COUNT(DISTINCT customer_id) FROM Delivery
) * 100,2) as immediate_percentage
FROM(
    SELECT customer_id, order_date, customer_pref_delivery_date
    FROM Delivery
    WHERE (customer_id, order_date) IN (
        SELECT customer_id, min(order_date)
        FROM Delivery
        GROUP BY customer_id
    )
    HAVING DATEDIFF(customer_pref_delivery_date, order_date) = 0
) as immediate


