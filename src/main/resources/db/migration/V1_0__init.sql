create table ticket (
   ticket_number serial NOT NULL PRIMARY KEY,
   created_by text,
   assigned_to text,
   state text
);
insert into ticket (created_by, assigned_to, state) values ('Nageswara', 'Krishna', 'Closed');