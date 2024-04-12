# Write your MySQL query statement below
SELECT employee_id, IF(
    employee_id IN (
        SELECT employee_id
        FROM Employees
        WHERE employee_id % 2 = 1 AND name NOT LIKE "M%"
    ), salary, 0
)as bonus
FROM Employees
ORDER BY employee_id