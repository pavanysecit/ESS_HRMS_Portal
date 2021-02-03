Feature: Checking all the functionalities of User creation and Roles & Rights modules

		Scenario: Creating new user successfully
		Given Admin module, IT Admin module, New User creation page, location, select role, user id and password
		When Click on New user details link under IT Admin module, enter all the mandatory fields and click on submit button
		Then New user should get created successfully and should able to login to the website post creation
		
		Scenario: Checking the mandatory field validation in user creation page
		Given Admin module, IT Admin module, New User creation page, submit button and mandatory field validation message
		When Click on New user details link under IT Admin module and click on submit button
		Then System should display the mandatory field validation message for not entering the mandatory details in user creation page
		
		Scenario: Checking the functionality of Clear button
		Given Admin module, IT Admin module, New User creation page and Clear button
		When Click on New user details link under IT Admin module, enter the details and click on Clear button
		Then All the entered data in the user creation page should get cleared
		
		Scenario: Editing and updating the existing user details successfully
		Given Admin module, IT Admin module, New User creation page, edit icon and Submit button
		When Click on New User details link under IT Admin module, click on Edit icon, update the details and click on Submit button
		Then User details should get updated successfully with new changes 
		
		Scenario: Search the user details with different scenarios
		Given Admin module, IT Admin module, New User creation page, search box and search button
		When Click on New User details link under IT Admin module, enter the data in search box and click on search icon
		Then System should check the entered details with existing user details and display the matching user details 
		
	 	Scenario: Adding new menu successfully
		Given Admin module, IT Admin module, Roles And Rights page, Add Menu button and Save button
		When Click on Roles and Rights link under IT Admin module, enter the menu title and click on Save button
		Then New Menu should get created successfully and should be visible in the left menu post creation 
		
		Scenario: Checking the mandatory field validation in Add Menu page
		Given Admin module, IT Admin module, Roles & Rights page, Add Menu button, Save button and validation message
		When Click on Roles and Rights link under IT Admin module, Click on add menu button and click on Save button
		Then System should display the mandatory field validation message for not entering the mandatory details in add menu page
		
		Scenario: Check the functionality of search option in Add Menu page
		Given Admin module, IT Admin module, Roles & Rights page, Add Menu button, search box and search link
		When Click on Roles and Rights link under IT Admin module, Click on add menu button, enter the data in search box and click on search link
		Then System should check the entered details with existing menu details and display the matching menu details 
		
		Scenario: Checking the functionality of Clear button
		Given Admin module, IT Admin module, Roles & Rights page, Add Menu button and Clear button
		When Click on Roles and Rights link under IT Admin module, Click on add menu button, enter the menu title and click on Clear button
		Then All the entered data in the add menu page should get cleared
		
		Scenario: Adding new sub menu under a menu successfully
		Given Admin module, IT Admin module, Roles And Rights page, Menu list and Add SubMenu button 
		When Click on Roles and Rights link under IT Admin module, select the menu from the drop down and click on Add SubMenu button
		Then New SubMenu should get created under selected parent menu successfully and should be visible under the parent menu
		
		Scenario: Marking the SubMenu as Inactive
		Given Admin module, IT Admin module, Roles And Rights page, edit icon, IsActive checkbox and Add SubMenu button
		When Click on Roles and Rights link under IT Admin module, click on edit link on submenu, disbale IsActive checkbox and click on Add SubMenu button
		Then SubMenu should get Inactive and should not be visible under menu control in the left panel
		
		Scenario: Adding new role successfully
		Given Admin module, IT Admin module, Roles And Rights module, Add Role button and Save button
		When Click on Roles and Rights link under IT Admin module, Click on Add Role button, enter the role name and click on Save button
		Then New Role should get created and should be visible in the role drop down list post creation
		
		Scenario: Check the functionality of search option in Add Role page
		Given Admin module, IT Admin module, Roles & Rights page, Add Role button, search box and search link
		When Click on Roles and Rights link under IT Admin module, Click on add role button, enter the data in search box and click on search link
		Then System should check the entered details with existing role details and display the matching role details 
		
		Scenario: Checking the mandatory field validation in Add Role page
		Given Admin module, IT Admin module, Roles & Rights page, Add Role button, Save button and validation message
		When Click on Roles and Rights link under IT Admin module, Click on add role button and click on Save button
		Then System should display the mandatory field validation message for not entering the mandatory details in add Role page
		
		Scenario: Giving menu access to the selected role 
		Given Admin module, IT Admin module, Roles & Rights page, Role drop down, readable & writable check box and submit button
		When Click on Roles and Rights link under IT Admin module, select the role from drop down, enable readable & writable checkboxs and click on Submit button
		Then Selected role should get access to the selected menu controls
	
		Scenario: Checking the mandatory field validation for Select Role field
		Given Admin module, IT Admin module, Roles & Rights page, Submit button and validation message
		When Click on Roles and Rights link under IT Admin module, Click on Submit button wihtout select role
		Then System should display the mandatory field validation message for not selecting the role and clicking on submit button