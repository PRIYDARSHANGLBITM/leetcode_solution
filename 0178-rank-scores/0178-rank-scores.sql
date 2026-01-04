# Write your MySQL query statement below
Select score, DENSE_rank() over (order by score desc ) as 'rank' from Scores;