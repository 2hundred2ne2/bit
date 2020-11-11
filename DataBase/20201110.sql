--2020.11.10
--함수
--단일행 ,집합함수
--단일행 함수 : 숫자 ,문자,날짜,변환
DESC DUAL; -- 데이터를 저장하기 위한 목적이 아니라 함수의 결과를 출력해보기위한 것 
--숫자함수
SELECT  ABS(-15.5)FROM DUAL; 
SELECT  FLOOR(15.7)FROM DUAL; 
SELECT ROUND(15.6) FROM DUAL;       -- 반올림 
SELECT ROUND(15.612,1) FROM DUAL;   -- 몇번째 자리 수 까지 ?
SELECT ROUND(15.636,2) FROM DUAL;
SELECT LOG(10,100) FROM DUAL;       -- 지수 구해준다
SELECT POWER(2,8) FROM DUAL;        --2의 8승

--문자함수 
SELECT CONCAT('나는 ','손흥민 입니다') FROM DUAL;
SELECT CONCAT('저의 이름은 ',ENAME) FROM EMP WHERE JOB='MANAGER';
SELECT LOWER('MR. SCOTT MCMILLAN') "Lowercase" FROM DUAL ;
SELECT LOWER(ENAME) FROM EMP ;
SELECT LPAD('Page 1',15,'*.') FROM DUAL ;
SELECT RPAD('961116-2',15,'*') FROM DUAL ;
SELECT SUBSTR('ABCDEFG',3,4) FROM DUAL ; --지정된 부분부터  N개의 문자를 뽑는다
SELECT RPAD(SUBSTR('961116-2238618',1,8),15,'*') FROM DUAL ;
SELECT LTRIM('     =FROM=',' ')FROM DUAL;
SELECT LTRIM(' ====FROM========     ','=')FROM DUAL;
SELECT TRIM( ' ' FROM '     ====FROM===     ' )AS "FROM" FROM DUAL; 
SELECT  REPLACE('JACK and JUE','J','BL') FROM DUAL;
SELECT  REPLACE('000000-0000000','-','') FROM DUAL;

--날짜 함수 
SELECT SYSDATE FROM DUAL;            --오늘 날짜
SELECT SYSDATE+14 FROM DUAL;  
SELECT SYSDATE+21 FROM DUAL;
SELECT SYSDATE-3 FROM DUAL; 

SELECT ADD_MONTHS(SYSDATE,4) FROM DUAL;
SELECT LAST_DAY(SYSDATE) FROM DUAL;

--변환함수 
--TO_CHAR: 날짜 ->문자,숫자->문자

--날짜-> 문자
SELECT SYSDATE, TO_CHAR(SYSDATE,'YYYY.MM.DD DAY DY AM PM HH HH24 MI SS') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE,'YYYY.MM.DD. HH24:MI:SS') FROM DUAL;

--숫자->문자
SELECT TO_CHAR (100000.123,'L000,000.00') FROM DUAL;
SELECT TO_CHAR (10000,'L999,999.99') FROM DUAL;
SELECT ENAME,JOB,SAL, TO_CHAR(SAL*1100*12+NVL(COMM,0)*1100,'L99,999,999') FROM EMP ORDER BY SAL DESC; 

-- 문자-> 날짜 
--2020.11.16.
SELECT  TO_DATE('2009/09/05','YYYY/MM/DD') FROM DUAL;
SELECT  TO_DATE('2020/11/16','YYYY/MM/DD') FROM DUAL;

--오늘이 2020년 1월 1일에서 몇일이 지났는지 확인 

SELECT TRUNC(SYSDATE- TO_DATE('20-01-01','YY-MM-DD'))FROM DUAL;

--내가 몇일 살았는지 확인 
SELECT TRUNC(SYSDATE - TO_DATE('1990-08-20','YY-MM-DD'))FROM DUAL;

--문자 -> 숫자 
SELECT TO_NUMBER('1000000.00', '9999999.99')/TO_NUMBER('1000000.00', '9999999.99') FROM DUAL;


--DECODE 함수 :SWITCH문과 비슷하다.
--사원이름 ,부서번호,부서 이름 출력

SELECT ENAME,DEPTNO,
DECODE(DEPTNO, 
        10, 'ACOUNTING', --DEPTNO=10 이면 
        20, 'RESEARCH',  --DEPTNO=10 이면
        30,'SALES' ,     --DEPTNO=10 이면
        40,'OPERATIONS' --DEPTNO=10 이면
 )AS DNAME
