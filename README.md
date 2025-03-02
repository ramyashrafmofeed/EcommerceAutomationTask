# EcommerceAutomationTask
Project Overview
This is a Selenium automation project for testing the Create Account and Login functionalities on the Tealium Ecommerce Demo website. The framework uses Java, TestNG, Page Object Model (POM), and Apache POI for reading test data from Excel.

Setup Instructions
1. Prerequisites
Make sure you have the following installed:

Java (JDK 11 or later)
Apache Maven
Google Chrome
Git

2. Clone the Repository
git clone https://github.com/ramyashrafmofeed/EcommerceAutomationTask.git
cd EcommerceAutomationTask


4. Install Dependencies
Run the following command to install all required dependencies:
mvn clean install

4. Run the Tests
Run All Tests
mvn test
Run a Specific Test (e.g., Registration Test)
mvn test -Dtest=RegistrationTest

Test Cases Covered
✅ User Registration Tests:

Register a new user with valid details
Validate error message for invalid email
Validate error message for missing fields
✅ Login Tests:

Log in with valid credentials
Validate error message for wrong password
Validate error message for non-existing user

Test Data
Test data is stored in src/test/resources/EcommerceAutomationData.xlsx
Update the file with the required details before running the tests
Troubleshooting
If chromedriver is not found, make sure Chrome is installed and run mvn clean install.
If the Excel file is missing, make sure EcommerceAutomationData.xlsx is in src/test/resources/.
