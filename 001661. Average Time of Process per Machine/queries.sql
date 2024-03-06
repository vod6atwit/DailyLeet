# Write your MySQL query statement below
select a.machine_id, round(AVG(b.timestamp - a.timestamp),3) as processing_time 
from Activity a, Activity b
where a.machine_id = b.machine_id
and a.process_id = b.process_id
and a.Activity_type = 'start'
and b.Activity_type = 'end'
group by machine_id