FROM EMP 
ORDER BY DEPTNO
;

--직급에 따라 급여를 인상하도록 하자 
--직급이 'ANALYST'인 사원은 5%
--직급이 'SALESMAN'인 사원은 10%
--직급이 'MANAGER'인 사원은 15%
--직급이 'CLERK'인 사원은 20%

SELECT ENAME, SAL,
DECODE( JOB,
'ANALYST'=SAL*1.05,
'SALESMAN'=SAL*1.1,
'MANAGER'=SAL*1.15,
'CLERK'=SAL*1.2
)AS UPSAL
FROM EMP 
;

SELECT ENAME,DEPTNO,
        CASE 
            WHEN DEPTNO=10 THEN 'ACCOUNTING'
            WHEN DEPTNO=20 THEN 'RESEARCH'
            WHEN DEPTNO=30 THEN 'SALES'
            WHEN DEPTNO=40 THEN 'OPERATION'
        END AS DNAME
        FROM EMP;
      --  ORDER BY dNAME;
      
    --그룹함수 : 하나의 행의 컬럼을 대상이 아닌 행의 그룸의 컬럼들을 묶어 구룸화하고 연산하는 함수
    --그룹함수 : SUM,AVG,COUNT,MAX,MIN
    
    SELECT TO_CHAR (SUM(SAL)*1100,'L999,999,999') AS "월 급여 총액 ",
    ROUND(AVG(SAL),2)*1100 AS "월급여 평균",
    COUNT(SAL)AS "급여 사원의 수",
    COUNT(COMM)AS "커미션 수",
    MAX(SAL)AS "가장 큰 금액 ",
    MIN(SAL)AS"가장 작은 금액"
    FROM EMP ;
    
    SELECT
    SUM(COMM),
    AVG(NVL(COMM,0)),
    COUNT(NVL(COMM,0)),
    MAX(COMM),
    MIN(COMM)
    FROM EMP
    ;
    
    --전체 행을 구한다 
    SELECT
        COUNT(*)
        AS"MANAGERDML 수 " , AVG(SAL)AS "매니저의 평균 ",
         MAX(SAL),
         MIN(SAL)
    FROM EMP
  WHERE JOB='MANAGER';
  
  --작무의 개수

SELECT COUNT(DISTINCT JOB)
   FROM emp 
   ORDER BY JOB
;

--특정 기준으로 그룹핑 : GROUP BY 컬럼
SELECT DEPTNO
FROM EMP
GROUP BY DEPTNO;
 --각 부서의 소속인원을 구하자 

 
SELECT DEPTNO,COUNT(*)"CNT"
FROM EMP
GROUP BY DEPTNO
--ORDER BY CNT DESC;
ORDER BY  DEPTNO DESC;
 --각 부서별  총 급여액 출력
 --GROUP BY DEPTNO: 부서별로 그룹필
 SELECT DEPTNO,SUM(SAL)
FROM EMP
GROUP BY DEPTNO
--ORDER BY CNT DESC;
ORDER BY  DEPTNO;

--부서별 급여 평균
SELECT DEPTNO,ROUND(AVG(SAL),2)
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO 
;

--부서별 급여 최고 금애과 최소 금액을 출력

SELECT DEPTNO ,MAX(SAL)-MIN(SAL)
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO
;
-- 부서별로 그룹지은 후
--그룹 지어진 부서별 평균급여
--평균 급여가 2000 이상인 
--부서번호와 부서별 평균 급여를 출력

SELECT DEPTNO ,AVG(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING NOT AVG(SAL)<2000
ORDER BY DEPTNO
;
--부서별의 급여의 최대값 최소값을 구하되 
--최대 급여가 2900이상인 부서만 출력합니다
SELECT DEPTNO ,MAX(SAL),MIN(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING MAX(SAL)>=2900
ORDER BY DEPTNO
;
-- 직무별 지표 : 사원의 수 ,급여의 총합 ,평균 급여,최대급여 최소급여 
SELECT JOB ,COUNT(*)||'명' AS "사원수",
            to_char(SUM(SAL)*1100,'L999,999,999') AS "급여 총합",
           to_char(AVG(SAL)*1100,'L999,999,999') as "평균급여",
            to_char( MAX(SAL)*1100,'L999,999,999')"최대급여",
            to_char( MIN(SAL)*1100,'L999,999,999')"최소급여"
FROM EMP
GROUP BY JOB;
--WHERE job !='PRESIDENT'
