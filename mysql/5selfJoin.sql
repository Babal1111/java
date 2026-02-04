use scott;

-- display emp details and their managers details
-- use self join

select * from emp e1 join emp e2 on e1.mgr = e2.empno;

-- diaplay thr names of emp and their managers if emp are earinnig more than 2000
select e1.ename as empLoyee, e2.ename as manager
 from emp e1 join emp e2 on e1.mgr = e2.empno where e1.sal>2000;
 
 -- display the names of  employees and their managers if employess are earning more than
 -- their mandagers and  mangers are hired after clerk
 
 select e1.ename, e2.ename from emp e1 join emp e2 on e1.mgr = e2.empno
 where e1.sal > e2.sal and e2.hiredate>all(select hiredate from emp e1 where job='clerk');
 
 -- display the details of emp and their managers name if emp annual sal is
 -- greater than their managers annual sal if emp are hired after the 
 -- emp who is working in the location of new york and mangers are having character 'A'
 -- in their name
 
 select *from emp e1 join emp e2 on e1.mgr = e2.empno 
 where e1.sal*12>e2.sal*12 and e1.hiredate> 
 all(select hiredate from emp e join dept on e1.deptno = dept.deptno where loc = 'new york')
 and e2.ename like '%A%';
 
 
 select *from emp e1 join emp e2 on e1.mgr = e2.empno 
 where e1.sal*12>e2.sal*12 and e1.hiredate> 
 all(select hiredate from emp e  where deptno = 
 (select deptno from dept where loc = 'new york'))
 and e2.ename like '%A%';
 
 -- query to display details of employees and their mangers and manger's manager detail
 -- 3 tables joined
 
 
 select * from emp e1 join emp e2 on e1.mgr = e2.empno join emp e3 on e2.mgr = e3.empno;
 
 -- query to display details of employeees and their managers and manager's managers 
 -- if employess are earning more than their managers and managers are hired after blake and 
 -- manager's and manger are working in deptno 10 or 30, if all of them have charachter 'A'
 -- or character's' in their name
 
 select * from emp e1 join emp e2 on e1.mgr = e2.empno join emp e3 on e2.mgr = e3.empno
 where e1.sal>e2.sal and e2.hiredate>(select hiredate from emp where ename = 'blake')
 and e3.deptno in (10,30)
 and (e1.ename like '%A%' or e1.ename like '%S%')
and (e2.ename like '%A%' or e2.ename like '%S%')
and (e3.ename like '%A%' or e3.ename like '%S%');


-- display the name of employees and their manager's and manager's  manager along with
-- their dept name

select e1.ename as employee, e2.ename as manager, e3.ename as managers_manager,
d1.dname as emp_dept, d2.dname as manager_dept, d3.dname as mangers_managers_deptname
from emp e1 join emp e2 on e1.mgr = e2.empno
join emp e3 on e2.mgr = e3.empno
join dept d1 on e1.deptno = d1.deptno
join dept d2 on e2.deptno = d2.deptno
join dept d3 on e3.deptno = d3.deptno;



-- display names, and hiredate of the employees if the employees are hired after 
-- their manager and mangers are hired after adams, and manager's manger are earning 
-- than a clerk and emplopyees are working in the research dept, managers are working 
-- in the location of chicago and manager's manager are working in deptno 20.

-- select e1.ename, e1.hiredate from emp e1 
-- join emp e2 on e1.mgr = e2.empno
-- join emp e3 on e2.mgr = e3.empno
-- join dept d1 on e1.deptno = d1.deptno
-- join dept d2 on e2.deptno = d2.deptno
-- join dept d3 on e3.deptno = d3.deptno
-- where e1.hi

select 
	e1.ename as emp_name,
    e1.hiredate as emp_date,
    e1.ename as mgr_name,
    e2.hiredate as mgr_hiredate
from emp e1
join emp e2 on e1.mgr = e2.empno
join emp e3 on e2.mgr = e3.empno
where e1.hiredate < e2.hiredate
	and e2.hiredate > (select hiredate from emp where ename = 'ADAMS')
    and e3.sal > all(select sal from emp where job = 'CLERK')
    and e1.deptno = (select deptno from dept where dname = 'RESEARCH')
    and e2.deptno = (select loc from dept where loc = 'CHICAGO')
    and e3.deptno = 20;


