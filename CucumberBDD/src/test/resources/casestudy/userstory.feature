Feature:example mapping
Scenario: positive search login
Given user should be in login page
When user enters valid credentials And performs login
And clicks the search tab & enters the first four letter of the product
And selects product from drop down
And clicks on find details
Then  user is on add to cart page
When adds the product to cart
Then user should be in Category page
