START TRANSACTION;

DROP TABLE IF EXISTS member, interest_group, event,member_event,group_member CASCADE;
--rollback;

--CREATE MEMBER TABLE
CREATE TABLE member
(
	member_number serial,
	last_name varchar(30) not null,
	first_name varchar(30) not null,
	phone varchar(12) null,
	email varchar(30) null,
	date_of_birth date not null,
	reminder_email_flag boolean not null,


	constraint pk_member primary key (member_number)
);


--CREATE Interest Group TABLE
CREATE TABLE interest_group
(
	group_number serial,
	group_name varchar(20) not null,
	

	constraint pk_group primary key (group_number)
);


--CREATE Member + Interest Group JOIN table
CREATE TABLE group_member
(
	member_number int,
	group_number int,

	constraint pk_group_member primary key (member_number, group_number),
	constraint fk_group_member_member foreign key (member_number) references member(member_number),
	constraint fk_group_member_interest_group foreign key (group_number) references interest_group(group_number)
);



--CREATE Event table
CREATE TABLE event
(
	event_number serial,
	event_name varchar(20) not null,
	event_description varchar(100) null,
	start_date_time timestamp not null,
	duration_minutes int not null,
	group_number int null,

	constraint pk_event primary key (event_number)
);

--CREATE Interest Group  + Event JOIN table
CREATE TABLE member_event
(
	member_number int,
	event_number int,


	constraint pk_member_event primary key (event_number, member_number),
	constraint fk_member_event_event foreign key (event_number) references event(event_number),
	constraint fk_member_event_member foreign key (member_number) references member(member_number)
);


COMMIT;
 
 --select all tables
select * from member 
join group_member on member.member_number = group_member.member_number
join interest_group on group_member.group_number = interest_group.group_number
join event on interest_group.group_number = event.group_number
join member_Event on event.event_number = member_event.event_number


--INSERTS
--member
INSERT into member(last_name,first_name, phone,email,date_of_birth,reminder_email_flag)
VALUES ('Smith','Clarence', '525-628-5923','lovesfish23@hotmail.com','08/20/1965', true),('Pepperidge','Peter', null,'peteisayahoo@yahoo.com','12/31/1982', false),('Doe','John', null,null,'01/01/1990', false),('Doe','Jane', null,null,'01/01/1990', false), ('Claus','Stan','605-313-4000','verymerry@indeed.com','12/01/1800', true), ('Bob','McDonald','740-111-8672','eieio@farm.com','06/17/2024', true), ('Higgins','Boe', null,'forwork123@outlook.com','03/21/1970', true),('Gentry','Kyle', '740-645-5555','kgentry2001@gmail.com','07/03/2001', false);

--interest group
INSERT into interest_group(group_name)
VALUES ('the cool guys'),('the not cool guys'),('the developers');

--event
INSERT into event(event_name, event_description, start_date_time, duration_minutes, group_number)
VALUES ('Nicks BirthDay','Probably cooler than your party.','2024-06-08 04:05:06', 120, 2),('Junteenth','The 19th of June','2024-06-18 00:00:01', 1440, 1),('Jerrys BirthDay','Probabley lame.','2024-06-08 04:05:06', 60, 3);

--group member
INSERT into group_member(member_number,group_number)
VALUES (3,1),(4,2),(2,2),(4,1),(5,3),(6,3),(7,2),(8,1);

--group member
INSERT into member_event(member_number,event_number)
VALUES (1,1),(3,1),(8,3),(5,2),(5,1),(6,3),(3,3),(3,2),(4,2);
