Feature: Testing login page
						Logo displayed
						Login with wrong password
						Login without pasword
						LOgin with corect username and password

@smok
Scenario: Logo displayed
    When User check logo is display
    
    
@smok  
Scenario: Login with wrong password
    When User put user name
    And User put wrong password
    And User click button login
    Then User see error message

@smoke
Scenario: Login without password
		When User put user name
		And User click button login
		Then User see error message

@smoke	
Scenario: Login with corect username and password

		When User put user name
		And User put valid password
		And User click button login
		Then User see welcom message


