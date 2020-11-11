--2020.11.11

--join

--cross join : 조건 없이 테이블과 테이블을 붙여준다 

SELECT
    *
FROM emp,dept

;


--ansi join :cross join 
SELECT
    *
FROM emp cross join dept

; --mysql 에서 사용 



--ansi->t1 inner joint2 on 조인의 조건

select *
from emp inner join dept 
on emp.deptno=dept.deptno -- 오라클
;

select *
from emp join dept 
--on emp.deptno=dept.deptno
using(deptno) --공통 컬럼을 하나만 가지게 해준다
;

--natural join : 동일 컬럼 조인의 조건을 생략 , 같은 이름의 컬럼은 하나씩 
select ename,deptno,dname
FROM emp NATURAL join dept
;   
--EquoJoin

SELECT
    *
FROM emp,dept
where emp.deptno=dept.deptno
;

--scoot의 사원 번호와 이름,부서이름,지역을 출력
SELECT ename,emp.deptno,dname,loc
FROM emp,dept
where emp.deptno=dept.deptno and ename='SCOTT'
;

SELECt e.ename,e.deptno,d.dname,d.loc
FROM emp e,dept d
where e.deptno=d.deptno
;
--non Equi join; 동등비교가 아닌 비교연산이 가능 
-- 급여 등급을 5개로 나누어 놓은 salgrade 에서 정보를 얻어와서 
--각 사원의  급여등급을 지정해 보도록 합시다.
--이를 위해서 사원 테이블과 급여등급 테이블을 조인하도록 합시다 
--사원의 급여가 몇 등급 인지 살펴보자 
--1.cross join -> 조건

SELECT
    *
FROM emp e,salgrade s
where sal between s.losal and s.hisal
;

select*from salgrade;



--self join: 자기자신의 테이블을 조인 

SELECT e.ename ,e.mgr,m.ename
FROM emp e,emp m
where e.mgr=m.empno
and e.ename='SMITH'
;

SELECT ename 
FROM emp 
where empno=7902;

--outer join: 정보가 부족 할때 조인 
SELECT e.ename ,e.mgr,m.ename
FROM emp e,emp m
where e.mgr=m.empno(+)
;

--ansi outer join
--[lft|rigth|full] outer join t2

select *
from emp e right outer join emp m
on e.mgr=m.empno
;

--회원, 구매
--customer, orders
SELECT
    *
FROM customer ;


SELECT * FROM orders ;

SELECT
    *
FROM customer c, orders o
where c.custid=o.custid(+)
;
-- 회원별 구매 횟수  group by 
SELECT c.name,count(o.orderid),sum(o.saleprice),avg(o.saleprice)
FROM customer c, orders o
where c.custid=o.custid(+)
GROUP BY c.name
;
--=======================================================================================================
--평균급여보다 더 많은 급여를 받는사원 검색 
--서브쿼리 
--스칼라 부속질의 - select 부속 질의 , 단일행 단일열 
--인라인 뷰 -from 부속질의 ,복합행 복합열 
--중첩질의  -where 부속 질의 ,단일열 ,단순비교 -> 단일행, 집합 비교 -> 복합행 

--중첩 질의 : 단순비교 
--평균 급여보다 더 많은 급여를 받는 사원을 출력 

select *
from emp
where sal>(select avg(sal) from emp) -- 평균 급여 2073.2142857142857
;

--scott 사원의 같은 부서에 근무하는 사원의 리스트를 출력 

select deptno from emp where ename='SCOTT';

select ename,deptno
from emp
where deptno=(select deptno from emp where ename='SCOTT');

-- sal 3000이상 받는 사원이 소속된 부서 
select distinct deptno from emp where sal>=300;

select *
from emp
--where deptno=10or deptno=20
where deptno in(select distinct deptno from emp where sal>=300)
;
--30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다
-- 더많은 급여를 받는 
--사람의 이름 , 급여를 출력하는 쿼리문을 작성 해 봅시다 

select max(sal)from emp where deptno=30;


select ename,sal
from emp
--where sal >(select max(sal)from emp where deptno=30)
--where sal>all(select max(sal)from emp where deptno=30)
where sal< any(select max(sal)from emp where deptno=30)
;

select sal from emp where deptno=30 ;

--rownum : 가상 컬럼 insert된 순서 
select rownum, empno,ename
from emp ;

select rownum, empno,ename,hiredate
from emp 
where rownum<4 -- 3개 뽐힘 
ORDER by hiredate
;
select rownum, empno,ename,hiredate from emp order by hiredate;

select rownum,ename,hiredate
from(select rownum, empno,ename,hiredate from emp order by hiredate desc)-- 인라인 뷰 가상 테이블 
where rownum<4 --가장 입사일이 빠른 3명
;

--가장 월급여를 많이 받는 사원 3명 
select rownum,ename from emp order by sal desc; 

select rownum,ename sal
from(select rownum,ename from emp order by sal desc)
where rownum <6
;
select name from customer where custid=1;
--스칼라 부속 질의 :ㄴ딛ㅊㅅ 절 프리젠 테이션 영역의 쓸 수있느 부속질의, 단일행, 단일열 
SELECt custid,(select name from customer where customer.custid=orders.custid)as "스칼라",saleprice,orderdate
FROM orders
;

-- 마당서점의 고객별 group by
--판매액을 보이시오 oders
--(결과는 고객이름과 고객별 판매액을 출력).

SELECt c.custid, c.name,sum(o.saleprice)
FROM customer c,orders o
where c.custid=o.custid(+)
group by c.custid,c.name 
order by c.name
;

select o.custid,(
select name from customer c where o.custid =c.custid
),
sum(o.saleprice)
from orders o
group by o.custid
;


select custid,name
from customer
where custid<=2
;
-- 인라인 뷰: from 절 이후에 들어가는 서브 쿼리 , 가상테이블, rownum이 새롭게 생성 
select c.name,sum(o.saleprice),avg(o.saleprice)
from orders o,(
select custid,name
from customer
where custid<=2) c
where o.custid=c.custid
GROUP by name
;

-- 평균 주문금액의
--부문에 대해서 부문 번호와 금액을 보이시오
SELECT avg(saleprice)
FROM orders;

select orderid,saleprice
from orders
where saleprice <= (SELECT avg(saleprice)
FROM orders);-- 평균 주문 금액 

-- 각 고객의 평균 주문 금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객번호, 금액을 보이시오
select avg(saleprice)from orders where custid=2;

select orderid,custid,saleprice
from orders o1
where saleprice <= (SELECT avg(saleprice) FROM orders o2 where o2.custid=o1.custid);--custid=1이면  1번 고객의 편균과 비교해서  큰 주문 금액만 출력

select*from customer where address like '%대한민국%';
--대한 민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
select sum(saleprice)
from orders
where custid in(select custid from customer where address like '%대한민국%');


--3번 고객이 주문한 도서의 최고 금액보다
--더 비싼 도서를 구입한 
--주문의 주문번호와 금액을 보이시오.
select max(saleprice)from oders where custid=3;

select orderid,saleprice
from orders
--where saleprice>(select max(saleprice)from orders where custid=3);
where saleprice> all(select saleprice from orders where custid=3);

--exists 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오
select * from customer where address like '%대한민국%';

select sum(saleprice)
from orders o
where EXISTS(select * from customer c where address like '%대한민국%'and o.custid=c.custid)
;