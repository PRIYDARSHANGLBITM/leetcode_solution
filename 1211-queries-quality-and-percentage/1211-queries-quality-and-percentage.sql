# Write your MySQL query statement below
select query_name , ROUND(AVG(rating * 1.0 / position), 2) AS quality,
round(avg(case when rating <3 then 100 else 0 end ),2 )AS poor_query_percentage from queries  group by query_name;