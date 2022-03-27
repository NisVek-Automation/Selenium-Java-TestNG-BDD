Feature: Data driven demo testing 
This feature will check the dataTable demo of Cucumber

@TableDemo-DataDriven
Scenario: DataTable demo scenario
    Given the test data table for software engineers
    When verify the login values
    | name   | experience |
    | John 	 | 5 |
    | Lisa   | 8 |
    | Nisha  | 12 |
    | Vekariya | 15 |
    Then data received succefully

@ScenarioOutLineDemo-DataDriven
Scenario Outline: Test successful registration of a new user
    Given email address of new user as "<customerEmail>"
    When I enter my personal informations
         | title   | customerFirstName | customerLastName |
         | <title> | <cFname>          | <cLname> |
    And I enter my address informations
         | firstName | lastName | company |
         | <fname> | <lname> | <company> |
    Then successfully submitted the application

     Examples:
        | customerEmail             | title                   | cFname | cLname   | fname | lname    | company |
        | nisha.vekariya@ibm.in.com | Sotware QA              | Nisha  | Vekariya | Nishi | Vekariya | IBM     |
        | nisha.vekariya@cisco.com  | Sotware Automation Engg | John   | Smith    | Thomas  | Mathew   | Cisco   |