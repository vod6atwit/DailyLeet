# Write your MySQL query statement below
SELECT IFNULL(MAX(salary), NULL) as SecondHighestSalary
FROM (
    SELECT salary, DENSE_RANK() OVER(ORDER BY salary DESC) as rnk
    FROM Employee 
) r
WHERE rnk = 2