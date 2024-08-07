# Write your MySQL query statement below
SELECT student_id, course_id, grade
FROM (
    SELECT *, RANK() OVER(PARTITION BY student_id ORDER BY grade DESC, course_id) as rnk
    FROM Enrollments
) r
WHERE rnk = 1
