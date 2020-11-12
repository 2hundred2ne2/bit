--32. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서 이름을 출력하시오.

SELECT D.DEPTNO,d.dname
FROM EMP E,dept D
WHERE e.deptno=d.deptno AND e.ename='SCOTT'
;

--33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.

select EMP.ename,DEPT.DEPTNO,DEPT.LOC
FROM EMP INNER JOIN DEPT
ON EMP.DEPTNO=DEPT.DEPTNO
;

​

--36. 조인과 WildCARD를 사용하여 이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.

SELECT E.ename,D.DNAME
FROM emp E,dept D
where e.deptno=d.deptno AND E.ENAME LIKE '%A%'
;

​

​

--37. JOIN을 이용하여 NEW YORK에 근무하는 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.

​
SELECT ename,JOB,emp.deptno,DNAME
FROM emp,dept
where emp.deptno=dept.deptno and LOC='NEW YORK'
;
​

​

--38. SELF JOIN을 사용하여 사원의 이름 및 사원번호, 관리자 이름을 출력하시오.

SELECT E.ENAME,E.MGR
FROM EMP E,EMP M 
WHERE E.MGR=M.EMPNO
;

​

​

--39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여 사원번호를 기준으로 내림차순 정렬하여 출력하시오.

​
SELECT e.ename ,e.mgr,m.ename
FROM emp e,emp m
where e.mgr=m.empno(+)
ORDER BY E.EMPNO DESC
;
​

​

--40. SELF JOIN을 사용하여 지정한 사원의 이름, 부서번호, 지정한 사원과 동일한 부서에서 근무하는 사원을 출력하시오. ( SCOTT )

​
SELECT DEPTNO  FROM EMP WHERE ENAME = 'SCOTT';
​
SELECT ENAME,DEPTNO
FROM EMP
WHERE DEPTNO=(SELECT DEPTNO  FROM EMP WHERE ENAME = 'SCOTT');

​

--42. SELF JOIN 을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력하시오.

SELECT E.ENAME,E.HIREDATE,M.ENAME,M.HIREDATE 
FROM EMP E,EMP M
WHERE E.MGR=M.EMPNO AND E.HIREDATE <M.HIREDATE 
;

