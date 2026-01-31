# Write your MySQL query statement below
select max(num) AS num From MyNumbers where num in (Select num from MyNumbers group by num having count(num)=1);