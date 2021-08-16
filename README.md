# Automation Framework UI Testing : Selenium-Java-TestNG-BDD

## Table of contents
* [About](#about)
* [Technologies](#technologies)
* [Installation](#installation)
* [Framework Structure](#framework_structure)
* [Usage](#usage)
* [Contributing](#contributing)

## About
This Repository provides the basic testing framework to start the automation testing.

## Technologies
1. Selenium
2. Java
3. log4j2
4. TestNG
5. Maven
6. Page Object Model

## Installation

#### Prerequisite:

1. Java
2. Editor e.g. Eclipse
3. Maven

#### Plugins:

1. TestNG for Eclipse Plugin
2. Maven Integration for Eclipse

All set!!! Just download the Project folder...

## Framework Structure

src/com/nisha

	base --> contains Base class for driver factory
	
	features --> Cucumber feature files
	
	hooks --> Hooks class file
	
	pageObject --> Page object model for each application page which contains object locators and functionality of respective page
	
	resource --> Resources which required for project and framework configurations
	
	runner --> Test runner file (@CucumberOptions parameters)
	
	stepDefinations --> Step Definition files
	
	utility --> Utilities developed in the framework which are easily use in framework
	
	      CommonFunctions --> Methods which easily used for selenium UI operations such as click, enter values and verify
	      
	      ConstantHelper --> Constant values which are used in framework
	      
	      ExcelSheetHelper --> Excelsheet related functions
	      
	      ExceptionHelper --> Custome exception for the framework
	      
	      PropertyHelper --> Represents the read functionality of property file


logs --> Execution logs is generated here by log4j2

target --> HTML report gets generated

	extent report --> inside ExtentReport folder
	
	cucumber report --> inside cucumberReports folder

pom.xml --> Project dependencies and other maven information

testng.xml --> TestNG configuration file

## Usage

1. Download the Project folder

2. Compile

3. Open Command Prompt, navigate to Project folder. Use below Maven command to run test:

	To run:
	
		mvn clean verify

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Contributors

Nisha Vekariya
