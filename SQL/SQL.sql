--SQL TEMELLERİ--
--HW 1--
SELECT title, description FROM film;

SELECT * FROM film WHERE length > 60 AND length < 75;

SELECT * FROM film WHERE rental_rate > 0.99 AND (replacement_cost < 12.99 OR replacement_cost > 28.99);
SELECT * FROM film WHERE rental_rate > 0.99 AND replacement_cost < 12.99 OR replacement_cost > 28.99;

SELECT last_name FROM customer WHERE first_name = 'Mary';

SELECT * FROM film WHERE NOT length > 50 AND NOT (rental_rate = 2.99 OR  rental_rate = 4.99);

--HW 2--
--1
SELECT * FROM film where replacement_cost BETWEEN 12.99 AND 16.99;
--2
SELECT first_name || ' ' || last_name FROM actor WHERE first_name IN ('Penelope', 'Nick', 'Ed');
--3
SELECT * FROM film WHERE rental_rate IN (0.99,2.99,4.99) AND replacement_cost IN (12.99, 15.99, 28.99);

--HW 3--
--1
SELECT * FROM country WHERE country LIKE 'A%a';
--2
SELECT * FROM country WHERE country LIKE '_____n';
--3
SELECT * FROM film WHERE title ILIKE '%t%t%t%t%';
--4
SELECT * FROM film WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;

--HW4
--1
SELECT DISTINCT replacement_cost FROM film;
--2
SELECT COUNT(DISTINCT replacement_cost) FROM film;
--3
SELECT COUNT(*) FROM film WHERE rating = 'G' AND title  LIKE 'T%';
--4
SELECT COUNT(*) FROM country WHERE country LIKE '_____';
--5
SELECT COUNT(*) FROM city WHERE city ILIKE '%r';

--HW5
--1
SELECT * FROM film WHERE title LIKE '%n' ORDER BY length DESC LIMIT 5;
--2
SELECT * FROM film WHERE title LIKE '%n' ORDER BY length ASC OFFSET 5 LIMIT 5;
--3
SELECT * FROM customer WHERE store_id = 1 ORDER BY last_name DESC LIMIT 4;

--HW6
--1
SELECT AVG(rental_rate) FROM film;
--2
SELECT COUNT(*) FROM film WHERE title LIKE 'C%';
--3
SELECT MAX(length) FROM film WHERE rental_rate = 0.99;
--4
SELECT COUNT(DISTINCT replacement_cost) FROM film WHERE length > 150;

--HW 7 
--1
SELECT rating, COUNT(*) FROM film GROUP BY rating;
--2
SELECT replacement_cost, COUNT(*) FROM film GROUP BY replacement_cost HAVING COUNT(*) > 50;
--3
SELECT store_id,COUNT(*) FROM customer GROUP BY store_id;
--4
SELECT country_id, COUNT(city) FROM city GROUP BY country_id ORDER BY COUNT(city) DESC LIMIT 1;

-----------------------------------------TABLE--------------------------------------------------------------------
--HW8
CREATE TABLE employee(
	id SERIAL PRIMARY KEY,
	name varchar(50),
	birthday DATE,
	email varchar(100)
);


