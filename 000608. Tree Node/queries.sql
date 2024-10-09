/* Write your T-SQL query statement below */
select id,
    case
        when p_id is null then 'Root'
        when p_id is not null 
            and p_id in (select id from Tree) 
            and id in (select distinct p_id 
                        from Tree 
                        where p_id is not null) then 'Inner'
        else 'Leaf'
    end as type
from Tree