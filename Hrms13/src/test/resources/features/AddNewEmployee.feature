Feature: Add new Employee

  Background: 
    Given User is logged with valid admin credentials
    And User navigate to Add Employee

  Scenario: Add Employee
    #Given User is logged with valid admin credentials
    #And User navigate to Add Employee
    When user enter employee firstName, lastName
    And user click save button
    Then employee is added successfully

  Scenario: Add Employee without Id
    #Given User is logged with valid admin credentials
    #And User navigate to Add Employee
    When user enter employee firstName, lastName
    And User deletes employee id
    And user click save button
    Then employee is added successfully

  Scenario: Add Employee with login credentials
    #Given User is logged with valid admin credentials
    #And User navigate to Add Employee
    When user enter employee firstName, lastName
    And User clicks on create login checkbox
    And User add login credentials
    And user click save button
    Then employee is added successfully

  Scenario Outline: 
    When user enter employee "<FirstName>", "<LastName>"
    And user click save button
    Then "<FirstName>", "<LastName>" is added successfully

    Examples: 
      | FirstName | LastName |
      | Yuri      | Shev     |
      | Oleg      | Boss     |
      | Denis     | Cross    |
      | Vadim     | Bross    |

  Scenario: Adding multiple employees
    When user enters employee detalis and click save
      | FirstName | LastName |
      | Yuri      | Shev     |
      | Oleg      | Boss     |
      | Denis     | Cross    |
      | Vadim     | Bross    |
    #Then employee is added
    
  @excel  
    Scenario: adding employee from excel
    When user add new employee
