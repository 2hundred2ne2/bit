--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.

--(5) 박지성이구매한도서의출판사수



SELECT COUNT(PUBLISHER)
FROM BOOK B ,orders O , customer C 
WHERE b.bookid=O.BOOKID AND C.CUSTID = O.CUSTID 
AND NAME='박지성'
GROUP BY NAME
;


​

​

--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이

SELECT BOOKNAME,(PRICE-SALEPRICE)AS "PRICEGAP"
FROM BOOK B ,orders O , customer C 
WHERE b.bookid=O.BOOKID AND C.CUSTID = O.CUSTID 
AND NAME='박지성' 
;
​



--(7) 박지성이구매하지않은도서의이름

SELECT BOOKNAME
FROM BOOK B ,orders O , customer C 
WHERE b.bookid=O.BOOKID AND C.CUSTID = O.CUSTID 
AND NAME !='박지성' 
;
​

​

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.

--(8) 주문하지않은고객의이름(부속질의사용)




SELECT NAME
FROM customer C  
WHERE NAME NOT IN(SELECT NAME
FROM BOOK B ,orders O , customer C  
WHERE b.bookid=O.BOOKID AND C.CUSTID = O.CUSTID 
)
;


--(9) 주문금액의총액과주문의평균금액


​

​
SELECT  sum(saleprice),avg(saleprice) 
FROM BOOK B ,orders O , customer C 
WHERE b.bookid=O.BOOKID AND C.CUSTID = O.CUSTID
group by  saleprice
;​
​

--(10) 고객의이름과고객별구매액


SELECT name,sum(saleprice)
FROM BOOK B ,orders O , customer C 
WHERE b.bookid=O.BOOKID AND C.CUSTID = O.CUSTID
group by name  
;​

​

​

​

--(11) 고객의이름과고객이구매한도서목록


​

​

SELECT name ,bookname
FROM BOOK B ,orders O , customer C 
WHERE b.bookid=O.BOOKID AND C.CUSTID = O.CUSTID
;​
​

​

--(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문


select max(b.price-o.saleprice)
from orders o,book b
where o.bookid=b.bookid 
;
​
select
from orders o,book b
where o.bookid=b.bookid 
and b.price-o.saleprice =
(
    select max(b.price-o.saleprice)
 from orders o,book b
where o.bookid=b.bookid 

);


​

--(13) 도서의 판매액평균보다 자신의 구매액평균이더 높은고객의이름

--판매액평균
select avg(saleprice)from orders;

--자신의 구매액 평균

select c.name, avg(saleprice)
from customer c,orders o
where c.custid=o.custid
group by  c.name
having   (select avg(saleprice)from orders)>avg(saleprice)
;
​

​

​

--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.

--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select *
from customer c, book b,orders o
where c.custid=o.custid and b.bookid=o.bookid
and c.name ='박지성'
;

select *
from customer c, book b,orders o
where c.custid=o.custid and b.bookid=o.bookid
and b.publisher in(
select publisher
from customer c, book b,orders o
where c.custid=o.custid and b.bookid=o.bookid
and c.name ='박지성'

)
;
​

--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름

select 
