Feature:TestMeApp functionality
Scenario:register to testmeapp
Given user must be on sign up page
When user enters username "dipsi"
And user enters firstname "dipsi"
And user enters lastname "d"
And user enters password "abc123"
And user re-enters password "abc123"
And user selects gender as Female
And user enters emailid "dipsi@gmail.com"
And user enters mobilenumber "9987675434"
And user enters DOB "01/04/2018"
And user enters address "Bangalore"
And user selects security question
And user enters the answer "Blue"
And user clicks register
Then user should be on login page

