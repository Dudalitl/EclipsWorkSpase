Feature: Add new Employee

Background:
Given User is logged with valid admin credentials
And User navigate to Add Employee

Scenario: Add Employee
#Given User is logged with valid admin credentials
#And User navigate to Add Employee
When User complet Full Name
And Click save button
Then employee is added successfully

Scenario: Add Employee without Id
#Given User is logged with valid admin credentials
#And User navigate to Add Employee
When User complet Full Name
And User deletes employee id 
And Click save button
Then employee is added successfully

Scenario: Add Employee with login credentials
#Given User is logged with valid admin credentials
#And User navigate to Add Employee
When User complet Full Name
And User clicks on create login checkbox
And User add login credentials
And Click save button
Then employee is added successfully

