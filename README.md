# OracleTestAssignment
Here i have used BDD framework with Java and cucumber. So In this we have src/main/java in which there are following components:
1)CommonLib-Here i have method to fetch the data from config.ini file based on key and also to fetch the report path from config.ini.
2)DriverInitialise-Here i am initializing all the drivers that a user can pass.
3)ObjectDeclaration-Here we have created object for all the classes and all classes can extend these to access method of all other classes.

Package pageObjects
1)Here we common po where common methods are defined
2)Also there is googlesearchpo where search page elements and respective methods are defined

Package stepdef
Here we have the step defination file where we have called our page objects methods in repective feature lines.

testrunner
In test runner is the place from where we run our cases.

src/test/java
Here i have kept all feature files.

drivers folder has all the drivers like chrome.

Test report will be available in Target folder

Results of test is written in inputfile-results.txt

pom.xml has project dependencies
