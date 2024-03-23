# Write your MySQL query statement below
-- Find all the date > 2019-08-16 and set the price to 10 by using
-- MIN(date) group by product id
SELECT product_id, 10 as price
FROM Products
GROUP BY product_id
HAVING MIN(change_date) > "2019-08-16"

-- Then union all with the max(date) of all the product_id such that max(date) <= 2019-08-16
UNION ALL 
SELECT product_id, new_price as price
FROM Products
WHERE (product_id, change_date) IN (
    SELECT product_id, MAX(change_date)
    FROM Products
    WHERE change_date <= "2019-08-16"
    GROUP BY product_id
) 