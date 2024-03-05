# Write your MySQL query statement below
select unique_id, name 
from Employees e
Left Join EmployeeUNI eui on e.id = eui.id