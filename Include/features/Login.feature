Feature: Login Feature
Scenario Outline: Test Login with Valid Credentials

Given User navigates to Login Page
When Enters <UserName> And <Password>
And Click On Login Button
Then He should be directed to HomePage

Examples:
		|	UserName	|	Password	|
		| demouser	| testingisfun99	|
		| fav_user	|	testingisfun99	|
		|	existing_orders_user	|	testingisfun99	|
		|	locked_user	|	testingisfun99	|	