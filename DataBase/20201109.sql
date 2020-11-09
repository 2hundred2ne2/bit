-- 2020.11.09
-- Select 기본

-- scott 계정으로 로그인
-- scott 계정이 소유한 테이블 객체를 확인 : Tab -> 사용자가 가지는 테이블의 정보를 저장하는 데이터 딕셔너리

SELECT * FROM TAB;
--테이블의 구조 확인 :DESC
--테이블의 데이터를 검색하기전 구조를 확인 할 때
DESC EMP;
DESC DEPT;
-- 데이터의 조회 명령 :SELECT
--SELCT 컬럼명 ,...FROM 테이블이름 (조회의 대상)-- 기본 문법
--SELCT의 결과는 ->TABLE 이다!!
SELECT      -- 조회하는 명령어
    *       --컬럼 이름들을 기술해 준다 . 기술하는 순서에 따라 결과도 순서에 맞게 출력
FROM emp    --조회하고자하는 테이블 이름을 기술
;           --SQL의 종료

--부서 테이블의 모든 데이터를 조회하자

SELECT  *
FROM dept
;

--부서테이블에서 ---> FROM 
--부서의  이름과 위치를 출력-->SELECT

SELECT dname,loc
FROM dept 
;
SELECT loc,deptno,dname,dname
FROM dept 
;

-- 모든 사원의 정보를 출력하자 
select *
from emp
;
--사원의 이름,사번,직급(직무)를 포함하는 리스트 출력

SELECT ename,empno,job 
FROM emp
;

--select 절의 컬럼의 사칙연산 가능 
-- 임시 테이블  dual:컬럼은 x를 가지는 테이블  
SELECT
    100+200,100-200,100*10,100/10
FROM dual
;
SELECT ename,sal,sal*12
FROM emp
;

--연봉의 계산을 sal*12*comm으로 계산하자
SELECT ename,sal,sal*12,comm,sal*12+comm
FROM emp
; 
--null: 값은 존재하는데 정해지지 않은 값 
--연산이 불가 : 사칙연산,비교연산

--nvl함수 : null값을 치환해주는 함수 
--nvl(컬럼,대체값) :컬럼의 값이 ull일 때 대체값으로 치환, 이 때 대체값은 컬럼의 맞는 데이터 이어야 한다.
SELECT ename,sal,sal*12,nvl(comm,0),sal*12+nvl(comm,0)
FROM emp
; 

SELECT ename,sal,sal*12 sal12,nvl(comm,0)comm ,sal*12+nvl(comm,0)as "12개월 연봉" --별칭은 큰 따옴표
FROM emp
; 
--데이터베이스의 sql 내부의  문자열 처리는 작은 따옴표
--문자열의 조합

SELECT ename||'의 직무는 '||job||'입니다.'
FROM emp;

--distint:데이터의 중복값을 제거 하고 출력
SELECT deptno
FROM emp;

SELECT DISTINCT deptno
FROM emp;

--SELECT hiredate FROM EMP;



--특정 데이터를 추출하는 where절 
--select 컬럼명 ... from 테이블이름 where 조건식

--급여가 3000이상인 사원들 출력 

select *
from emp
where sal>=3000
;

select  ename,job,sal
from emp
where sal>=3000
;

SELECT ename--,job,sal
from emp
where sal>4000
;
--10번 부서에 소속된 사원들의 리스트를 출력

select ename
from emp
where deptno=10
;
--사원이름이 ford인 사원 찾기
SELECT
    *
FROM emp
where ename='FORD'
;

--81/11/17일에 입사한 사원의 정보 출력 
SELECT
    *
FROM emp
where hiredate='81/11/17'-- 날짜 비교에서도 작은  따옴표로 묶어서 탐색

;

--10번 부서 소속인 사원들 중에서 직급니 MANAGER인 사람을 검색하여 ->
--사원명,부서번호,직급을 출력하려고 한다  
--두 가지 조건을 제시해야한다 ,
--[조건1]10번부서 소속인 사원 : 
--[조건2]직급이 MANAGER인 사원

SELECT ENAME,deptno,JOB
FROM EMP
WHERE deptno=10 OR JOB='MANAGER'
;

--부서번호가 10번이 아닌 사원의
-- 사원이름,부서번호,직급을 출력해봅시다.

SELECT ename,deptno,JOB 
FROM EMP
WHERE dePTNO<>10
--dePNO != 10
--dePNO NOT EMPTNO=10;
;

--2000에서 3000사이의 급여를 받는 사원 조회하기

SELECT
    *
FROM emp
--where sal>=2000 and sal <=3000
where sal between 2000 and 3000 --a이상 b이하의 범위 

;
--1987년에 입사한 사원을 출력해 봅시다.
--1987/01/01~1987/12/31

select *
from emp
--where hiredate BETWEEN '1987/01/01'and '1987/12/31'
where hiredate >= '87/01/01'and hiredate<='87/12/31'
;

--커미션이 300이거나 500이거나 1400인 사원을 검색하기

SELECT
    *
FROM emp
--where comm=300 or comm=500 or comm=1400
where comm in(300,500,1400)
;

--찾으려는 이름이 f로 시작하느 것은 알지만 그 뒤의 문자는 머를 경우
SELECT
    *
FROM emp
--where ename like 'F%'--f로 시작하고 뒤에는 어떤문자가 와도 상관없다. 
--where ename like '%S'-- 이름이 S로 끝나는 이름을 검색 
--where ename like '%A%'--이름에 A문자를 포함하는 이름 
--where ename like '%AD%'
--where ename like '_A%' --첫번째 문자는 어떤 문자든 상관 없고 두 번째 문자는 반드시 A문자를 포함하는 이름을 검색 
--where ename like '__R%' -- 첫번째,두 번째 문자에는 어떤 문자이든 상관없고 , 세번째에는 R문자를 포함하는 이름을 검색 
where ename not like '%A%'
;

--커미션을 받(지 않)는 사원 
SELECT
    *
FROM emp
--where comm is not null and comm>0
where comm is null or comm=0
;
--사원의 리스트를
--급여의 오름차순으로 정렬해보자 
SELECT
    *
FROM emp
--ORDER by sal desc --내림차순 
--order by sal -- 오름 차순 
--order by ename desc 
--order by comm desc
--order by hiredate --날짜의 작다 표현은 오래된 날짜 :오름차순은 오래된 날짜순
ORDER BY hiredate desc,sal asc
;
