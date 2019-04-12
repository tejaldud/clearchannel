# Project Title

Serenity Selenium Web Automation 

## Getting Started
These instructions will guide you on how to run tests with different parameters.
See _Running the tests_ section for specific commands.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Serenity](http://thucydides.info/docs/serenity-staging/) - Serenity BDD is an open source library for test automation.
* [Java](https://www.oracle.com/java/) - Programming Language

## Running the tests
* Run all tests:  
Command to run all tests.

        mvn clean verify 
    
* Run tests with specific tag:  
Command to run all the tests tagged with a specific tag. 

        mvn clean verify  -Dcucumber.options="--tags @cci-search" 
 
* Run tests for specific application on specific environment:  
    Command to run tests on different environments. For example, below command will run all tests for application heroapp on production system. 
    We are using Maven Profile to achieve this functionality.

        mvn clean verify -P herokuapp-prod

## How to check Test Report

Go to folder /target/site/serenity and open index.html

## Json Resource File
The sample JSON file is located at /src/test/resources/ folder.