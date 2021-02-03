Feature: Checking the functionalities of Approval of Leave requests and Advance requests submitted by the employees

		Scenario: Navigating to the approval screen for leave requests and advance requests
		Given Admin module, Approval module, Approval details page, leave approval tab and advance approval tab
		When Click on Approval details link under Approval module, click on leave approval tab and then click on advance approval tab
		Then System should navigate to the leave apporval screen and advance approval screen on respective clicks
		
		Scenario: Approving the individual leave request submitted by the employees
		Given Admin module, Approval module, Approval details page, leave approval tab, Approve button and close button
		When Click on Approval details link under Approval module, click on Approve button and click on Close button
		Then Leave request should get approved and confirmation message should be displayed
		
		Scenario: Cancelling the individual leave request submitted by the employees
		Given Admin module, Approval module, Approval details page, leave approval tab, Cancel button and close button
		When Click on Approval details link under Approval module, click on Cancel button and click on Close button
		Then Leave request should get cancelled and confirmation message should be displayed
		And After cancellation, cancelled leave count should get added to the respective employee's leave balance
		
		Scenario: Cancelling the leave requests submitted by the employees in bulk 
		Given Admin module, Approval module, Approval details page, leave approval tab, bulk Cancel button and close button
		When Click on Approval details link under Approval module, select the leave requests, click on Bulk Cancel button and click on Close button
		Then All the selected Leave requests should get cancelled and confirmation message should be displayed
		And After bulk cancellation, cancelled leave count should get added to the respective employee's leave balance
		
		Scenario: Check validation for not selecting the Leave request and clicking on bulk Cancel
		Given Admin module, Approval module, Approval details page, Leave approval tab, bulk Cancel button and validation message
		When Click on Approval details link under Approval module, dont select the Leave requests and click on Bulk Cancel button 
		Then System should display the validation message for not selecting the Leave requests and clicking on bulk Cancel button
		
		Scenario: Bulk Approval of the leave requests submitted by the employees
		Given Admin module, Approval module, Approval details page, leave approval tab, bulk Approve button and close button
		When Click on Approval details link under Approval module, select the leave requests, click on Bulk Approve button and click on Close button
		Then All the selected Leave requests should get approved and confirmation message should be displayed
		And After bulk approval, employees leave count should get deducted from their leave balance
		
		Scenario: Check validation for not selecting the Leave request and clicking on bulk approval
		Given Admin module, Approval module, Approval details page, Leave approval tab, bulk Approve button and validation message
		When Click on Approval details link under Approval module, dont select the Leave requests and click on Bulk Approve button 
		Then System should display the validation message for not selecting the Leave requests and clicking on bulk approve button
		
		Scenario: Search the leave approval details by individual employee Id
		Given Admin module, Approval module, Approval details page, leave approval tab, drop down to select employee id
		When Click on Approval details under approval module, select the employee id from the drop down
		Then System should display the selected employee leave details
		
		Scenario: Search the leave approval details by individual employee name
		Given Admin module, Approval module, Approval details page, leave approval tab, search box and search link
		When Click on Approval details under approval module, enter the employee name and click on search link
		Then System should search the leave requests which is submitted by the respective employee and display the results
		
		Scenario: Navigating to different pages in leave request approval page
		Given Admin module, Approval module, Approval details page, leave approval tab, next and prev buttons
		When Click on Approval details under approval module and click on Next & Prev buttons
		Then System should navigate to different leave request approval pages when user clicks on next and prev button
		
		Scenario: Check leave balance of the employee by clicking on History link
		Given Admin module, Approval module, Approval details page, leave approval tab, history link and close button
		When Click on Approval details under approval module, click on history link and click on close button
		Then System should display leave balance of the employee on click of history link
		
		Scenario: Approving the individual Advance requests submitted by the employees
		Given Admin module, Approval module, Approval details page, Advance approval tab, Approve button and close button
		When Click on Approval details link under Approval module, click on Approve button under Advance approval tab and click on Close button
		Then Advance request should get approved and confirmation message should be displayed
		
		Scenario: Cancelling the individual Advance request submitted by the employees
		Given Admin module, Approval module, Approval details page, Advance approval tab, Cancel button and close button
		When Click on Approval details link under Approval module, click on Cancel button under Advance approval tab and click on Close button
		Then Advance request should get cancelled and confirmation message should be displayed
		
		Scenario: Bulk Cancelling the Advance requests submitted by the employees
		Given Admin module, Approval module, Approval details page, Advance approval tab, bulk Cancel button and close button
		When Click on Approval details link under Approval module, select the Advance requests, click on Bulk Cancel button and click on Close button
		Then All the selected Advance requests should get cancelled and confirmation message should be displayed
		
		Scenario: Check validation for not selecting the Advance request and clicking on bulk Cancel
		Given Admin module, Approval module, Approval details page, Advance approval tab, bulk Cancel button and validation message
		When Click on Approval details link under Approval module, dont select the Advance requests and click on Bulk Cancel button 
		Then System should display the validation message for not selecting the advance requests and clicking on bulk Cancel button
			
		Scenario: Bulk Approval of the Advance requests submitted by the employees
		Given Admin module, Approval module, Approval details page, Advance approval tab, bulk Approve button and close button
		When Click on Approval details link under Approval module, select the Advance requests, click on Bulk Approve button and click on Close button
		Then All the selected Advance requests should get approved and confirmation message should be displayed
				
		Scenario: Check validation for not selecting the Advance request and clicking on bulk approval
		Given Admin module, Approval module, Approval details page, Advance approval tab, bulk Approve button and validation message
		When Click on Approval details link under Approval module, dont select the Advance requests and click on Bulk Approve button 
		Then System should display the validation message for not selecting the advance requests and clicking on bulk approve button
		
		Scenario: Search the advance approval details by individual employee Id
		Given Admin module, Approval module, Approval details page, advance approval tab, drop down to select employee id
		When Click on Approval details under approval module, click on Advance approval tab, select the employee id from the drop down
		Then System should display the selected employee advance request details
		
		Scenario: Search the advance approval details by individual employee name
		Given Admin module, Approval module, Approval details page, advance approval tab, search box and search link
		When Click on Approval details under approval module, click on Advance approval tab, enter the employee name and click on search link
		Then System should search the advance requests which is submitted by the respective employee and display the results
		
		Scenario: Navigating to different pages in advance request approval page
		Given Admin module, Approval module, Approval details page, advance approval tab, next and prev buttons
		When Click on Approval details under approval module, click on Advance approval tab and click on Next & Prev buttons
		Then System should navigate to different advance request approval pages when user clicks on next and prev button
		
		Scenario: Check Payback schedule of the advance request submitted by an employee by clicking on View link
		Given Admin module, Approval module, Approval details page, Advance approval tab, View link and close button
		When Click on Approval details under approval module, click on Advance approval tab, click on view link and click on close button
		Then System should display Payback schedule of the advance request submitted by an employee on click of view link
		
		Scenario: Search the leave approval status details by individual employee Id
		Given Admin module, Approval module, Approval status details page, leave approval status tab, drop down to select employee id
		When Click on Approval status details under approval module, select the employee id from the drop down
		Then System should display the selected employee leave request approval status details
		
		Scenario: Search the leave approval status details by individual employee name
		Given Admin module, Approval module, Approval status details page, leave approval status tab, search box and search link
		When Click on Approval status details under approval module, enter the employee name and click on search link
		Then System should search the leave request which is submitted by the respective employee and display the leave approval status details 
		  
		Scenario: Navigating to different pages in leave request approval status page
		Given Admin module, Approval module, Approval status details page, leave approval status tab, next and prev buttons
		When Click on Approval status details under approval module and click on Next & Prev buttons
		Then System should navigate to different leave request approval status pages when user clicks on next and prev button
		
		Scenario: Search the advance approval status details by individual employee Id
		Given Admin module, Approval module, Approval status details page, advance approval status tab, drop down to select employee id
		When Click on Approval status details under approval module, click on Advance approval status tab, select the employee id from the drop down
		Then System should display the selected employee advance request approval status details
		
		Scenario: Search the advance approval status details by individual employee name
		Given Admin module, Approval module, Approval status details page, advance approval status tab, search box and search link
		When Click on Approval status details under approval module, click on Advance approval status tab, enter the employee name and click on search link
		Then System should search the advance request which is submitted by the respective employee and display the advance approval status details 
		  
		Scenario: Navigating to different pages in advance request approval status page
		Given Admin module, Approval module, Approval status details page, advance approval status tab, next and prev buttons
		When Click on Approval status details under approval module, click on advance approval status tab and click on Next & Prev buttons
		Then System should navigate to different advance request approval status pages when user clicks on next and prev button