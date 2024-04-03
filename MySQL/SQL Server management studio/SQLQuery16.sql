create table Politician(politician_id varchar(20) primary key,firstName varchar(20),middleName varchar(20),lastName varchar(20));
insert into Politician values('101','Ram','Mohan','Patil');
insert into Politician values('102','Sham','Sohan','Mohite');
insert into Politician values('103','Gyan','Rohan','Rathor');
insert into Politician values('104','Rahul','Rajiv','Gandhi');
insert into Politician values('105','Sohan','Sanjay','Ubale');

select * from Politician;

create table Citizen(citizen_id varchar(20) primary key,firstName varchar(20),middleName Varchar(20),lastName varchar(20), Address varchar(50),age int,mobile varchar(10));
insert into citizen values('201','Kishor','Harish','Patil','Amravati',32,'8830109747');
insert into citizen values('202','Kishan','Rohit','Sharma','Pune',23,'9030109747');
insert into citizen values('203','Rohan','Virat','Kohali','Nagpur',25,'9130109747');
insert into citizen values('204','Harsh','Vijay','Rathor','Mumbai',28,'8730109747');
insert into citizen values('205','Pallavi','Harishchandra','Pawar','Goa',27,'7730109747');
select * from citizen;

create table Meeting(meeting_id varchar(20) primary key,meeting_date date,meeting_time time,meeting_issue varchar(50),citizens_id varchar(20) references Citizen(citizen_id),politician_id  varchar(20) references Politician(politician_id));
insert into Meeting values('301','12-03-2023','02:02:02','issue1','202','101');
insert into Meeting values('302','12-03-2023','03:22:32','issue2','201','102');
insert into Meeting values('303','12-03-2023','01:02:52','issue3','203','103');
insert into Meeting values('304','12-03-2023','04:12:32','issue4','202','102');
insert into Meeting values('305','12-03-2023','05:32:42','issue5','201','104');
select * from Meeting;

create table WorkOrder(wo_number varchar(20) primary key,wo_date date,wo_current_status varchar(20),wo_amount_raised int,meeting_id varchar(20) references Meeting(meeting_id));
insert into WorkOrder values('401','2021-04-12','Pending',200000,'302');
insert into WorkOrder values('402','2022-05-12','Completed',340000,'301');
insert into WorkOrder values('403','2023-06-13','Pending',500000,'301');
insert into WorkOrder values('404','2020-07-23','Working',120000,'304');
insert into WorkOrder values('405','2019-08-31','Completed',670000,'305');
select * from WorkOrder;

create table GrantedOrder(grant_id varchar(20) primary key,grant_date date,grant_mode_type varchar(20),grant_amount int,wo_number varchar(20) references WorkOrder(wo_number));
insert into GrantedOrder values('501','2022-12-12','DD',120000,'401');
insert into GrantedOrder values('502','2023-02-23','Check',190000,'402');
insert into GrantedOrder values('503','2021-02-25','Cash',110000,'404');
insert into GrantedOrder values('504','2020-03-11','DD',110000,'401');
insert into GrantedOrder values('505','2020-11-01','Check',90000,'405');
select * from GrantedOrder;

SELECT * FROM Politician;
SELECT * FROM Citizen;
select * from meeting;

SELECT firstName, lastname, p.politician_id, count(meeting_id) as 'meeting count' FROM Politician P, Meeting M
WHERE p.politician_id = m.politician_id group by firstName,lastname, p.politician_id having count(meeting_id) > 1

select count(p.firstName),Address from Politician p,Citizen c,Meeting m where p.politician_id = m.politician_id group by Address;

select * from Citizen;
SELECT * FROM Meeting;

SELECT DISTINCT CITIZEN_ID,AGE,meeting_date,AGE FROM Citizen C, Meeting M 
WHERE C.citizen_id = M.citizens_id
AND
DATEPART(MONTH,MEETING_DATE)=12 AND DATEPART(YEAR,MEETING_DATE)=2023;


SELECT AVG(AGE) FROM Citizen C, Meeting M 
WHERE C.citizen_id = M.citizens_id
AND
DATEPART(MONTH,MEETING_DATE)=12 AND DATEPART(YEAR,MEETING_DATE)=2023;