insert into employee (name, birthday, email) values ('Cinderella', '2001-10-07', 'cromeo0@w3.org');
insert into employee (name, birthday, email) values ('Austina', '1999-04-12', 'asilvers1@cbslocal.com');
insert into employee (name, birthday, email) values ('Dwain', '2008-03-30', 'dsuddards2@mozilla.com');
insert into employee (name, birthday, email) values ('Solomon', '1995-12-28', 'sdightham3@myspace.com');
insert into employee (name, birthday, email) values ('Lonnard', '2001-11-30', 'lmcwhin4@nps.gov');
insert into employee (name, birthday, email) values ('Allistir', '2005-12-25', 'adillimore5@theguardian.com');
insert into employee (name, birthday, email) values ('Linzy', '1998-07-02', 'lcampaigne6@ft.com');
insert into employee (name, birthday, email) values ('Shir', '2019-04-27', 'skenwyn7@narod.ru');
insert into employee (name, birthday, email) values ('Ted', '2013-05-25', 'talner8@mozilla.org');
insert into employee (name, birthday, email) values ('Fae', '1997-03-09', 'fperrin9@goo.gl');
insert into employee (name, birthday, email) values ('Brandtr', '2011-03-12', 'bkrauzea@tamu.edu');
insert into employee (name, birthday, email) values ('Linn', '2002-07-22', 'lkarlolczakb@slashdot.org');
insert into employee (name, birthday, email) values ('Wadsworth', '2000-03-16', 'wmcguiganc@delicious.com');
insert into employee (name, birthday, email) values ('Paten', '2007-03-22', 'plissemored@mail.ru');
insert into employee (name, birthday, email) values ('Ferne', '2005-03-05', 'fwoodfine@mozilla.com');
insert into employee (name, birthday, email) values ('Dore', '2018-02-06', 'dskeelsf@miibeian.gov.cn');
insert into employee (name, birthday, email) values ('Orlan', '1997-09-02', 'omaccraeg@icq.com');
insert into employee (name, birthday, email) values ('Godwin', '1999-11-26', 'gwombwellh@msu.edu');
insert into employee (name, birthday, email) values ('Shayna', '2000-12-02', 'shemerijki@blogger.com');
insert into employee (name, birthday, email) values ('Dita', '2002-03-28', 'dcartmailj@typepad.com');
insert into employee (name, birthday, email) values ('Maisie', '2016-08-29', 'mfilinkovk@japanpost.jp');
insert into employee (name, birthday, email) values ('Ernest', '1996-02-19', 'enewrickl@un.org');
insert into employee (name, birthday, email) values ('Donnie', '2017-01-26', 'dveazeym@exblog.jp');
insert into employee (name, birthday, email) values ('Paddy', '1999-08-10', 'pdanshinn@networkadvertising.org');
insert into employee (name, birthday, email) values ('Gunar', '2017-06-29', 'gandrionio@meetup.com');
insert into employee (name, birthday, email) values ('Malorie', '2013-08-17', 'mscoffhamp@plala.or.jp');
insert into employee (name, birthday, email) values ('Becki', '2010-07-10', 'bdoxseyq@51.la');
insert into employee (name, birthday, email) values ('Julina', '2009-06-18', 'jheinschker@unesco.org');
insert into employee (name, birthday, email) values ('Jany', '2005-03-12', 'jjuzeks@youtu.be');
insert into employee (name, birthday, email) values ('Sibylle', '2011-07-21', 'ssheptont@github.io');
insert into employee (name, birthday, email) values ('Poppy', '2001-05-11', 'purlinu@ed.gov');
insert into employee (name, birthday, email) values ('Shanie', '2001-11-04', 'spluckv@seattletimes.com');
insert into employee (name, birthday, email) values ('Idette', '1998-03-11', 'iknevetw@parallels.com');
insert into employee (name, birthday, email) values ('Guendolen', '2019-06-06', 'gchapleox@naver.com');
insert into employee (name, birthday, email) values ('Jillie', '2004-03-28', 'jczyzy@google.com');
insert into employee (name, birthday, email) values ('Ashil', '2018-11-23', 'afairbridgez@imgur.com');
insert into employee (name, birthday, email) values ('Mellie', '2004-05-28', 'mshilstone10@yellowbook.com');
insert into employee (name, birthday, email) values ('Elysha', '1996-09-23', 'ejasiak11@china.com.cn');
insert into employee (name, birthday, email) values ('Ilse', '2018-12-24', 'iolivari12@pcworld.com');
insert into employee (name, birthday, email) values ('Gayelord', '2012-10-03', 'gpipworth13@unc.edu');
insert into employee (name, birthday, email) values ('Abelard', '2012-08-03', 'agapp14@chronoengine.com');
insert into employee (name, birthday, email) values ('Marylou', '2013-02-23', 'mshimwall15@phpbb.com');
insert into employee (name, birthday, email) values ('Woodie', '2018-12-14', 'wplumridege16@ft.com');
insert into employee (name, birthday, email) values ('Karel', '1999-11-01', 'kallard17@bing.com');
insert into employee (name, birthday, email) values ('Von', '2016-04-08', 'vquenby18@ucla.edu');
insert into employee (name, birthday, email) values ('Galven', '2006-06-30', 'glydiate19@chronoengine.com');
insert into employee (name, birthday, email) values ('Itch', '2018-05-26', 'inestle1a@pbs.org');
insert into employee (name, birthday, email) values ('Prent', '2017-11-08', 'pmedgewick1b@com.com');
insert into employee (name, birthday, email) values ('Orelle', '2005-07-10', 'oglaisner1c@sourceforge.net');
insert into employee (name, birthday, email) values ('Tallulah', '2019-06-09', 'tsidebottom1d@msn.com');

