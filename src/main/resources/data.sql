set sql_safe_updates=0;
set foreign_key_checks = 0;

set @autoid :=0;
update flettappdb.country set id = @autoid:= (@autoid+1);
alter table flettappdb.country auto_increment = 1;

set @autoid :=0;
update flettappdb.state set id = @autoid:= (@autoid+1);
alter table flettappdb.state auto_increment = 1;

set @autoid :=0;
update flettappdb.vehicle_make set id = @autoid:= (@autoid+1);
alter table flettappdb.vehicle_make auto_increment = 1;

set @autoid :=0;
update flettappdb.vehicle_model set id = @autoid:= (@autoid+1);
alter table flettappdb.vehicle_model auto_increment = 1;

set @autoid :=0;
update flettappdb.vehicle_type set id = @autoid:= (@autoid+1);
alter table flettappdb.vehicle_type auto_increment = 1;

set @autoid :=0;
update flettappdb.vehicle_status set id = @autoid:= (@autoid+1);
alter table flettappdb.vehicle_status auto_increment = 1;