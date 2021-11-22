Feature: Application progess link
Scenario Outline: checking progress link
Given Initialize the browser with chrome
Given Navigate to "http://elearningm1.upskills.in/" Site
Given Click on Login link in home page to land on Secure sign in Page
Then User enters <username> and <password> and logs in
When Verify that user is succesfully logged in to the site
And go to the progress
Given click progress link
And check the data
Examples:
|username|password|
|Apoorva_M|Apoorvar@225|