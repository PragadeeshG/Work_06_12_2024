create table if not exists central_logging_system(
central_logging_system_id bigint not null,
code varchar(255) null,
central_logging_system_name varchar(255) null,
central_logging_system_def varchar(255) null,
issue_date varchar(255) null,
benefits varchar(255) null,
maturity_date varchar(255) null,
veerifications varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint central_logging_system_pk primary key(central_logging_system_id));