Feature:  Create account of FaceBook4

AS a user you need to open facebook home page and do the validations

Scenario: Validate First Name field41
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present

#Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page 
#When User enters user first name And User enters user surname
#Then User checks if user first name is present
#And User checks user surname is present
#But User Mobile field should be blank