create table Departments
(
department_id integer not null primary key
,department_name varchar(255)
,manager_id integer
,location_id varchar (255)
)

create table Employees (
employee_id integer not null primary key,
first_name varchar (255),
last_name varchar(255),
email varchar(255),
phone_number varchar(255),
hire_date varchar(10),
job_id varchar(255),
salary float,
comission_pct float,
manager_id integer,
department_id integer
);

