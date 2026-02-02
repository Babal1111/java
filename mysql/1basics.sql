use scott;
select *from emp where job='Analyst' and sal <=5000;


select * from emp where hiredate>'1980-12-31' and sal>2000 and job = 'manager';

select * from emp where hiredate>='1980-1-1' and hiredate<='1980-12-31' and sal*6<7000;
show databases;