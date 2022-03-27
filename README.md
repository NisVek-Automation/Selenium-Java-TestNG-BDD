# UI/Web Application Testing - Selenium BDD Framework
![Selenium BDD Framework](https://github.com/NisVek-Automation/NisVek-Automation/blob/main/readmeResources/SeleniumBDD.gif)

Don't forget to give this project a ⭐
<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

## 📝 Table of Contents

- [About](#about)
- [Features](#features)
- [Framework principle](#principle)
- [Technologies](#technologies)
- [Installation](#installation)
- [Dependencies](#dependencies)
- [Getting Started](#getting_started)
- [Framework Structure](#framework-structure)
- [Logs and Reporting](#logs-reporting)
- [Contributing](#contributing)
- [Authors](#author)

## 🕹 About <a name = "about"></a>
This is an UI/Web Application test Automation framework to start the BDD style automation testing using open source tools.<br>
This project is a template test automation framework, which provides structured and standard way of creating Cucumber JVM (incorporating Gherkin and the BDD 'Given, When Then' testing construct) based automated test scripts for GUI/Web Application testing.

Demo purpose this framework supports automation of few Web Browsers such as Chrome and Edge. However, easily can add other browsers based on project requirements.

The framework incorporates design principle of BDD (Behaviour driven development) which promotes writing acceptance tests by describing behaviour of application under test in simple english language from the perspective of its stakeholders. Having test written in Natural language helps the Project Team (Product Owners, Business Analysts, Development and QA team) to understand and track the requirements

Supports Custom Page Object model which represents the screens of AUT as a series of objects and encapsulates the fields represented by a page which ultimately avoids duplication and improves code maintainability and readability

Sonar Continuous Code Quality Management: - conventions (Checkstyle) and bad practices (PMD)

---

## ✨ Features <a name = "features"></a>

Features Supported by Framework :
- Capable for BDD style UI testing.
- Separate log file for investigation of issue.
- Extent reporting with detail error and screenshots attached.
- Supports cross browsers Testing.
- Custom configuration for framework.
---

### 🎯 Framework principle <a name = "principle"></a>

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

### 📚 Automation Framework Structure:
```
Selenium-Java-TestNG-BDD
└── 📁src/main/java
    ├── 📁com.constants -> Constant values which are used in framework
    │   └── 📄FrameworkConstant.java
    ├── 📁com.driver
    │   ├── 📄Driver.java -> Driver setup and quite activities.
    │   ├── 📄DriverManager.java -> Handles the thread local for the WebDriver.
    │   ├── 📄BaseBrowser.java -> Parent abstract class for browsers.
    │   ├── 📄ChromeBrowser.java -> Represents a Google Chrome Browser related activities.
    │   └── 📄EdgeBrowser.java -> Represents an Edge Browser related activities.
    ├── 📁com.utils
    │   ├── 📄CommonFunctionsHelper.java ->Common functionality for framework such as takescreenshot, etc.
    │   ├── 📄SeleniumHelper.java -> Methods which easily used for selenium UI operations such as click, enter values, verify, etc.
    │   ├── 📄ExceptionHelper.java -> Custome exception for the framework.
    │   ├── 📄PropertyHelper.java -> Read property file functionality.
    │   ├── 📄PropertyEnum.java -> Property file values enum mapping.
    │   └── 📄Log.java -> -> Execution logs is generated by log4j2.
    ├── 📁com.runner -> Test runner file.
    │   └── 📄TestRunner.java
└── 📁src/test/resources -> Resources which required for framework configurations.
    ├── 📄config.properties -> Project related configuration settings.
    ├── 📄extent.properties -> Controls all reporting log files.
    ├── 📄extent-config.xml -> Controls the reporting structures of extent log report.
    └── 📄log4j2.properties -> Controls all logging to console and log files.
	

```
### 📚 Application specific testing structure:

```
Selenium-Java-TestNG-BDD
└──📁src/test/java
    ├── 📁com.features -> Cucumber/Gherkin feature files.
    │   ├── 📄DatadrivenDataTable.feature
    │   └── 📄DatadrivenExample.feature
    ├── 📁com.stepDefinations -> BDD Step Definition files.
    │   ├── 📄DatadrivenDataTable.java
    │   └── 📄DatadrivenExample.java
    ├── 📁com.hooks -> Hooks function e.g. Befor, After methods.
    │   └── 📄Hooks.java 
    └── 📁com.pageObject -> Each page objects and corresponding function of that page.
        ├── 📄BasePage.java
        ├── 📄LoginPage.java
        ├── 📄ProductPage.java
        └── 📄YourCartPage.java
 ```

###  👀 Logs and Reporting <a name = "logs-reporting"></a>

```

Selenium-Java-TestNG-BDD
├──📁extentReports
│  ├── 📄ExtentSparkReport.html
│  └── 📄ExtentReport.pdf
├──📁logs
│  └── 📄test.log
└──📁reports
   ├── 📄cucumberreports.....
   └── 📄...

```

---

## 💬 Contributing <a name = "contributing"></a>

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

---

## ✍️ Author <a name = "author"></a>

- [@NisVek-Automation](https://www.linkedin.com/in/nisha-vekariya/) - Nisha Vekariya
