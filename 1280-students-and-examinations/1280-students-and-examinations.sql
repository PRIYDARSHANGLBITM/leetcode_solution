# Write your MySQL query statement below
Select s.student_id, s.student_name, sub.subject_name, count(e.student_id) as attended_exams
from Students s cross join Subjects sub
left join Examinations e
on s.student_id=e.student_id and sub.subject_name=e.subject_name
Group By s.student_id, s.student_name, sub.subject_name
Order by s.student_id, s.student_name;