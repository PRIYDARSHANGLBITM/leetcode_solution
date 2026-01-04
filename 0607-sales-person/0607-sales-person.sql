# Write your MySQL query statement below
SELECT name FROM SalesPerson where sales_id NOT IN ( select o.sales_id from orders o join company c ON o.com_id = c.com_id where c.name = 'RED');