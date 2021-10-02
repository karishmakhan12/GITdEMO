
CREATE DATABASE employee; 
USE employee;
CREATE TABLE  emp(ID INT,FIRST_NAME CHAR(25),DEPARTMENT CHAR(25),Manager_id INT ,SALARY INT );
INSERT INTO emp(id,first_name,department,manager_id,salary) VALUES
                      (1,'A','D1',NULL,1000),
                      (2,'B','D2',1,5000),
                      (3,'C','D3',1,5000),
                      (4,'D','D2',2,7000),
                      (5,'E','D2',1,1000),
                      (6,'F','D3',2,9000),
                      (7,'G','D1',5,8000),
                      (8,'H','D1',4,3000),
                      (9,'I','D3',3,4000),
                      (10,'J','D2',7,4000);
                      
                      SELECT * FROM empp;
SELECT first_name AS emp_name,salary  AS emp_salary FROM empp   
      SELECT MAX(salary ), first_name FROM empp;
SELECT id,first_name,manager_id FROM empp;
SELECT first_name, manager_id  FROM empp ;
SELECT id , first_name , salary FROM empp  GROUP BY department HAVING salary > AVG(salary) ;
SELECT DISTINCT salary FROM empp ORDER BY Salary DESC ;
use employe1;
SELECT DISTINCT salary FROM empp ORDER BY Salary DESC ;
select id, first_name from empp  where  id=manager_id;
USE employe1;
SELECT  distinct id, first_name  FROM empp JOIN id ON manager_id = id;

use employe1;
SELECT id, first_name FROM empp WHERE (ID IN (SELECT MANAGER_ID FROM empp));
select id, first_name , manager_id from empp JOIN  first_name on manager_id = id;

use employe1;
select e.id

Drop database `newdb`


Alter TAble employee.emp modify column FIRST_NAME ename


















