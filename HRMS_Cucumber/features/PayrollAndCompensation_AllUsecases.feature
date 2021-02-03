Feature: Checking the functionalities of Payroll and Compensation modules

	  Scenario: Checking the compensation history of the employee
	  Given Payroll and Compensation module, Compensation page and Compensation history
	  When Click on Compensation history under Payroll and Compensation module
	  Then System should display the compenesation history of the current employee
	  
	  Scenario: Searching the compenesation history details by dates
	  Given Payroll and Compensation module, Compensation history page, date fields and Submit button
	  When Click on Compensation history under Payroll and Compensation module, select the dates and click on Submit button
	  Then System should display the compenesation history details available between the dates selected
	  
	  Scenario: Checking the validation message for No records found
	  Given Payroll and Compensation module, Compensation history page, date fields, Submit button and No records found message
	  When Click on Compensation history link under Payroll and Compensation module, select the dates and click on Submit button
	  Then System should display No Records found message if there is no hostory available between the dates selected
	  
	  Scenario: Search the compensation history with different scenarios
	  Given Payroll and Compensation module, compensation history page, search box and search button
	  When Click on compensation history under Payroll and Compensation module, enter the data in search box and click on search icon
	  Then System should check the entered details with existing compensation history details and display the matching details 
	
	  Scenario: Naviagting to the Payslip page of the current employee
	  Given Payroll and Compensation module and Payslip page 
	  When Click on Payslip link under Payroll and Compensation module
	  Then System should display the Payslip page
	  
	  Scenario: Checking the Salary slip of the current employee
	  Given Payroll and Compensation module, Salary slip page, salary period and submit button
	  When Click on Payslip link under Payroll & Compensation module, select the salary period and click on Submit button
	  Then System should salary slip of the current employee for selected salary period
	 
	  Scenario: Printing the Salary slip generated for the current employee
	  Given Payroll and Compensation module, Salary slip page, salary period, submit and print button
	  When Click on Payslip link under Payroll & Compensation module, select the salary period, click on Submit button and then click on Print button
	  Then System should display the salary slip of the current employee in print format
	  
	  Scenario: Naviagting to the Bank Account Details page
	  Given Payroll and Compensation module and bank account details page
	  When Click on Bank Account Details link under Payroll & Compensation module
	  Then System should navigate to the bank account details page
	  
	  Scenario: Search the bank account details with different scenarios
	  Given Payroll and Compensation module, bank account details page, search box and search button
	  When Click on bank account details under Payroll and Compensation module, enter the data in search box and click on search icon
	  Then System should check the entered details with existing bank account details and display the matching details 
	  
	  Scenario: Naviagting to the View Tax Form page
	  Given Payroll and Compensation module and view tax form page
	  When Click on View Tax Form link under Payroll & Compensation module
	  Then System should navigate to the view tax form page
	  
	  Scenario: Selecting the salary period and checking the tax details on the grid
	  Given Payroll and Compensation module, view tax form page, salary perios and submit button
	  When Click on View Tax Form link under Payroll & Compensation module, select the salary perios and click on submit button
	  Then System should display the tax details in brief on the tax form grid
	  
	  Scenario: Viewing the tax details in detail for the selected salary period and employee
	  Given Payroll and Compensation module, view tax form page, salary period, submit button and view button
	  When Click on View Tax Form link under Payroll & Compensation module, select the salary perios, click on submit button and then click on View link
	  Then System should display the tax details in detailed for the selected salary period for current employee
	  
	  Scenario: Naviagting to the Pension Deductions page
	  Given Payroll and Compensation module and Pension Deductions page
	  When Click on Pension Deductions link under Payroll & Compensation module
	  Then System should navigate to the pension deductions page
	  
	  Scenario: Search the pension deductions with different scenarios
	  Given Payroll and Compensation module, pension deductions page, search box and search button
	  When Click on pension deductions under Payroll and Compensation module, enter the data in search box and click on search icon
	  Then System should check the entered details with existing pension deductions details and display the matching details
	  
	  Scenario: Naviagting to the Staff Advance Request page
	  Given Payroll and Compensation module and Staff Advance Request page
	  When Click on Staff Advance Request link under Payroll & Compensation module
	  Then System should navigate to the staff advance request page
	  
	  Scenario: Requesting for staff advance
	  Given Payroll and Compensation module, Staff Advance Request page, date, amount,currency, paybak count and save button
	  When Click on Staff Advance Request link under Payroll & Compensation module, enter all the details and click on Save button
	  Then Staff Advance request should get submitted for the current employee and request should be pending for approval
	  
	  Scenario: Checking the functionality of Clear button
	  Given Payroll and Compensation module, Staff Advance Request page, date, amount,currency, paybak count and clear button
	  When Click on Staff Advance Request link under Payroll & Compensation module, enter all the details and click on Clear button
	  Then All the entered details should get cleared on click of clear button
	  
	  Scenario: Requesting and Cancelling the staff advance request
	  Given Payroll and Compensation module, Staff Advance Request page, date, amount,currency, paybak count, save button and cancel link
	  When Click on Staff Advance Request link under Payroll & Compensation module, enter all the details, click on Save button and click on Cancel link
	  Then System should ask for confirmation before cancelling and clicking on confirm, Request for staff advance should get cancelled 
	  
	  Scenario: Checking the validation message for cancelling the advance request for which already salary generated
	  Given Payroll and Compensation module, Staff Advance Request page, existing advance request for which salary generated already
	  And Cancel link on the request and confirm button
	  When Click on Staff Advance Request link under Payroll & Compensation module, Click on Cancel link and click confirm button
	  Then Advance request should not get deleted if the salary is already generated for that month 
	  And System should display validation message 
	  
	  Scenario: Checking the functionality of Apply Payback feature in Advance staff request page
	  Given Payroll and Compensation module, Staff Advance Request page, date, currency and Apply payback button
	  When Click on Staff Advance Request link under Payroll & Compensation module, Enter the date, currenct, amount and click on Apply Payback button
	  Then System should divide the amount into the value entered in the payback count field 
	  And Divided amount as amount needs to be paid per month should be displayed in the Payback Schedule table
	  
	  Scenario: Check the mandatory field validaitons in Staff Advance Request page
	  Given Payroll and Compensation module, Staff Advance Request page, mandatory fields and validation message
      When Click on Staff Advance Request link under Payroll & Compensation module and click on Save button
      Then System should display the mandatory field validation message for each field in Advance staff request page
	  
	  Scenario: Search the staff advance requests with different scenarios
	  Given Payroll and Compensation module, staff advance requests page, search box and search button
	  When Click on staff advance requests under Payroll and Compensation module, enter the data in search box and click on search icon
	  Then System should check the entered details with existing staff advance requests details and display the matching details
	  
	  Scenario: Navigating to different pages in staff advance requests page
	  Given Payroll and Compensation module, staff advance requests page, next and prev buttons
	  When Click on staff advance requests under Payroll and Compensation module and click on Next & Prev buttons
	  Then System should navigate to different staff advance request pages when user click on next and prev button
	  
	  Scenario: Requesting the advance amount after 20th date and checking the validation message for the same
	  Given Payroll and Compensation module, Staff Advance Request page, select date as before 20th, enter other details and click on apply payback button
      When Click on Staff Advance Request link under Payroll & Compensation module, enter the details and click on Apply Payback button
      Then System should display the validation message for requesting the advance amount after the 20th date
	  
	  Scenario: Viewing the payback schedule details for the requests which are already submitted
	  Given Payroll and Compensation module, Staff Advance Request page, existing advance requests and view link
      When Click on Staff Advance Request link under Payroll & Compensation module and click on View link available on the advance requests
      Then System should display the payback schedule details for existing requests in a popup
	  
	  Scenario: Naviagting to the Staff Advance Balance page
	  Given Payroll and Compensation module and Staff Advance Balance page
	  When Click on Staff Advance Balance link under Payroll & Compensation module
	  Then System should navigate to the staff advance balance page
	  
	  Scenario: Search the staff advance balance with different scenarios
	  Given Payroll and Compensation module, staff advance balance page, search box and search button
	  When Click on staff advance balance under Payroll and Compensation module, enter the data in search box and click on search icon
	  Then System should check the entered details with existing staff advance balance details and display the matching details
	  
	  Scenario: Viewing the payback schedule details for closed advance request
	  Given Payroll and Compensation module, staff advance balance page, view link and payback schedule details
	  When Click on staff advance balance under Payroll and Compensation module and click on View link 
	  Then System should display the payback schedule details for the closed advance requests
	  
	  Scenario: Sending a request to the admin
	  Given Payroll and Compensation module and Generate Request page
	  When Click on Generate Request link under Payroll & Compensation module, enter the message and click on Submit button
	  Then System should send a request message to the admin
	  
	  Scenario: Check the mandatory field validaitons in Generate Request page
	  Given Payroll and Compensation module, Generate Request page, mandatory fields and validation message
      When Click on Generate Request link under Payroll & Compensation module and click on Submit button
      Then System should display the mandatory field validation message for each field in Generate Request page
	  
	  Scenario: Search the generated requests with different scenarios
	  Given Payroll and Compensation module, generate requests page, search box and search button
	  When Click on generate request under Payroll and Compensation module, enter the data in search box and click on search icon
	  Then System should check the entered details with existing generated requests details and display the matching details
	  
	  Scenario: Navigating to different pages in Generate Request page
	  Given Payroll and Compensation module, generate requests page, next and prev buttons
	  When Click on generate requests under Payroll and Compensation module and click on Next & Prev buttons
	  Then System should navigate to different generate request pages when user click on next and prev button
	  
	  Scenario: Naviagting to the User Request page
	  Given Admin login, Payroll and Compensation module and User Request page
	  When Click on User Request link under Payroll & Compensation module
	  Then System should navigate to the user request page 
	  
	  Scenario: Reply to the request which are sent by the employee
	  Given Admin login, Payroll and Compensation module, User Request page, edit icon and submit button
	  When Search the request which has status 'Requested'
	  And Click on User Request link under Payroll & Compensation module, click on edit icon, enter the message and click on Submit button
	  Then Reply message should get submitted by the admin
	  And Replied message should be visible in requested employee's generate request page
	  
	  Scenario: Search the User requests with different scenarios
	  Given Admin login, Payroll and Compensation module, user requests page, search box and search button
	  When Click on user request under Payroll and Compensation module, enter the data in search box and click on search icon
	  Then System should check the entered details with existing user requests details and display the matching details
	  
	  Scenario: Navigating to different pages in User Request page
	  Given Admin login, Payroll and Compensation module, user requests page, next and prev buttons
	  When Click on user requests under Payroll and Compensation module and click on Next & Prev buttons
	  Then System should navigate to different user request pages when user click on next and prev button