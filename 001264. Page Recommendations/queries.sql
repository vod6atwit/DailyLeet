/* Write your T-SQL query statement below */
select distinct page_id as recommended_page from Likes
where user_id in (
    select user2_id as user_id from Friendship
    where user1_id = 1
    Union
    Select user1_id as user_id from Friendship
    where user2_id = 1
) and page_id not in (
    select page_id from Likes
    where user_id = 1
)