--Question-02 - Joins and subquery -->

--=====================================================================================================================================================================================

--01-->
use hrdb;
Select concat(d.dr_first_name,' ',d.dr_last_name) as 'Doctor Name',count(apo_number) as Count_Of_Appointments 
from Doctor d,Appointment a,Patient p
where p.patient_id = a.patient_id
and a.doctor_id = d.doctor_id
group by d.doctor_id,d.dr_first_name,d.dr_last_name;

--=====================================================================================================================================================================================

--02-->
Select AVG(p_age) as 'Avg_age_of_Patients' 
from Appointment a,Patient p 
where a.patient_id = p.patient_id 
and DATEPART(month,apo_date) = 7 
and DATEPART(year,apo_date) = 2021;


--=====================================================================================================================================================================================

--03-->
Select concat(p.p_first_name,' ',p.p_last_name) as 'Patient Name',sum(bil_amount) as 'Total Bill' 
from Bill b,Patient p, Appointment a 
where b.apo_number = a.apo_number
and p.patient_id = a.patient_id 
group by p.p_first_name,p.p_last_name;

--=====================================================================================================================================================================================

--04-->
Select p.p_first_name,p.city,a.apo_date,pay.pay_mode,pay.pay_date 
from Patient p,Appointment a,Payment pay,Bill b 
where p.patient_id = a.patient_id
and a.apo_number = b.apo_number
and pay.bil_number = b.bil_number 
and pay.pay_mode = 'Cash';

--=====================================================================================================================================================================================

--05-->
Select concat(d.dr_first_name,' ',d.de_middle_name,' ',d.dr_last_name) as 'Full Name',count(a.apo_number) as 'Total Appointments' 
from Doctor d,Appointment a
where d.doctor_id = a.doctor_id
group by d.dr_first_name,d.de_middle_name,d.dr_last_name
Order by count(a.apo_number) DESC;

--=====================================================================================================================================================================================


