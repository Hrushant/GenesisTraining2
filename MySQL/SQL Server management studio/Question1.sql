--Question-01 - Creating Table and Inserting Data -->

--Creating database;
Create database HRDB;
use HRDB;

--Creation of table-->
create table Doctor(doctor_id varchar(6) primary key,dr_first_name varchar(15),de_middle_name varchar(15),dr_last_name varchar(15));
--inserting the records-->
insert into Doctor values('D1','Nancy','Jennifer','John');
insert into Doctor values('D2','Rohan','Madhav','Patil');
insert into Doctor values('D3','Keshav','Sunil','Thorat');
insert into Doctor values('D4','Ishwar','Mukesh','Kokate');
insert into Doctor values('D5','Harsh','Suresh','Gandhi');
insert into Doctor values('D6','Harish','Mukesh','Rathor');
insert into Doctor values('D7','Kishan','Suresh','Ubale');
select * from doctor;

--Creation of table-->
create table Patient(patient_id varchar(6) primary key,p_first_name varchar(15),p_middle_name varchar(15),p_last_name varchar(15),address varchar(30),city varchar(15),contact_number varchar(10),p_age int);
--inserting the records-->
insert into Patient values('P001','Steva',NULL,'William','423, || cross street','Mumbai','8830109747',23);
insert into Patient values('P002','Stanes',NULL,'William','423, || cross street','Mumbai','9430109747',25);
insert into Patient values('P003','Om','Nilesh','Pande','416, || Near Ashirwaad Ashram','Pune','9090109747',20);
insert into Patient values('P004','Abhi','Kishor','Patil','417, || cross street','Pune','7777109747',16);
insert into Patient values('P005','Pranav','Jaykumar','Bhonde','Near Shri Datt Temple','Amravati','8989109747',29);
insert into Patient values('P006','Yash','Rajesh','Malik','Near old bus stand','Akola','8000109747',30);
insert into Patient values('P007','Sanskar','Sunil','Puri','Near old bus cross street','Akola','8833109747',31);
insert into Patient values('P008','Jivesh','Rajesh','Suryawanshi','Near shri datt temple','Amravati','8899109747',19);
select * from Patient;

--Creation of table-->
create table Appointment(apo_number varchar(6) primary key,apo_date date,apo_time varchar(8),apo_reason varchar(30),doctor_id varchar(6) references Doctor(doctor_id),patient_id varchar(6) references Patient(patient_id));
--inserting the records-->
insert into Appointment values('A1','2021-08-24','01:00:00','Headache','D1','P001');
insert into Appointment values('A2','2021-07-20','01:10:00','Nasal block','D3','P002');
insert into Appointment values('A3','2021-08-24','02:00:00','Back pain','D1','P004');
insert into Appointment values('A4','2021-07-26','02:05:00','Headache','D2','P003');
insert into Appointment values('A5','2021-08-21','01:20:00','Nasal block','D4','P005');
insert into Appointment values('A6','2023-07-15','01:28:00','Back pain','D2','P005');
insert into Appointment values('A7','2023-07-21','03:20:00','Back pain','D5','P003');
select * from Appointment;

--Creation of table-->
create table Bill(bil_number varchar(6) primary key,bil_date date,bil_status varchar(8),bil_amount decimal(7,2),apo_number varchar(6) references Appointment(apo_number));
insert into Bill values('B01','2021-08-24','Paid',1000,'A1');
insert into Bill values('B02','2021-07-20','Pending',900,'A2');
insert into Bill values('B03','2021-08-19','Paid',1200,'A1');
insert into Bill values('B04','2021-07-26','Pending',1300,'A3');
insert into Bill values('B05','2021-07-26','Paid',700,'A4');
insert into Bill values('B06','2021-07-19','Not Paid',900,'A5');
select * from Bill;

--Creation of table-->
create table Payment(payment_id varchar(6) primary key,pay_date date,pay_mode varchar(20),pay_amount decimal(7,2),bil_number varchar(6) references Bill(bil_number));
--inserting the records-->
insert into Payment values('1001','2021-07-21','Cash',1000,'B01');
insert into Payment values('1002','2021-08-28','Paytm',900,'B01');
insert into Payment values('1003','2021-08-29','Paytm',900,'B02');
insert into Payment values('1004','2021-08-29','Cash',700,'B04');
insert into Payment values('1005','2021-07-25','Cash',700,'B03');
insert into Payment values('1006','2021-07-25','Check',7000,'B05');
select * from Payment;


