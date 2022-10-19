-- Auto-generated SQL script #202210121338
INSERT into aircraft_models (description)
	VALUES ('Comericiais');
	

INSERT INTO aircraft (code,model_id)
	VALUES ('Boeing 737',1);


INSERT INTO users ("name",email,"password")
	VALUES ('Luciano Cordeiro','lacs@teste.com','1234567');


INSERT INTO users ("name",email,"password")
	VALUES ('Lívian','livian@teste.com','1234567');


INSERT INTO users ("name",email,"password")
	VALUES ('Líris','liris@teste.com','1234567');


INSERT INTO public.locations (country,state,city)
	VALUES ('55','01','Natal');

INSERT INTO airports (code,location_id)
	VALUES ('NAT',1);
	

-- drop database clines;
