show databases;
use mkd;
show tables;
select * from account where 1;
select * from contact where 1;
select * from opportunity  where 1;
select * from contact_status;
select * from country;
select * from opportunity_sales_stage;
alter table opportunity  add Column Contact_id int;

insert into opportunity (name,sales_stage,amount,close_date,account_id) values ('L&T',3,5000000,'2021-12-12',4);
insert into opportunity (name,sales_stage,amount,close_date,account_id) values ('L&T11',1,5000000,'2021-12-12',5),('L&T12',9,5000000,'2021-12-12',9),('L&T13',9,5000000,'2021-12-12',4),('L&T11',9,5000000,'2021-12-12',7),('L&T19',8,5000000,'2021-12-12',4);
insert into account values (2,'malik0','',9000000,56,'sdjcnidjncisjdn');
insert into account values (2,'malik0','4',9000000,56,'sdjcnidjncisjdn');

SELECT a.name as parent_account, b.name as child_account FROM account a INNER JOIN account b ON a.id=b.parent_account_id;
select * from account where parent_account_id = '';
SELECT * FROM account  WHERE id NOT IN(SELECT b.parent_account_id FROM account a INNER JOIN account b ON a.id=b.parent_account_id);
select * from account;
SELECT  a.id, a.name, b.name  FROM account a, account b WHERE  a.parent_account_id= b.id;

select id,parent_account_id,name,count(parent_account_id) from account group by parent_account_id ORDER BY COUNT(id) DESC;
select count(id) from account where id=parent_account_id;
#fdcdfcdf
select id,name,max(parent_account_id) from account group by parent_account_id;
 select parent_account_id,count(id) from account group by parent_account_id;
 select account.id,account.name,count(*) from account acc inner join account ON account.id=acc.parent_account_id group by acc.parent_account_id;
 
  
  # highest 
select parent_account_id,count(id) from account group by parent_account_id  order by count(id) desc limit 0,1;
select name from account where id=(select parent_account_id from account group by parent_account_id  order by count(id) desc limit 0,1);

SELECT a.id as parent_account_id,a.name as parent,Count(b.id) as child_count
FROM account a 
INNER JOIN account b
ON a.id=b.parent_account_id
GROUP BY parent_account_id  ORDER BY b.id DESC LIMIT 0,1;

select a.name,a.id,o.name,count(o.account_id) from opportunity as o right join account as a on o.account_id=a.id group by account_id order by count(o.account_id)  desc limit 0,1;
select a.name,a.id,o.lastname,count(o.account_id) as Total_contacts from contact as o right join account as a on o.account_id=a.id group by account_id order by count(o.account_id)  desc limit 0,1;
 #second highest
select a.name,a.id,o.name,count(o.account_id) from opportunity as o right join account as a on o.account_id=a.id group by account_id order by count(o.account_id)  desc limit 1,1;
select a.name,a.id,o.lastname,count(o.account_id) as Total_contacts from contact as o right join account as a on o.account_id=a.id group by account_id order by count(o.account_id)  desc limit 1,1;
 
 
 
Select a.name from contact c ,account a where a.id = (Select account_id from contact group by account_id limit 1) limit 1;
Select a.name from contact c ,account a where a.id = (Select min(account_id) from contact group by account_id  order by account_id desc limit 1) limit 1;
select account_id,count(id) from contact group by account_id;
select count(id) from contact group by account_id limit 1;
Select account_id from contact group by account_id limit 1;
Select a.name from opportunity o ,account a where a.id = (Select min(account_id) from opportunity group by account_id  order by account_id desc limit 1) limit 1;


select id,count(parent_account_id) from account group by parent_account_id;
select account_id,count(id) as Total_contact from opportunity  group by id;
select account_id,count(id) as Total_contact from contact  group by account_id;



select o.id,o.name,o.amount,s.name as Stage from opportunity as o ,opportunity_sales_stage as s where s.name='closed won' AND o.amount > 1000000;
select concat(firstname, ' ',lastname,'!!') as Full_Name from contact;
select sales_stage,count(*) as Accounts_Count from opportunity group by sales_stage;

select c.lastname,o.name,o.contact_id from contact as c  right join opportunity as o ON  c.id=o.contact_id where   c.status='1' ;


