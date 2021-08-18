Feature: Quick Navigation

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
	#
	#*Environment:* 
	#
	#[https://qa.openlycrm.com|https://qa.openlycrm.com/]
	@OP-413 @OP-422
	Scenario: US OP-398 TC_001 QUICK NAVIGATION High Priority check box
		Given the user is logged in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the High Priority check box
		Then the High Priority check box should be selected	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Scenario:* 
	#
	#*Acceptance Criteria:*
	#User should be able to click on Visual Editor and see that the editor text bar displays on top of the message box.
	@OP-415 @OP-422
	Scenario: US OP-398 TC_002 QUICK NAVIGATION Editor Text Box
		Given the user is logged in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the Visual Editor icon
		Then the editor text box should be displayed	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#User can add a checklist item by clicking on the add button
	#
	#*Environment:* 
	#
	#[https://qa.openlycrm.com|https://qa.openlycrm.com/]
	@OP-416 @OP-422
	Scenario: US OP-398 TC_003 QUICK NAVIGATION Adding Checklist Item Using The Button
		Given the user is logged in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the "Checklist" link in Task
		And the user enters "This is the first checklist item" as description
		And the user clicks on the add button
		Then the "This is the first checklist item" check list item should be added to the list	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#User can add a checklist item by clicking on the checkmark
	#
	#*Environment:* 
	#
	#[https://qa.openlycrm.com|https://qa.openlycrm.com/]
	@OP-417 @OP-422
	Scenario: US OP-398 TC_004 QUICK NAVIGATION Adding Checklist Item Using The Checkmark
		Given the user is logged in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the "Checklist" link in Task
		And the user enters "This is the first checklist item" as description
		And the user clicks on the checkmark
		Then the "This is the first checklist item" check list item should be added to the list	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#User can add separator lines between checklist items.
	#
	#*Environment:* 
	#
	#[https://qa.openlycrm.com|https://qa.openlycrm.com/]
	@OP-418 @OP-422
	Scenario: US OP-398 TC_005 QUICK NAVIGATION Adding Separator Lines
		Given the user is logged in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the "Checklist" link in Task
		And the user enters "This is the first checklist item" as description
		And the user clicks on the add button
		And the user adds separator by clicking on separator link
		Then the separator line should appear after the last checklist item	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#User can delete a checklist item 
	#
	#*Environment:* 
	#
	#[https://qa.openlycrm.com|https://qa.openlycrm.com/]
	@OP-419 @OP-422
	Scenario: US OP-398 TC_006 QUICK NAVIGATION Deleting The Checklist Item
		Given the user is logged in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the "Checklist" link in Task
		And the user enters "This is the first checklist item" as description
		And the user clicks on the add button
		And the user enters "This is the second checklist item" as description
		And the user clicks on the add button
		And the user hovers over the following checklist item and clicks on the delete icon
			| This is the first checklist item |
		Then the "This is the first checklist item" checklist item should disappear	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#User can add Deadline, Time Planning by using date pickers.
	#
	#*Environment:* 
	#
	#[https://qa.openlycrm.com|https://qa.openlycrm.com/]
	@OP-420 @OP-422
	Scenario: US OP-398 TC_007 QUICK NAVIGATION Adding Deadline Using Date Picker
		Given the user is logged in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the clicks on the Deadline date box
		And the user selects date "09/15/2021 12:30:00 pm" by using the date picker
		Then the date "09/15/2021 12:30:00 pm" should appear on the date box	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#User can add Deadline, Time Planning by using date pickers.
	#
	#*Environment:* 
	#
	#[https://qa.openlycrm.com|https://qa.openlycrm.com/]
	@OP-421 @OP-422
	Scenario: US OP-398 TC_008 QUICK NAVIGATION Adding Starting Date by Using Date Picker
		Given the user is logged in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on Time Planning link
		And the user clicks on Start Task on date box
		And the user selects date "08/24/2021 09:00:00 am" by using the date picker
		Then the date "08/24/2021 09:00:00 am" should appear on the start task on date box	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#User can add Deadline, Time Planning by using date pickers.
	#
	#*Environment:* 
	#
	#[https://qa.openlycrm.com|https://qa.openlycrm.com/]
	@OP-454 @OP-422
	Scenario: US OP-398 TC_009 QUICK NAVIGATION Adding Finishing Date by Using Date Picker
		Given the user is logged in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on Time Planning link
		And the user clicks on Finish date box
		And the user selects date "09/13/2021 07:00:00 pm" by using the date picker
		Then the date "09/13/2021 07:00:00 pm" should appear on the Finish date box