use scott;
select * from dept;
select * from emp;

select dname,deptno from dept where deptno =(select deptno from emp where ename = 'MILLER');

-- get name , sal of emp who  are earning mpre than scott and working in deptno 20;
select ename,sal from emp where sal>(select sal from emp where ename = 'Scott');

-- details, of emp, working in the same designation as Miller and work in location newYork
select * from emp where job = (select job from emp where ename = 'MILLER')
and deptno = (select deptno from dept where loc = 'NEW YORK'); 

-- display deptname of clerk

select dname from dept where 
deptno = (select deptno from emp where job = 'CLERK');
-- as subquery returns multiple rows, we cant use "=" because "=" only compare one value
-- use "IN" , as it can compare both single value and multiple values
select dname from dept where 
deptno IN (select deptno from emp where job = 'CLERK');

-- single row subquery - if subqeury returns exactly one value, for one value we can use "="
-- and "IN" special operator also

-- multipleRow subquery - if subquery returns more than one value, then it is known as multi row
-- we use "IN" special operator

select count(*), deptno from emp where job in ('CLERK', 'SalesMAn') and sal>800 
and deptno in (select deptno from dept where loc in ('DALLAS') group by deptno;
-- if the subqueray returns


-- query to displsy details of emp, who is earning max sal;
select * from emp where sal = (select max(sal) from emp);
select * from emp where sal in (select max(sal) from emp);

-- display 2nd max sal
select* from emp where sal <(select max(sal) from emp);-- all sal except max
select max(sal) from emp where sal<(select max(sal) from emp); -- 2nd largest

select max(sal)from emp where sal 
<(select max(sal) from emp where sal<(select max(sal) from emp)); -- 3nd largest
-- these are nested sbquery, subquery inside subquery, we can nest upto 255 subqueries


-- DETAILS OF EMP WITH 2ND MIN SAL
select * from emp wher
(select min(sal) from emp where sal>(select min(sal) from emp));

-- diaplay loc (location) of emp who is earning 3rd max sal
select loc from dept  where deptno =
(select deptno from emp where sal = 
(select max(sal)from emp where sal 
<(select max(sal) from emp where sal<(select max(sal) from emp))));

-- display name and hiredate of emp, who is earning more than clerk

select ename, hiredate from emp where sal>(select sal from emp where job = 'clerlk');
-- ">" cant compare from multiple values, cant use "IN" can bee used only while
-- checking multiple equal values

--  "ALL" "ANY" - subquery operators
select ename, hiredate from emp where sal> ALL(select sal from emp where job = 'clerlk');

-- details o f emp , earninfg less thn salesman and hired after the clerks

select * from emp where sal<all(select sal from emp where job='clerk');

-- details of empearning more than the employee who is having char 'a' in his name 
-- and earning less than  the emp who is working in the loc of chichago

select * from emp where sal> all(select sal from emp where ename like '%a%')and 
sal<(select sal from emp where deptno in(select deptno from dept where loc = 'chicago'));


-- ANY

-- displsy details of employee earning more than at least a clerk

-- display name and hiredate and annual salary of rthe emp if his annual sal
-- is greatwe than any one of the clerks annual sal but those emp are hired after managers

select ename, hiredate ,sal*12 as annual_sal from emp where sal*12 
> any(select sal from emp where job = 'clerk')
and hiredate> all(select hiredate from emp where job = 'manager');

-- details of employee who is hired after adams and earning less than the emp who 
-- is having character 'Man' in his job and they are hired after atleast a salesman
-- if there salary is in the range of 1000 to 5000

select * from emp where hiredate> (select hiredate from emp where ename = 'adams')
and sal< all(select sal from  emp where job like '%man%') and hiredate >
any(select hiredate from 