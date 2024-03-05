# Write your MySQL query statement below
Select customer_id, count(*) as count_no_trans
from Visits
left join Transactions on Visits.visit_id = Transactions.visit_id 
where Transactions.Transaction_id IS NULL
Group By customer_id