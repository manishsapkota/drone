create table drone(
	drone_id integer NOT NULL, 
	model VARCHAR(50) NOT NULL,
   serial_number VARCHAR(100) NOT NULL, 
   weight_limit integer NOT NULL, 
   battery_capacity integer NOT NULL,
   STATE VARCHAR(20) NOT NULL,
   PRIMARY KEY(drone_id)
);

create table medicine(
medicine_id integer not null,
medication_name VARCHAR(100) not null,
weight integer not null,
code VARCHAR(20),
case_image BLOB(10K),
drone_id integer not null,
PRIMARY KEY(medicine_id),
CONSTRAINT fk_med_drone foreign key (drone_id) references drone(drone_id)
);

	