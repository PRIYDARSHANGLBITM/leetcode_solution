# Write your MySQL query statement below
select p.email AS Email from person p group by email having count(email)>1;