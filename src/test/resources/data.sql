insert into customer(id, name) values (1, 'Tom');
insert into customer(id, name) values (2, 'Bob');
insert into customer(id, name) values (3, 'Jene');

insert into my_transaction(id, description, total, save_date, customer_id) values (1, 'Purchase 1', 100, '2022-07-17 10:20:10', 1);
insert into my_transaction(id, description, total, save_date, customer_id) values (2, 'Purchase 2', 50, '2022-08-01 10:20:10', 1);
insert into my_transaction(id, description, total, save_date, customer_id) values (3, 'Purchase 3', 110, '2022-08-5 10:20:10', 1);
insert into my_transaction(id, description, total, save_date, customer_id) values (4, 'Purchase 10', 150.33, '2022-07-07 10:20:10', 1);
insert into my_transaction(id, description, total, save_date, customer_id) values (5, 'Purchase 20', 65.75, '2022-08-01 10:20:10', 2);
insert into my_transaction(id, description, total, save_date, customer_id) values (6, 'Purchase 30', 210.50, '2022-08-03 10:20:10', 2);
insert into my_transaction(id, description, total, save_date, customer_id) values (7, 'Purchase 40', 42.80, '2022-08-18 17:10:10', 2);
insert into my_transaction(id, description, total, save_date, customer_id) values (10, 'Purchase 100', 25.60, '2022-08-01 12:20:10', 3);
insert into my_transaction(id, description, total, save_date, customer_id) values (11, 'Purchase 200', 80.50, '2022-08-05 15:00:10', 3);
insert into my_transaction(id, description, total, save_date, customer_id) values (12, 'Purchase 300', 116.14, '2022-08-10 11:30:10', 3);
insert into my_transaction(id, description, total, save_date, customer_id) values (20, 'Purchase 5', 300, '2022-08-17 10:20:10', 1);