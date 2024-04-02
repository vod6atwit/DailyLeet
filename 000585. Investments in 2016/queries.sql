# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016), 2) as tiv_2016
FROM (
    SELECT 
        pid, 
        tiv_2015, 
        tiv_2016,
        COUNT(*) OVER (PARTITION BY tiv_2015) as tiv_counts,
        COUNT(*) OVER(PARTITION BY lat, lon) as lat_cnts
    FROM Insurance
) c
WHERE c.tiv_counts >= 2 AND c.lat_cnts = 1 
