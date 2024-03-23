# Write your MySQL query statement below
SELECT DISTINCT l1.num as ConsecutiveNums
FROM 
    Logs l1,
    Logs l2,
    Logs l3
WHERE
    l1.id + 1 = l2.id AND l2.id + 1 = l3.id AND l1.num = l2.num AND l2.num = l3.num