Create DATABASE kuber_Cabs_Db;
use kuber_Cabs_Db;

Create table ride_details(ride_no int, driver_name varchar(20), customer_name varchar(20), passenger_count int);

INSERT INTO ride_details VALUES(101,"Rohit","Sohan",10);
INSERT INTO ride_details VALUES(102,"Kishan","Abhi",7);

SELECT * from ride_details;