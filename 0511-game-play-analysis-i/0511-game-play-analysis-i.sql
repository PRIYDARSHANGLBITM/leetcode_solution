# Write your MySQL query statement below
select a.player_id, MIN(a.event_date) AS first_login from Activity a group by player_id