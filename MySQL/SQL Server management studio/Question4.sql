--Question-04 - Stored Procedure --> 

--=====================================================================================================================================================================================

--01-->
use hrdb;
drop procedure Updation_Of_phoneNumber;
Create procedure Updation_Of_phoneNumber(@pit_id varchar(20),@phone_number varchar(20))
As
Begin
	Declare @patient_id varchar(6)

	Select @patient_id=patient_id from Patient where patient_id=@pit_id;
	if(@patient_id is NULL)
		select 'ID NOT found'
	else
		Update patient Set contact_number = @phone_number
		where patient_id = @pit_id
End;

Execute Updation_Of_phoneNumber 'P001','1212121212';


--=====================================================================================================================================================================================

--02-->

Create procedure Bill_status
As
Begin
	Select p.patient_id,p.p_first_name,p.address,a.apo_number,b.bil_amount 
	from Patient p,Appointment a,Bill b 
	where b.bil_status='Not Paid'
	and p.patient_id = a.patient_id
	and b.apo_number = a.apo_number
	order by a.apo_number DESC;
End;

Execute Bill_status;

--=====================================================================================================================================================================================

--03-->

Create procedure Doctor_Not_Having_Appointment
As
Begin
	Select d.doctor_id,concat(d.dr_first_name,' ',d.dr_last_name) as 'FULL NAME' 
	from Doctor d where d.doctor_id NOT IN (Select doctor_id from Appointment)
	Order by d.doctor_id DESC;
END;

Execute Doctor_Not_Having_Appointment;

--=====================================================================================================================================================================================

--04-->

Create procedure patient_living(@city varchar(20))
As
Begin
	select concat(p.p_first_name,' ',p.p_middle_name,' ',p.p_last_name) as 'Patients FULL NAME',a.apo_date,concat(d.dr_first_name,' ',d.de_middle_name,' ',d.dr_last_name) as 'Doctors FULL NAME' 
	from Appointment a,patient p,doctor d 
	where a.doctor_id = d.doctor_id
	and a.patient_id = p.patient_id
	and p.city = @city;
End;

Exec patient_living Amravati;

--=====================================================================================================================================================================================

--05-->
drop procedure Total_bill_amount_procedure;
Create procedure Total_bill_amount_procedure(@patient_id varchar(6),@total_bill_amount decimal(7,2) OUT)
As
Begin
	select @total_bill_amount =  pay_amount from payment pay,Bill b,Patient p,Appointment a 
	where pay.bil_number = b.bil_number
	and b.apo_number = a.apo_number
	and p.patient_id = a.patient_id
	and p.patient_id = @patient_id;
End;

Declare @total_bill decimal(7,2)
Exec Total_bill_amount_procedure 'P001',@total_bill OUTPUT;
Select @total_bill as 'Total_Value'


--=====================================================================================================================================================================================
