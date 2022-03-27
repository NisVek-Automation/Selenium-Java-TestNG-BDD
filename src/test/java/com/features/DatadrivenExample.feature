Feature: Login Functionality
	This feature will test a LogIn functionality

@SignIn-DataDriven
Scenario Outline: Verify the Login functionality for the different users
	Given application url for login
    When user enters "<username>" and "<password>" 
    Then submit the login form, Home page should be opened
Examples:
    | username                | password |
    | standard_user           | secret_sauce |
    | problem_user            | secret_sauce |
    | performance_glitch_user | secret_sauce |
    | locked_out_user         | secret_sauce |