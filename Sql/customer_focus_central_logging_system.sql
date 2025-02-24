create table if not exists customer_focus_central_logging_system(
central_logging_system_id bigint not null,
customer_id varchar(255) null,
collaterals varchar(255) null,
bonds varchar(255) null,
deposits varchar(255) null,
loan_unit bigint null,
multi_loan_curr varchar(255) null,
repay_applicable char null,
capital bigint null,
annual_return bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint customer_focus_central_logging_system_pk primary key(central_logging_system_id));