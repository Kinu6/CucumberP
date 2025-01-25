#Author: Ravish Kumar Keshari
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Verify that a new lead can be created successfully.

Feature: Verify that a new lead can be created successfully.

  @tag1
  Scenario: New Lead Creation
  
     Given  I want to launch the browser for TC02
     And  Log in to vTiger CRM.
     When  Navigate to the Leads module.
     And  Click on Add New Lead
     Then  Fill in the required fields Last Name
     And  Click Save
     And  Validate for Lead is created 
  