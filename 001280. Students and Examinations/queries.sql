# Write your MySQL query statement below
select s.Student_id, student_name, sub.subject_name, IFNULL(grouped.attended_exams,0) as attended_exams
from Students s 
Cross Join Subjects sub 
left join (
    select Student_id, subject_name, count(*) as attended_exams
    from Examinations
    Group by Student_id, subject_name
) grouped
on s.Student_id = grouped.Student_id and grouped.subject_name = sub.subject_name
order by Student_id, subject_name