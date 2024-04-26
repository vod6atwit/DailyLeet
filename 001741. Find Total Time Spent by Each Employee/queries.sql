# Write your MySQL query statement below
SELECT emp_id, event_day as day, SUM(out_time - in_time) as total_time
FROM Employees
GROUP BY emp_id, event_day