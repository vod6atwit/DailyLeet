# Write your MySQL query statement below
select 
    CONCAT(YEAR(t.trans_date), "-", DATE_FORMAT(t.trans_date, "%m")) as month,
    country,
    COUNT(state) as trans_count,
    SUM(IF(state = "approved",1,0)) as approved_count,
    SUM(amount) as trans_total_amount,
    SUM(IF(state = "approved",amount,0)) as approved_total_amount
FROM 
    Transactions t
GROUP BY
    YEAR(t.trans_date), MONTH(t.trans_date), country