SELECT w.worker_id id FROM worker w;
SELECT first_name AS worker_name FROM worker;
SELECT UPPER(first_name) FROM worker;
SELECT  DISTINCT department FROM worker;
SELECT SUBSTRING(first_name ,1,3) FROM worker;
SELECT INSTR(first_name,BINARY'a') FROM worker WHERE first_name='amitabh';
SELECT RTRIM(first_name) FROM worker;
SELECT LTRIM(first_name) FROM worker;
SELECT DISTINCT LENGTH(department) FROM worker;
SELECT REPLACE(first_name,'a','A') FROM worker;
SELECT CONCAT(first_name,' ',last_name )AS 'complete_name' FROM worker;
SELECT * FROM worker ORDER BY first_name ASC;
SELECT * FROM worker ORDER BY first_name ASC , department DESC;
SELECT * FROM worker WHERE first_name IN ('vipul','satish');
SELECT * FROM worker WHERE first_name NOT IN ('vipul','satish');
SELECT * FROM worker WHERE department LIKE 'admin';
SELECT * FROM worker WHERE first_name LIKE '%a%';
SELECT * FROM worker WHERE first_name LIKE'%a';
SELECT * FROM worker WHERE first_name LIKE '......h';
SELECT * FROM worker WHERE  salary BETWEEN 100000 AND 500000;
SELECT * FROM worker WHERE YEAR(joining_date) =2014 AND MONTH(joining_date)=2 ;
SELECT COUNT(*) FROM worker WHERE department='admin' ;
SELECT first_name AS worker_name FROM worker WHERE salary BETWEEN 50000 AND 100000;??????
SELECT  COUNT(*)FROM worker  department ;
SELECT DEPARTMENT, COUNT(WORKER_ID) no_of_worker FROM worker GROUP BY DEPARTMENT  ORDER BY no_of_worker DESC;
SELECT DISTINCT W.FIRST_NAME, T.WORKER_TITLE FROM worker w JOIN title T ON w.worker_id= t.worker_ref_id AND t.worker_title IN ('manager');
SELECT worker_title, affected_from, COUNT(*) FROM Title GROUP BY  worker_title, affected_from  HAVING COUNT(*)>1;
SELECT * FROM worker  ORDER BY salary  DESC LIMIT 10;
SELECT   DISTINCT w.worker_id,w.first_name ,w.salary FROM worker w  , worker w1 WHERE w.salary=w1.salary AND w.worker_id != w1.worker_id;
SELECT MAX(salary) FROM worker WHERE salary NOT IN ( SELECT MAX(salary)  FROM worker);
SELECT department,COUNT(worker_id )FROM worker GROUP BY department HAVING COUNT(worker_id)<5;
SELECT department,COUNT(department ) FROM worker GROUP BY department ;
SELECT * FROM worker WHERE worker_id IN (SELECT worker_id FROM worker);
SELECT * FROM Worker WHERE WORKER_ID = (SELECT MAX(WORKER_ID) FROM Worker);
SELECT * FROM worker WHERE worker_id =(SELECT MIN(worker_id) FROM worker);
SELECT * FROM worker WHERE worker_id<=5;
SELECT DEPARTMENT, SUM(Salary) FROM worker GROUP BY DEPARTMENT;
SELECT FIRST_NAME, SALARY FROM Worker WHERE SALARY=(SELECT MAX(SALARY) FROM Worker);

 