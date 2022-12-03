-- Auto-generated SQL script #202210121338

INSERT INTO public.aircraft_models (description)
	VALUES ('Carga');

INSERT into public.aircraft_models (description)
	VALUES ('Comericiais');

	
select * from public.aircraft_models am;

INSERT INTO public.aircraft (code,model_id)
	VALUES ('Boeing 737',2);


INSERT INTO public.users ("name",email,"password")
	VALUES ('Luciano Cordeiro','lacs@teste.com','1234567');


INSERT INTO public.users ("name",email,"password")
	VALUES ('Lívian','livian@teste.com','1234567');


INSERT INTO public.users ("name",email,"password")
	VALUES ('Líris','liris@teste.com','1234567');


INSERT INTO public.locations (country,state,city)
	VALUES ('55','01','Natal');

INSERT INTO public.airports (code,location_id)
	VALUES ('NAT',1);
	

--drop database if exists clines ;

--create database clines;

