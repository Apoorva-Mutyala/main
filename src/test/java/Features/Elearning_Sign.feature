Feature: Application signup

@Signup
Scenario Outline: Positive test validating signup
Given Initialize the browser with chrome
Given Navigate to "http://elearningm1.upskills.in/" Site
Given Click on signup button
When user registered by using <firstname> <lastname> <email> <username> <pass> <confirmpass> <phone> <code> <Skype> <linkedin profile url>
And print user registers successfully

Examples:
|firstname|lastname |email                       |username |pass        |confirmpass |phone     |code    |Skype|linkedin profile url|
|Apoorva|    Mutyala|apoorvamutyala955@gmail.com |Apoorva_M|Apoorvar@225|Apoorvar@225|7032691116|selenium|Skype|ApoorvaMutyala|


@Signin
Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
Given Navigate to "http://elearningm1.upskills.in/" Site
Given Click on Login link in home page to land on Secure sign in Page
Then User enters <username> and <password> and logs in
When Verify that user is succesfully logged in 
And print success
Examples:
|username|password|
|Apoorva_M|Apoorvar@225|
|user     |pass|


@Dropdown
Scenario: Language selected from the dropdown box
Given Initialize the browser with chrome
Given Navigate to "http://elearningm1.upskills.in/" Site
Then Click on language you preferred
Then print language is selected


@Lostmypassword
Scenario Outline: Lost my password link
Given Initialize the browser with chrome
Given Navigate to "http://elearningm1.upskills.in/" Site
Then Click on I my lost password link and give <mail>
Then the link had send to the user
Examples:
|mail|
|apoorvamutyala955@gmail.com|


@PopularCourses
Scenario: links opened according to the user requirement
Given Initialize the browser with chrome
Given Navigate to "http://elearningm1.upskills.in/" Site
Then check the links
And close the browser




