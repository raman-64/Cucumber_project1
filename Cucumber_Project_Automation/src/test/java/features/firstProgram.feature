
Feature: Application Login
 

Scenario: Admin Page default Login

Given User is on Netbanking landing page
When User login into application with "admin" and password "1234"
Then Home Page is displayed
And Cards are displayed


#Reusable


Scenario Outline:
Given User is on Netbanking landing page
When User login into application with "<Username>" and password "<Password>"
Then Home Page is displayed
And Cards are displayed


Examples:
	| Username | Password  |
	| 4.35534    | pw1       |
	| user2    |  pw2      |
	|  user3   |  pw3      |   
  