Feature: personal detail modify



  Background: 
    Given User is logged with valid admin credentials
    And User navigate to Add Employee
    @right
Scenario: personal detail modify
When User enter "First Name" and "Last Name"
And User click creat personal detail
And User comlet login, password
And User click save button
Then User click on button edit
And User add Driver licens
And User add License Expiry Date
And User add SSN Number
And User add SIN Number
And User add Gender
And User add Marital Status
And User add Nationality
#And User add Date of Birth
And User add Nick Name
And User add Smoker
And User add Military Service
And User click on button save
