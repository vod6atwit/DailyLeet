# Write your MySQL query statement below
Select name, sum(amount) as balance
FROM Users
LEFT JOIN Transactions ON Users.account = Transactions.account
GROUP BY name
HAVING balance > 10000