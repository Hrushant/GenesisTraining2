--Question-03 - Functions -->

--=====================================================================================================================================================================================

--01-->
Go
Create function Appointment_for_given_date(@Given_date date) 
returns @Appointment_Table Table (Appointment_number varchar(6),apo_date date)
As
Begin
	INSERT @Appointment_Table
	Select Apo_number,apo_date from Appointment where apo_date=@Given_date;
	return
END;

Select * from Appointment_for_given_date('2021-08-24');

--=====================================================================================================================================================================================

--02-->

Go
Create function Total_Appointment(@Doctor_id varchar(6)) 
returns @Total_Appointment_Table Table (apoNumber varchar(6),apoDate date,apoTime varchar(20),apoReason varchar(20))
As
Begin
	INSERT @Total_Appointment_Table
	Select  a.apo_number,a.apo_date,a.apo_time,a.apo_reason from Appointment a,Patient p
	where a.patient_id = p.patient_id
	and doctor_id = @Doctor_id;
	return
END;

select * from Total_Appointment('D1');

--=====================================================================================================================================================================================

--03-->

Go
Create function Latest_Appointment_date(@Doc_Id varchar(6))
returns @Latest_Appointment Table (Appointment_Date date)
As
Begin
	INSERT @Latest_Appointment
	Select max(apo_date) from Doctor d,Appointment a
	where d.doctor_id = a.doctor_id
	and d.doctor_id = @Doc_Id
	return
END;

Select * from Latest_Appointment_date('D2');

--=====================================================================================================================================================================================

--04-->

Go
Create function Appointment_Count(@Doc_first_name varchar(20))
returns @Table Table (count_of_Appointment int)
As
Begin
	INSERT @Table
	Select count(a.apo_number) from Doctor d,Appointment a
	where d.doctor_id=a.doctor_id
	and d.dr_first_name=@Doc_first_name;
	return
END;

Select * from Appointment_Count('Rohan');

--=====================================================================================================================================================================================

--05-->

Go
Create function Appointment_Reason(@Appo_Reason varchar(30))
Returns @Appointment_Reason_Table Table (Patient_First_name varchar(20),doctor_first_name varchar(20),apo_date date,apo_reason varchar(20))
As
Begin
	INSERT @Appointment_Reason_Table
	Select p.p_first_name as 'Patient Name',d.dr_first_name,a.apo_date,a.apo_reason from Appointment a,Patient p,Doctor d
	where a.patient_id = p.patient_id
	and d.doctor_id = a.doctor_id
	and a.apo_reason=@Appo_Reason;
	Return
END;

Select * from Appointment_Reason('Nasal block');

--=====================================================================================================================================================================================
