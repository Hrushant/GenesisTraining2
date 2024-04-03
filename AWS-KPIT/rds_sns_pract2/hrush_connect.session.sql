create DATABASE bills;
use bills;;

create table utility(month varchar(20), units int, amount int);
insert into utility VALUES("jan",120,870);
insert into utility VALUES("feb",220,900);

delete from utility where month="jan"
select * from utility;