select DatePart(year,wo_date),DatePart(day,wo_date) from workorder;
SELECT DATEPART(MONTH,MEETING_DATE) FROM Meeting;
SELECT DATEPART(WEEKDAY,MEETING_DATE)  FROM Meeting;

SELECT SUM(WO_AMOUNT_RAISED) FROM WorkOrder;

SELECT SUM(W.WO_AMOUNT_RAISED), C.firstName FROM Citizen C, Meeting M, WorkOrder W
WHERE C.citizen_id = M.citizens_id AND 
M.meeting_id = W.meeting_id GROUP BY C.firstName


select count(c.firstName),wo_current_status 
from Citizen c,Meeting m , workOrder w 
where c.citizen_id=m.citizens_id 
and w.meeting_id = m.meeting_id 
group by wo_current_status;


SELECT * FROM GrantedOrder;
select * from WorkOrder;


-- CITIZEN FNAME, CITY, MEETING DATE, GRANT MODE AND GRANT DATE 
-- WHO HAVE GOT THE GRANT BY CHECK
select c.firstName,c.lastName, c.address , m.meeting_date, g.grant_date, g.grant_mode_type 
from Citizen c,Meeting m, GrantedOrder g,workOrder w 
where c.citizen_id=m.citizens_id 
and w.meeting_id=m.meeting_id 
and w.wo_number = g.wo_number 
and grant_mode_type='Check';

-- SHOW THE POLITICIAN FULLNAME AND NUMBER OF MEETINGS
-- FOR EACH POLITICIAN WITH NUMBER OF MEETINGS IN
-- ASCENDING ORDER
select top (2) concat(p.firstName,' ', p.middleName,' ',p.lastName ) FULLNAME,
count(m.meeting_id) as NumberOfMeetings from Politician p,Meeting m 
where p.politician_id=m.politician_id 
group by p.firstName,p.middleName,p.lastName 
order by count(m.meeting_id) DESC;



--='2023-12-03';

--GROUP BY CITIZEN_ID


----
SELECT * FROM MEETING WHERE meeting_date='2023-12-03';
----
drop function dbo.SHOW_ALL_MEETINGS_OF_A_GIVEN_DATE
----
go
CREATE FUNCTION SHOW_ALL_MEETINGS_OF_A_GIVEN_DATE(@DateToSearch DATE) RETURNS @MEETING_TBL TABLE (MEETING_ID varchar(5), MEETING_ISSUE VARCHAR(10))
	AS
	begin
		INSERT @MEETING_TBL 
		SELECT meeting_id, meeting_issue FROM Meeting WHERE meeting_date=@DateToSearch;
		RETURN
	end;
-------- below line to run it ----
select * from DBO.SHOW_ALL_MEETINGS_OF_A_GIVEN_DATE('2023-12-03');

-- CALCULATE TOTAL NUMBER OF MEETINGS FOR A GIVEN POLITICAN ID
-- AND SHOW THE DETAILS OF THE MEETING AND CITIZEN FIRSTNAME
go
CREATE FUNCTION SHOW_POLITICIAN_MEETING_CITIZEN(@PoliticianId varchar(5)) RETURNS @MeetingInfo TABLE (MEET_COUNT INT, CITIZEN_NAME VARCHAR(10))
	AS
	begin
		INSERT @MeetingInfo 
			SELECT  COUNT(MEETING_ID), C.firstName FROM Politician P, Citizen C, Meeting M
			WHERE P.politician_id =@PoliticianId 
			AND   P.politician_id = M.politician_id 
			AND	  C.citizen_id = M.citizens_id 
			GROUP BY C.firstName
		RETURN
	end;

SELECT * FROM DBO.SHOW_POLITICIAN_MEETING_CITIZEN(101);
SELECT * FROM DBO.SHOW_POLITICIAN_MEETING_CITIZEN(102);

SELECT * FROM DBO.SHOW_POLITICIAN_MEETING_CITIZEN(103);

SELECT * FROM Meeting

