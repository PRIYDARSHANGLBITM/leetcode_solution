CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
    select distinct (salary) from (select salary, DENSE_RANK() OVER (order by salary desc)AS salary_rank from employee) AS T where Salary_rank = N);
END