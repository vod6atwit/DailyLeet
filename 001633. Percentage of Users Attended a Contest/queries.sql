# Write your MySQL query statement below
SELECT 
    contest_id, 
    ROUND((COUNT(*) / (
        select 
            count(user_id) 
        from 
            Users
    ) * 100 ),2) as percentage
    
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id

