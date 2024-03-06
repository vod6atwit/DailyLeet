# Write your MySQL query statement below
Select name
from Employee
where id IN (
    select managerId
    from Employee
    Group by managerId
    Having COUNT(managerId) >= 5
)