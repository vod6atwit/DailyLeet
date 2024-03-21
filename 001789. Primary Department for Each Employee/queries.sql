# Write your MySQL query statement below
-- SELECT employee_id, department_id
-- FROM Employee
-- GROUP BY employee_id
-- HAVING count(department_id) = 1
-- UNION
-- SELECT employee_id, department_id
-- FROM Employee
-- WHERE Employee.primary_flag = 'Y'


SELECT 
  employee_id, 
  department_id 
FROM (
    SELECT 
      *, 
      COUNT(employee_id) OVER(PARTITION BY employee_id) AS EmployeeCount
    FROM 
      Employee
  ) EmployeePartition 
WHERE 
  EmployeeCount = 1 
  OR primary_flag = 'Y';