SELECT TOP(1) * FROM Meeting ORDER BY meeting_date, meeting_time ASC
SELECT TOP(2) * FROM Meeting ORDER BY meeting_date, meeting_time ASC

 SELECT *  FROM MEETING 
 where datediff(month, MEETING_DATE, getdate()) = -1


 -- ENTER POLITICIANS FIRST NAME AND RETURN TOTAL NUMBER OF MEETINGS
 drop function Pol_First_name;
 Go
 create function Pol_First_name(@Pol_FN varchar(20)) returns @TBL table (firstN varchar(20),meeting_cnt int)
 as
 begin
   Insert @TBL
   select firstName,count(meeting_id) from meeting m,Politician p 
   where p.politician_id = m.politician_id
   and p.firstName = @Pol_FN
   group by p.firstName;
   return
end;
select * from dbo.Pol_First_name('Gyan');


 -- FUNCTION TO ACCEPT THE "REASON OF MEETING" AND SHOW THE ALL CITIZENS
 -- HAVING THAT ISSUE WHO GOT THE APPOINTMENT FROM THE Politician
 -- 1)CITIZEN FIRSTNAME, 2) POLITICIAN NAME AND 3) MEETING DATE
 drop function I_Meet
  create function I_Meet(@Issue varchar(20)) returns @TBL table (firstName varchar(20),politicianName varchar(20),meeting_date date)
  as
  begin
   insert @TBL
   select c.firstName,p.firstName,m.meeting_date from Citizen c,Meeting m, Politician p
   where m.citizens_id = c.citizen_id
   and p.politician_id = m.politician_id
   and  m.meeting_issue=@Issue;
   return
   end;

select * from dbo.I_Meet('issue5');


 




	SELECT  COUNT(MEETING_ID), C.firstName FROM Politician P, Citizen C, Meeting M
	WHERE P.politician_id = M.politician_id AND
	C.citizen_id = M.citizens_id GROUP BY C.firstName




SP_HELP CITIZEN

-- WAP TO ACCEPT CITIZEN ID AND MOBILE NUMBER AND UPDATE THE MOBILE NUMBER
-- OF THE GIVENN CITIZEN ID
GO
CREATE PROCEDURE SHOW_CITIZEN(@CITIZENID VARCHAR(5), @CITIZEN_PHONE VARCHAR(10))
AS
BEGIN
	UPDATE Citizen SET MOBILE=@CITIZEN_PHONE WHERE CITIZEN_ID=@CITIZENID;
END;

SELECT * FROM Citizen
EXEC DBO.SHOW_CITIZEN '201','4204204200'



-- WAP TO SHOW THE CITIZEN ID, FNAME, ADDRESS, MEETING ID FOR THOSE CITIZEN WEHRE STATUS IS PENDING
create procedure stat
as
begin
	select c.citizen_id,c.firstName,c.address,m.meeting_id from Citizen c,Meeting m,workOrder w
	where c.citizen_id = m.citizens_id 
	and w.meeting_id=m.meeting_id
	and w.wo_current_status='Pending';
end;

exec dbo.stat ;



-- WAP TO SHOW THE POLITICIAN WHOSE MEETING IS NOT THERE
create procedure Pol_Not_Meet
as
begin
	select firstname,lastname from Politician where politician_id not IN (select politician_id from meeting);
end;
exec Pol_Not_Meet;


-- WAP TO SHOW THE MEETINGS FOR CITIZEN STAYING IN A GIVEN CITY
drop procedure Meet_city
Go
create procedure Meet_City(@City varchar(20))
As
Begin
	Select c.citizen_id,firstName,c.lastName,c.Address,meeting_id from Meeting m,Citizen c where m.citizens_id = c.citizen_id and c.Address=@City;
End;

Exec DBO.Meet_City Nagpur;


CREATE VIEW POL_CIT_MEETING_VIEW AS 
SELECT P.firstName AS 'POLITICIAN NAME', M.meeting_issue, C.firstName AS 'CITIZEN NAME' FROM Politician P, Meeting M, Citizen C
WHERE P.politician_id = M.politician_id
AND M.citizens_id = C.citizen_id;

SELECT * FROM POL_CIT_MEETING_VIEW;



use hrdb;

select * from citizen;







