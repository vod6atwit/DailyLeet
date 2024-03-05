# Write your MySQL query statement below
Select w1.id
from Weather w1
Join Weather w2 on DATEDIFF(w1.recordDate, w2.recordDate) = 1
where w1.temperature > w2.temperature

-- SELECT 
--     w2.id
-- FROM 
--     Weather w1, Weather w2
-- WHERE 
--     DATEDIFF(w2.recordDate, w1.recordDate) = 1 
-- AND 
--     w2.temperature > w1.temperature;