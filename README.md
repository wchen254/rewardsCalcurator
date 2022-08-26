Coding task (JAVA)
A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.
A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction
(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).
Given a record of every transaction during a three months period, calculate the reward points earned for each customer per month and total.

###Run this project
$ mvn spring-boot: run

###Application test
1. Open a browser, enter: http://localhost:8080/customers, then you should get all customers` transactions.
2. Open a browser, enter: http://localhost:8080/customers/{id}, then you should get a customer`s transaction history, if customer id don`t exist, "entity not found" will be displayed.
3. Open a browser, enter: http://localhost:8080/customers/rewardP/{id}, then you should get a customer`s total reward points, if customer id don`t exist, "entity not found" will be displayed. 
4. Open a browser, enter: http://localhost:8080/customers/totalP/{id}, then you should get a customer`s total curchase cost, if customer id don`t exist, "entity not found" will be displayed.

###Maven Project, Dependencies
spring-boot 2.1.9, spring-boot-starter-data-jpa, spring-boot-starter-web, spring-boot-devtools, junit-jupiter, h2database, spring-boot-starter-test

###Database Provided
rewardsCalculator\src\main\resources\data.sql