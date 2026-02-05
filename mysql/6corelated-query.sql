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

-- diaplay the details of emp who is earning 7th maximum sal
select * from 
emp e1 where 6 in (select count(distinct e2.sal)
from emp e2 where e1.sal<e2.sal);

-- display to 4 and 5th max sal
select * from  -- wrong
emp e1 where 3,5 in (select count(distinct e2.sal) -- at rhs there can be multiple values with "IN" not lhs
from emp e2 where e1.sal<e2.sal);

select * from                         -- WRONG
emp e1 where (3 in (select count(distinct e2.sal)
from emp e2 where e1.sal<e2.sal)) and
 (4 in (select count(distinct e2.sal) from emp e2 where e1.sal<e2.sal));
 
 -- select * from  -- wrong
-- emp e1 where(select count(distinct e2.sal) -
-- from emp e2 where e1.sal<e2.sal)in (3,4);


select e1.sal from emp e1
where (select count(distinct e2.sal)
from emp e2 where e1.sal<e2.sal) in (0,1,2,3,4);


-- diaplay 3rd max and 4th min sal
select e1.sal from emp e1
where (select count(distinct e2.sal)
from emp e2 where e1.sal<e2.sal) in (0,1,2,3,4);

-- display maximum sal of each dept
select max(sal),deptno from emp group by(deptno);

-- display 2nd max sal of each dept
select deptno , max(sal)as second_maxsal from emp e1
where sal< (select max(sal) from emp e2 where e2.deptno = e1.deptno) -- we need 2nd max from same dep
group by deptno;

-- diaplay details of employee whose sal is greater than the average sal of the table
select * from emp where sal> (select avg(sal) from emp);

-- salary > department average

select * from emp e1 where sal>(select avg(sal) from emp e2 where e1.deptno = e2.deptno);

-- select * from emp e1 where sal>(select avg(sal) from emp e2 where e1.deptno = e2.deptno) group by e1.deptno;
SELECT SUBSTR("SQL Tutorial", 5, 3) AS ExtractString;

-- diplay first 3 char from employee jobs;
select substr(ename,1,3) from emp;
