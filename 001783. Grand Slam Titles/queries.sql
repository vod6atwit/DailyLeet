/* Write your T-SQL query statement below */
with unpivot_tourament as 
(SELECT 
    year,
    tourament,
    play_id
FROM Championships
UNPIVOT
(
    play_id FOR tourament in(Wimbledon, Fr_open, US_open, Au_open)
) as unpivot_tourament)

SELECT 
    player_id,
    player_name,
    count(player_name) as grand_slams_count
FROM unpivot_tourament ut 
LEFT JOIN Players pl ON pl.player_id = ut.play_id
GROUP BY player_id, player_name