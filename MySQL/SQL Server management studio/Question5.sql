--Question-05 - Create View -->

--=====================================================================================================================================================================================

--01-->

Create view Patient_view as
Select p.p_first_name,p.p_last_name,p.p_age,d.dr_first_name,a.apo_date,a.apo_time 
from Patient p,Doctor d,Appointment a
where p.patient_id = a.patient_id
and d.doctor_id = a.doctor_id;

Select * from Patient_view;


--=====================================================================================================================================================================================

--02-->

Create view Patient_Bill_view as
Select p.patient_id,p.p_first_name,p.p_middle_name,p.p_last_name,p.address,p.city,p.contact_number,p.p_age,b.bil_number,b.bil_date,b.bil_status,b.bil_amount,pay.payment_id,pay.pay_date,pay.pay_mode,pay.pay_amount
from Patient p,Bill b,Payment pay,Appointment a
where p.patient_id = a.patient_id
and b.apo_number = a.apo_number
and pay.bil_number = b.bil_number;

Select * from Patient_Bill_view;

--=====================================================================================================================================================================================

--03-->

Create View Doctor_view as
Select d.doctor_id,d.dr_first_name,d.de_middle_name,d.dr_last_name,a.apo_number,a.apo_date,a.apo_time,a.apo_reason
from Appointment a,doctor d
where a.doctor_id = d.doctor_id;

Select * from Doctor_view;

--=====================================================================================================================================================================================

--04-->

Create view Doctor_details as
Select d.dr_first_name,d.dr_last_name,p.p_first_name,p.p_last_name,a.apo_date,a.apo_time,a.apo_reason
from Doctor d,Patient p,Appointment a
where a.doctor_id = d.doctor_id
and p.patient_id = a.patient_id;

Select * from Doctor_details;

--=====================================================================================================================================================================================

--05-->

Create view Patient_view as
Select p.patient_id,p.p_first_name,p.p_last_name,p.address,p.city,p.contact_number,p.p_age,pay.payment_id,pay.pay_date,pay.pay_mode,pay.pay_amount 
from patient p,payment pay,bill b,Appointment a
where p.patient_id = a.patient_id
and a.apo_number = b.apo_number
and pay.bil_number = b.bil_number
and b.bil_status = 'Paid';

Select * from Patient_view;

--=====================================================================================================================================================================================



