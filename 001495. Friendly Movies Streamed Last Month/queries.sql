/* Write your T-SQL query statement below */
SELECT DISTINCT title
FROM TVProgram t 
LEFT JOIN Content c ON t.content_id = c.content_id
WHERE MONTH(program_date) = 6 AND YEAR(program_date) = 2020 AND Kids_content = 'Y' AND content_type = 'Movies'