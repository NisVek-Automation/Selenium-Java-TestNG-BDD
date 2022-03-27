# UI/Web Application Testing - Selenium BDD Framework
![Selenium BDD Framework](https://github.com/NisVek-Automation/NisVek-Automation/blob/main/readmeResources/SeleniumBDD.gif)

Don't forget to give this project a ⭐
<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

## 📝 Table of Contents

- [About](#about)
- [Technologies](#technologies)
- [Installation](#installation)
- [Dependencies](#dependencies)
- [Getting Started](#getting_started)
- [Framework Structure](#framework-structure)
- [Logs and Reporting](#logs-reporting)
- [Contributing](#contributing)
- [Authors](#author)

## 🕹 About <a name = "about"></a>
This is an UI/Web Application test Automation framework to start the BDD style automation testing using open source tools.

---

## ✨ Features <a name = "features"></a>

Features Supported by Framework :
- Capable for BDD style UI testing.
- Separate log file for investigation of issue.
- Extent reporting with detail error and screenshots attached.
- Supports cross browsers Testing.
- Custom configuration for framework.
---

### 🎯 Framework principle :

- <b>Self-explanatory code</b> with near to zero comments.
- <b>Single responsibility</b> functions principle.
- Highly readable and maintainable code.
- Test Cases, Test data, config, framework entities, everything is well separated and results in <b>zero duplication</b> anywhere.
- <b>Page object model design pattern</b> to handle the page objects and related functionality.
- <b>Builder design pattern</b> used for some pages for readable code.
- Each file is provided with <b>documentation</b>, can easily generate the document for this framework.
- Easily enhanced and expand the framework with minimal update, if anything changed in applications.

---

## 🖥️ Technologies <a name = "technologies"></a>

- [Selenium](https://www.selenium.dev/) - Automation tool
- [Java](https://www.java.com/en/) - Programming language
- [TestNG](https://testng.org/doc/) - Test Management library
- [Cucumber](https://cucumber.io/) - BDD style tool
- [Maven](https://maven.apache.org/) - Build automation tool
- [log4j](https://logging.apache.org/log4j/2.x/) - Logging framework
- [Eclipse](https://www.eclipse.org) - IDE
- [Extent Reports](https://www.extentreports.com/) - Reporting framework
- [GitHub](https://github.com/) - Version control
- [Jenkins](https://www.jenkins.io/) - CI tool
- Page Object Model

---

## ⚙️ Installation <a name = "installation"></a>

#### 🎯 Prerequisite:

- [Java](https://www.java.com/en/download/help/index_installing.html) - Programming language
- [Eclipse](https://www.eclipse.org/downloads/) - Editor
- [Maven](https://maven.apache.org/index.html) - Software project Management tool

#### 🔌 Plugins:

- [TestNG for Eclipse Plugin](https://testng.org/doc/eclipse.html) - Test management framework
- [Maven Integration for Eclipse](https://marketplace.eclipse.org/content/maven-integration-eclipse-luna-and-newer) - Build tool
- [Cucumber Eclipse Plugin](http://cucumber.github.io/cucumber-eclipse/) - BDD Cucumber
- [QAF BDD Editor](https://marketplace.eclipse.org/content/qaf-bdd-editors) - Syntax checking for BDD Feature file
- [Natural](https://marketplace.eclipse.org/content/natural) - Coloured readable feature file

All set!!! Just download the Project folder...

---

## 🔁 Dependencies <a name = "dependencies"></a>

Automation framework dependancies are mentioned in the <b>POM.xml</b> file, and are not limited to.

---
## 👩‍💻 Getting Started <a name = "getting_started"></a>

How to use this framework?
- Clone the repository to your workspace.
`git clone https://github.com/NisVek-Automation/Selenium-Java-TestNG-BDD.git`

- Run the TestNG.xml file. You can even run as mvn test which will trigger the TestNG.xml

---

## 🏗️ Framework Structure <a name = "framework-structure"></a>

src/com/nisha

	base --> contains Base class for driver factory
	
	features --> Cucumber/Gherkin feature files directory
	
	hooks --> Hooks class file
	
	pageObject --> Page object model for each application page which contains object locators and functionality of respective page
	
	resource --> Resources which required for project and framework configurations
	
		config.properties --> Project related configuration settings
	
		extent-config.xml --> Controls the reporting structures of extent log report
		
		extent.properties --> Controls all reporting log files
	
		log4j.properties --> Controls all logging to console and log files
	
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
	
pom.xml --> Maven pom file for build and dependencies

testng.xml --> TestNG configuration file

---

## 💬 Contributing <a name = "contributing"></a>

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

---

## ✍️ Author <a name = "author"></a>

- [@NisVek-Automation](https://www.linkedin.com/in/nisha-vekariya/) - Nisha Vekariya
