#Author: Ravish

  Feature: Contacts Page
  
  @tag1
  Scenario: Verify that an existing contact can be edited and deleted.
  
   Given  I want to Launch the browser for TC03
   And  I want to Login with valid username and password
   When  Navigate to the Contacts module
   Then  Select an existing contact
   And  Select a contact and click Delete
   And  Confirm the deletion
  
  
