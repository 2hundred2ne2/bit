--. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오.
SELECT JOB  FROM EMP WHERE empno='7788' ;


SELECT ENAME,JOB
FROM EMP 
WHERE JOB = (SELECT JOB  FROM EMP WHERE empno='7788') ; 

​

--44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 감당 업무

​
SELECT SAL  FROM EMP WHERE empno='7499' ;

​

SELECT ENAME,JOB
FROM EMP 
WHERE SAL > (SELECT SAL  FROM EMP WHERE empno='7499');

--45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
 
 SELECT MIN(SAL) FROM EMP; 
 
 SELECT ENAME,JOB,SAL
 FROM EMP
 WHERE SAL=(SELECT MIN(SAL) FROM EMP);
​


​

​

​

​

--46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
SELECT *
FROM (SELECT JOB ,AVG(SAL)
        FROM EMP 
        GROUP BY JOB;)
        WHERE JOB = 'CLERK';

​

​

​

​

--47. 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
SELECT DEPTNO,COUNT(*),MIN(SAL)
FROM EMP 
GROUP BY DEPTNO;
​
SELECT E.ENAME,E.SAL,E2.DEPTNO
FROM EMP E,(SELECT DEPTNO,COUNT(*),MIN(SAL) M FROM EMP GROUP BY DEPTNO) E2
WHERE E.SAL=E2.M
ORDER BY DEPTNO ;

​

​

​

--48. 담당업무가 ANALYST 인 사원보다 급여가 적으면서 업무가 ANALYST가 아닌 사원들을 표시(사원번호, 이름, 담당 업무, 급여)하시오.

SELECT * FROM EMP WHERE JOB='ANALYST';

SELECT E1.EMPNO,E1.ENAME,E1.JOB,E1.SAL
FROM EMP E1,(SELECT * FROM EMP WHERE JOB='ANALYST') E2
WHERE E1.SAL  <  E2.SAL  
;
​

​

​

​

​

--49. 부하직원이 없는 사원의 이름을 표시하시오.

SELECT *
FROM MGR
;--WHERE MGR IS NULL; 

--50. 부하직원이 있는 사원의 이름을 표시하시오.


​

​

​

​

--51. BLAKE와 동일한 부서에 속한 사원의 이름과 입사일을 표시하는 질의를 작성하시오. ( 단 BLAKE는 제외 )


​

​

​

​

--52. 급여가 평균 급여보다 많은 사원들의 사원 번호와 이름을 표시하되 결과를 급여에 대해서 오름차순으로 정렬하시오.


​

​

​

​

​

--53. 이름에 K가 포함된 사원과 같은 부서에서 일하는 사원의 사원 번호와 이름을 표시하시오.


​

​

​

​

​

--54. 부서위치가 DALLAS인 사원의 이름과 부서번호 및 담당업무를 표시하시오.


​

​

​

​

--55. KING에게 보고하는 사원의 이름과 급여를 표시하시오.


​

​

​

​

--56. RESEARCH 부서의 사원에 대한 부서번호, 사원이름 및 담당 업무를 표시하시오.


​

​

​

​

​

--57. 평균 월급보다 많은 급여를 받고 

--이름에 M이 포함된 사원과 같은 부서에서 근무하는 사원의 

--사원 번호, 이름, 급여를 표시하시오.


​

​

​

​

​

--58. 평균급여가 가장 적은 업무를 찾으시오.


​

​

​

​

​

--59. 담당업무가 MANAGER 인 사원이 소속된 부서와 동일한 부서의 사원을 표시하시오.


​