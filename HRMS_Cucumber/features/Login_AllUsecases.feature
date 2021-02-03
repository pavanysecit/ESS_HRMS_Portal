Feature: Checking the functionalities of the Login module
 
  	Scenario: Check the functionality of login module with valid username and password as admin
    Given Login page, username and password for admin module
    When Enter the login details and click on login button
    Then User should login successfully after entering the valid credentials for admin role
	
		Scenario: Check the functionality of login module with invalid username and invalid password
    Given Login page, invalid username, invalid password and login button
    When Enter the invalid login details and click on login button
    Then User should not be able to login and should get error message for entering invalid login details
	
		Scenario: Check the functionality of login module with empty username and empty password
    Given Login page, empty username and empty password
    When Dont enter the username and password and click on login button
    Then System should display the error message for not entering the username and password
	
		Scenario: Check the mandatory field validaitons in forgot password page
    Given Login page, forgot password link and validation message
    When Click on forgot password link and click on Submit button
    Then System should display the mandatory field validation message for each field in forgot password page
	
		Scenario: Check the validaitons for entering the mobile no which is not registered
    Given Login page, forgot password link and Send OTP link
    When Click on forgot password link and click on Send OTP link
    Then System should display validation message for entering the phone no which is not registered
	
		Scenario: Check the mandatory field validaitons in registration page
    Given Login page, SingUp link, register button and validation messages
    When Click on SingUp link and click on Register button
    Then System should display the mandatory field validation message for each field in registration page
	
		Scenario: Check the validaitons for password and confirm password fields in registration page
    Given Login page, SingUp link, register button and validation messages for password mismatch
    When Click on SingUp link, enter all the mandatory details, enter mismatching password details and click on Register button
    Then System should display validation message if the value in password and confirm password are not same
	
		Scenario: Check the validaitons for employeeId which is not exist in HRM 
    Given Login page, SingUp link, register button and validation messages for employeeid
    When Click on SingUp link, enter all the details with employeeid which is not exists in the HRM and click on register button
    Then System should display validation message if the entered employeeid doesn't exist in the HRM
	
		Scenario: Check the functionality of ClearAll button in registration page
    Given Login page, SingUp link and clearall button
    When Click on SingUp link, enter all the details and click on ClearAll button
    Then All the entered details should get cleared in the registration page
	
		Scenario: Navigate to login page from registration page
    Given Login page, SingUp link and login button
    When Click on SingUp link and click on Login button
    Then System should take user to login page on click of login link