select id,SUM(case when month ='jan' then revenue end )as Jan_Revenue ,
SUM(case when month ='feb' then revenue end )as feb_Revenue,
SUM(case when month ='mar' then revenue end )as mar_Revenue,
SUM(case when month ='apr' then revenue end )as apr_Revenue,
SUM(case when month ='may' then revenue end )as may_Revenue,
SUM(case when month ='jun' then revenue end )as Jun_Revenue,
SUM(case when month ='jul' then revenue end )as Jul_Revenue,
SUM(case when month ='aug' then revenue end )as aug_Revenue,
SUM(case when month ='sep' then revenue end )as sep_Revenue,
SUM(case when month ='oct' then revenue end )as oct_Revenue,
SUM(case when month ='nov' then revenue end )as nov_Revenue,
SUM(case when month ='dec' then revenue end )as dec_Revenue
from Department 
group by id;