/* Write your T-SQL query statement below */
SELECT co.name as country
FROM person p
JOIN country co ON SUBSTRING(phone_number,1,3) = country_code
JOIN calls c ON p.id IN (c.caller_id, c.callee_id)
GROUP BY co.name
HAVING AVG(duration) > (SELECT AVG(duration) FROM Calls)