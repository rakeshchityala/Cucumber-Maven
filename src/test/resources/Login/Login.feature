Feature: Login feature
This feature includes scenario that would validate the following logins
1. Admin Login
2. Linda.Anderson
3. Negative Login

Background:
Given I'm able to navigate on to login page	


#Scenario: Admin Login
#Given I'm able to navigate on to login page
#When I update the user name as "Admin"
#And I update the password as "admin123"
#And I click on login button
#Then i should see the username as "Welcome Linda"

#Scenario: Linda.Anderason Login
#Given I'm able to navigate on to login page
#When I update the user name as "linda.anderson"
#And I update the password as "linda.anderson"	
#And I click on login button
#Then i should see the username as "Welcome Linda"

Scenario Outline:	
	When I update the user name as "<user>"
	And I update the password as "<password>"
	And I click on login button
	Then i should see the username as "<name>"
	
Examples:
|user				|password		|name				|
|linda.anderson		|linda.anderson	|Welcome Linda		|
|linda.anderson		|linda.anderson	|Welcome Linda		|


Scenario: Linda.Anderason Login
When I update the user name as "sunil"
And I update the password as "sunil"	
And I click on login button
Then i should see error message as "Invalid credentials"