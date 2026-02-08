-- JOINS, the process of retreving the data from the multiple table simultaniously

-- TYPES - Cartesian/cross join
--       - inner/equi join
--       - natural join
--       - self join
--       - outer join

-- cartesina /cross join , record of table 1 will merge with all the record of table2
use scott;
select * from emp cross join dept;
select * from emp INNER join dept on emp.deptno = dept.deptno;

-- details of emp along with the employee names if employees are working in the location
-- of chicago and they are hired after clerks

-- select * from emp inner join  dept on emp.deptno = dept.deptno
-- where loc = 'chicago' and hiredate>  ;

-- diaplay no of employee working in each acc dep if there max sal is more than 2000
-- and there loc is new york or chicago and they are hired after the employee who is 
-- not earning commision

select count(*) from emp inner join  dept on emp.deptno = dept.deptno
where dept.loc in ('new york','chicago') and hiredate>(select hiredate from emp
 where comm=0 or comm is null) group by emp.deptno having max(sal)>2000;



SELECT COUNT(*) COUNT
FROM EMP INNER JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO
WHERE DEPT.LOC IN ('NEW YORK', 'CHICAGO') AND HIREDATE > ALL (SELECT HIREDATE 
																FROM EMP 
                                                                WHERE COMM IS NULL OR COMM = 0)
GROUP BY EMP.DEPTNO
HAVING MAX(SAL) > 2000;


-- quert to display name and hiredate adams manader
select ename and hiredate from emp 
where empno = (select mgr from emp where ename ='adams' );

-- query to diplay name and hiredate of smith'd manager's manager
select ename, hiredate from emp where empno = (select mgr from emp where empno =
(select mgr from emp where ename = 'smith'));

-- diplay name of employees reporting to king

-- display emp details and their managers details

select * from emp 