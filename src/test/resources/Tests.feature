Feature: Tests on Orange HRM

  Background: Final Project
    Given I am in open source orange page

    @loginPageWithValidCredentials
    Scenario: Login into OpenSource OrangeHRM page with valid credentials
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then The home page should be displayed
      Then I logout

  @loginWithSetOfValidCredentials
  Scenario Outline: Login into OpenSource OrangeHRM page with invalid credentials
    Given I set the user name field with "<user>"
    And I set the password field with "<password>"
    When I click on the login button
    Then An error message should be displayed
    Examples:
      | user                   | password     |
      | Admin                  | admin1234    |
      | Admin                  | admin1597    |
      | Admin                  | 1234admin    |


    @AddEmployeeTest
    Scenario: Add employee to de database
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then I click on the PIM button
      Then I click on the Add button
      And I set the first name as "Lucas"
      And I set the middle name as "Santiago"
      And I set the last name as "Sanchez"
      When I click on the switch button
      Then I set the username "lucas1" and password "lucas1234567"
      And I save the new employee information
      Then I logout
      Given I set the user name field with "lucas1"
      And I set the password field with "lucas1234567"
      When I click on the login button
      Then The home page should be displayed
      Then I logout


    @DeleteEmployee
    Scenario: Delete employee to de database
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then I click on the PIM button
      Then I search the employee by their name: "Lucas Santiago Sanchez"
      Then I click on the trash button
      Then I delete the employee