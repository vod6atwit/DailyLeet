# Write your MySQL query statement below
SELECT player_id, event_date as first_login
FROM Activity
WHERE (player_id, event_date) IN (
    SELECT player_id, MIN(event_date) as first_date
    FROM Activity
    GROUP BY player_id
)