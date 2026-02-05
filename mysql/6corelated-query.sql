-- co-related subquary

-- a query written inside another query such that outer query and the inner query are
-- dependent onn each other, this is known as co-related query

-- two queries-
			-- outer query, executes first but partially, its output is input of inner query
            -- inner query, executes after recieving input from outer query, its output is input for outer
		

use scott;

select e1.sal 
from emp e1 
where 3 in (select count(distinct e2.sal)
from emp e2 where e1.sal>e2.sal);


-- diaplay 5th minimum sal
select e1.sal 
from emp e1 
where 4 in (select count(distinct e2.sal)
from emp e2 where e1.sal>e2.sal);