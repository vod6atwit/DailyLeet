# Write your MySQL query statement below
with min_year as (
    SELECT product_id, min(year) as year
    FROM Sales
    GROUP BY product_id
)

SELECT Sales.product_id, Sales.year as first_year, quantity, price
FROM Sales
JOIN min_year on Sales.product_id = min_year.product_id
WHERE Sales.year = min_year.year
