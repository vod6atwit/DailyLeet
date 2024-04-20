# Write your MySQL query statement below
with cte as (SELECT *
FROM Teams 
LEFT JOIN Matches m1 ON Teams.team_id = m1.host_team
UNION ALL 
SELECT *
FROM Teams 
LEFT JOIN Matches m2 ON Teams.team_id = m2.guest_team)

SELECT 
    team_id, 
    team_name,
    SUM(
        CASE 
            WHEN team_id = host_team AND host_goals > guest_goals THEN 3
            WHEN team_id = guest_team AND guest_goals > host_goals THEN 3
            WHEN team_id = host_team AND host_goals = guest_goals THEN 1
            WHEN team_id = guest_team AND guest_goals = host_goals THEN 1
            ELSE 0
        END
    ) as num_points
FROM cte 
GROUP BY team_id
ORDER BY num_points DESC, team_id 