UPDATE employee SET name = 'abc', email = 'a@b.c' WHERE id = 5;
UPDATE employee SET name = 'vsx', email = 'v@s.x' WHERE id = 15;
UPDATE employee SET name = 'hfs', email = 'h@f.s' WHERE id = 25;
UPDATE employee SET name = 'bvc', email = 'b@v.c' WHERE id = 21;
UPDATE employee SET name = 'nnn', email = 'n@n.n' WHERE id = 1;

DELETE FROM employee WHERE id = 5;
DELETE FROM employee WHERE id = 15; 
DELETE FROM employee WHERE id = 25; 
DELETE FROM employee WHERE id = 21; 
DELETE FROM employee WHERE id = 1; 

-----------------------------------------JOIN----------------------------------------------

--HW9
--1--
SELECT city,country FROM city 
JOIN country ON city.country_id = country.country_id;
--2--
SELECT p.payment_id, c.first_name, c.last_name FROM customer c 
JOIN payment p ON c.customer_id = p.customer_id; 
--3--
SELECT r.rental_id, c.first_name, c.last_name FROM customer c 
JOIN rental r ON c.customer_id = r.customer_id;

--HW10
--1--
SELECT ct.city, co.country FROM city ct 
LEFT JOIN country co ON co.country_id = ct.country_id;
--2--
SELECT p.payment_id, c.first_name, c.last_name FROM customer c 
RIGHT JOIN payment p ON c.customer_id = p.customer_id;
--3--
SELECT r.rental_id, c.first_name, c.last_name FROM customer c 
FULL JOIN rental r ON c.customer_id = r.customer_id;

--HW11
--1--
(SELECT first_name FROM actor) UNION (SELECT first_name FROM customer);
--2--
(SELECT first_name FROM actor) INTERSECT (SELECT first_name FROM customer);
--3--
(SELECT first_name FROM actor) EXCEPT (SELECT first_name FROM customer);
--4--
(SELECT first_name FROM actor) UNION ALL (SELECT first_name FROM customer);
--5-- INTERSECT (ALL NOT USEFUL)
(SELECT first_name FROM actor) INTERSECT ALL (SELECT first_name FROM customer);
--6--
(SELECT first_name FROM actor) EXCEPT ALL (SELECT first_name FROM customer);

--HW12
--1--
SELECT  COUNT(*) FROM film WHERE length > (SELECT AVG(length) FROM film);
--2--
SELECT COUNT(rental_rate) FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);
--3--
SELECT title FROM film WHERE film_id = ANY (SELECT film_id FROM film ORDER BY rental_rate ASC, replacement_cost  ASC LIMIT 10);
--4--
	--not ordered with payment,  max 10 customer
SELECT first_name || ' ' || last_name  AS Name ,customer_id FROM customer 
WHERE customer_id = ANY
(SELECT customer_id FROM payment GROUP BY customer_id ORDER BY Count(customer_id) DESC LIMIT 10);
	-- ordered with payment, max 10 customer
SELECT Count(payment.customer_id),customer.customer_id FROM customer 
JOIN payment ON customer.customer_id = payment.customer_id
GROUP BY payment.customer_id,customer.customer_id
ORDER BY Count(payment.customer_id) DESC LIMIT 10;

--GENEL TEKRAR
--film tablosundan 'K' karakteri ile başlayan en uzun ve replacenet_cost u en düşük 4 filmi sıralayınız.
SELECT Count(*) FROM film WHERE title ILIKE '%e%e%e%e%';

--film tablosunda içerisinden en fazla sayıda film bulunduran rating kategorisi hangisidir?
SELECT category.name,Count(*) FROM category JOIN film_category ON film_category.category_id = category.category_id
JOIN film ON film.film_id = film_category.film_id
GROUP BY category.name ORDER BY category.name;

--cutomer tablosunda en çok alışveriş yapan müşterinin adı nedir?
SELECT rating FROM film
GROUP BY rating ORDER BY COUNT(*) DESC LIMIT 1;

--category tablosundan kategori isimlerini ve kategori başına düşen film sayılarını sıralayınız.
SELECT title, replacement_cost, length FROM film WHERE title LIKE 'K%' 
ORDER BY length DESC, replacement_cost ASC LIMIT 3;

--film tablosunda isminde en az 4 adet 'e' veya 'E' karakteri bulunan kç tane film vardır?
SELECT c.first_name, c.last_name, SUM(payment.amount)  FROM customer c JOIN payment ON payment.customer_id = c.customer_id
GROUP BY c.customer_id ORDER BY SUM(payment.amount) DESC LIMIT 1;