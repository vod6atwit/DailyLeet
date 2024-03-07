# Write your MySQL query statement below
with activity_frequency AS (
    select freq, name
    from (
        select Activities.id as id, count(activity) as freq
        from Friends 
        Join Activities on Friends.activity = Activities.name
        group by activity
    ) f
    join Activities on f.id = Activities.id
)

Select name as activity from activity_frequency
where freq NOT IN (SELECT MAX(freq) from activity_frequency) 
AND freq NOT IN (SELECT MIN(freq) from activity_frequency)
