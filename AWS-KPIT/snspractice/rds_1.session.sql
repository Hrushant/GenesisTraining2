CREATE DATABASE bills;
use bills;
create table utility_bills(Month varchar(20),Units_used int, PayableAmount int);

INSERT INTO utility_bills VALUES("Jan",120,870);
INSERT INTO utility_bills VALUES("Feb",87,730);
INSERT INTO utility_bills VALUES("Mar",92,810);

SELECT * FROM utility_bills;