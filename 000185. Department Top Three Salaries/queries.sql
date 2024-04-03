# Write your MySQL query statement below
SELECT department, Employee, salary
FROM(
    SELECT 
        d.name as department, 
        e.name as Employee, 
        e.salary, 
        DENSE_RANK() OVER(PARTITION BY d.name ORDER BY e.salary DESC) as salary_ranks
    FROM Employee e
    JOIN Department d ON e.departmentId = d.id
) r 
WHERE salary_ranks <= 3