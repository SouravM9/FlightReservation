use reservation;

select * from flight;

insert into flight(flight_number, operating_airlines, departure_city, arrival_city, date_of_departure, estimated_departure_time) 
values('AA', 'Air India', 'KOL', 'DEL', str_to_date('06-18-2023', '%m-%d-%Y'), '2023-06-15 05:14:07');

insert into flight(flight_number, operating_airlines, departure_city, arrival_city, date_of_departure, estimated_departure_time) 
values('AA2', 'Air India', 'DEL', 'BLR', str_to_date('06-19-2023', '%m-%d-%Y'), '2023-06-19 15:00:00');

insert into flight(flight_number, operating_airlines, departure_city, arrival_city, date_of_departure, estimated_departure_time) 
values('AA3', 'Air India', 'BLR', 'KOL', str_to_date('06-20-2023', '%m-%d-%Y'), '2023-06-20 06:00:01');

insert into flight(flight_number, operating_airlines, departure_city, arrival_city, date_of_departure, estimated_departure_time) 
values('AA4', 'Air India', 'KOL', 'BLR', str_to_date('06-20-2023', '%m-%d-%Y'), '2023-06-20 05:14:07');

select * from flight
where departure_city='KOL' and
arrival_city='BLR' and
date_of_departure='2023-06-20' 