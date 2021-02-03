Feature: Checking the functionalities of Benefits and Learning & Development modules

		Scenario: Navigating to the Benefits Summary page
		Given Benefits module and Benefits Summary page
		When Click on Benifits Summary under Benefits module
		Then System should display the benefits summary page of the current employee
		
		Scenario: Navigating to the Tip Details page
		Given Benefits module and Tip Details page
		When Click on Tip Details under Benefits module
		Then System should display the tip details page of the current employee
		
		Scenario: Get the tip details of the current employee for selected salary period
		Given Benefits module, Tip Details page, salary period drop down and submit button
		When Click on Tip Details under Benefits module, select the salary period from drop down and click on submit button
		Then System should display the tip details of the current employee for selected salary period
		
		Scenario: Navigating to the Training Summary page
		Given Learning & Development module and Training Summary page
		When Click on training summary under Learning & Development module
		Then System should navigate to the training summary page of the current employee
		
		Scenario: Adding training summary details successfully for current employee
		Given Learning & Development module, training summary page, add training summary button, course name, course dates, status and Save button
		When Click on training summary under Learning & Development module, click add training summary button, enter the details and click on Save button
		Then Training summary should get added successfully for current employee and system should display confirmation message
	
		Scenario: Checking the validation for adding the same training details
		Given Learning & Development module, training summary page, add training summary button, existing course name, course dates, status, Save button and validation message
		When Click on training summary under Learning & Development module, click add training summary button, select the same course name & other details and click on Save button
		Then System should display validation message for adding the same training details for same employee and training details should not get saved
	
		Scenario: Checking the validation for date fields while adding training summary 
		Given Learning & Development module, training summary page, add training summary button, course name, course dates, status, Save button and validation message
		When Click on training summary under Learning & Development module, click add training summary button, select the start date greater than end date & enter other details and click on Save button
		Then System should display validation message for selecting course start date greater than end date and training details should not get saved
	
		Scenario: Editing the training details successfully
		Given Learning & Development module, training summary page, edit icon and save button
		When Click on training summary under Learning & Development module, click edit icon, change the training details and click on Save button
		Then Training summary details should get changed successfully and confirmation message should be displayed	
		
		Scenario: Deleting the training details successfully
		Given Learning & Development module, training summary page, delete icon and confirm button
		When Click on training summary under Learning & Development module, click delete icon and click on Confirm button
		Then Training summary details should get deleted successfully and should not be visible in the grid