Feature: To tyest newtours website Registration end to end

Scenario: Register to new tours website with valid details
Given I navigate to newtours  Url
Then I verify the Title of newtours Home Page
When I clicked on Register link
Then I verify the title of newtoursregistration Page
And I enter the Contact informatio details

|firstname|ghuy|
|lastname| gyh|
|phone|098|
And I enter mailing information
|Address|6hyu st|
|postcode|bn7 8uy|

And i enter user information
|username|ghytr|
|password|tre765|
|confimpwd|tre764|
When i click on submit button
Then I verify the currewnt url of the page
