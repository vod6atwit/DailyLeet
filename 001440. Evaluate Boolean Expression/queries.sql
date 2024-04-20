# Write your MySQL query statement below
SELECT  left_operand,
        operator,
        right_operand
        , CASE 
            WHEN(
                CASE 
                    WHEN operator = '>' THEN (v1.value > v2.value)
                    WHEN operator = '=' THEN (v1.value = v2.value)
                    WHEN operator = '<' THEN (v1.value < v2.value)
                END
            ) = 0 THEN 'false' ELSE 'true' END as value
FROM Expressions e 
JOIN Variables v1 ON e.left_operand = v1.name
JOIN Variables v2 ON e.right_operand = v2.name


