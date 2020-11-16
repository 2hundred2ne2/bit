--2020.11.16

--PHONEbOOK DDL: 테이블 정의서를 참고해서 DDL 작성한다.
drop table PHONEINFO_BASIC;
CREATE TABLE PHONEINFO_BASIC(
    IDX NUMBER(6) CONSTRAINT PI_BASIC_IDX_PK PRIMARY KEY,
    FR_NAME VARCHAR2(20) NOT NULL,
    FR_PHONENUMBER VARCHAR2(20) NOT NULL,
    FR_EMAIL VARCHAR2(20),
    FR_ADDRESS VARCHAR2(20),
    FR_REGDATE DATE DEFAULT SYSDATE

) ;

DESC PHONEINFO_BASIC;
-- 제약 조건 확인 USER_CONSTRAINTS

DESC USER_CONSTRAINTS;


SELECT CONSTRAINT_NAME,CONSTRAINT_TYPE
FROM user_constraints
WHERE TABLE_NAME ='PHONEINFO_BASIC';

--시퀀스 재생기
CREATE SEQUENCE SEQ_DEPT_DEPTNO
MINVALUE 0
START WITH 0
INCREMENT BY 1
;

INSERT INTO phoneinfo_basic 
VALUES(SEQ_DEPT_DEPTNO.nextval, 'sCOTT' , '010-0000-0000' , 'SCOTT@GMAILE.COM' ,'서울',SYSDATE);

INSERT INTO phoneinfo_basic 
VALUES(9, 'KING' , '010-9999-9999' , 'KING@GMAILE.COM' ,'서울',SYSDATE);

INSERT INTO phoneinfo_basic ()
VALUES(9, 'KING' , '010-9999-9999' , 'KING@GMAILE.COM' ,'서울',SYSDATE);
SELECT * FROM phoneinfo_basic;


--데이터 UPDATE
UPDATE PHONEINFO_BASIC
SET FR_EMAIL='KING@NAVER.COM',FR_ADDRESS='부산'
WHERE IDX=9
;

--C(RRATE),R(READ),U(UPDATE),D(DELETE)
--INSERT,SELECT,UPDATE,DELETE

--phoneInfor_univ
drop table phoneInfor_univ ;
CREATE TABLE phoneInfor_univ(
        idx number(6),
        fr_u_major varchar(20) default 'N',
        fr_u_year number(1) default 1 check(fr_u_year between 1 and 4),
        fr_ref number(6) not null,
        constraint pi_univ_idx_pk primary key (idx),
        constraint pi_univ_ref_fk foreign key (fr_ref)  references PHONEINFO_BASIC (idx)
);
desc phoneInfor_univ;
select*from user_constraints where table_name='phoneInfor_univ';

insert into  PHONEINFO_BASIC(idx,fr_name,fr_phonenumber)
values (8,'king','010-999-999');
--crud :대학 친구 입력 
insert into phone 

insert into phoneInfor_univ values(2,'computer',2,8);

--read 
select* from phoneInfor_univ;

select *
from phoneinfo_basic pb,phoneinfo_univ pu
where pb.idx=pu.fr_ref ;


--update :phoneinfo_univ where idx=3;
update phoneinfo_univ 
set fr_u_major='체육',ㄺ_ㅕ;

--delete: idx=10 행을 삭제
DELETE FROM  PHONEINFO_univ WHERE idx = 10;


DELETE FROM  PHONEINFO_BASIC WHERE idx = 10;


--phoneinfor_com
create table phoneinfor_com(
 idx number(6) constraint pi_com_idx_pk primary key,
 fr_c_company varchar2(20) default 'N',
 fr_ref number(6) not null constraint pi_com_ref_fk reference PHONEINFO_BASIC(idx)
 

 );
 
 
 --회사 친구 정보입력
 --기본 정보 
 insert into  PHONEINFO_BASIC(idx,fr_name,fr_phonenumber)
values (11,'손흥민','010-1111-1111');
 
 --회사 정보 입력 
 insert into phoneinfor_com values(1,'도트넘',11);
 --rede
 --회사 친구
 SELECT
     *
 FROM phoneinfo_basic pb,phoneinfor_com pc
 where pb.idx=pc.fr_ref
 ;
 
 
 
 --update phoneinfo_com
 set fr_c_company='레알'
 where idx=1;
 
 --delete
 --자식 테이블의 행부터 삭제하고 부모 테이블 행을 삭제 
DELETE FROM PHONEINFOr_com WHERE fr_ref=11;
delete from phoneinfo_basic where idx=11;