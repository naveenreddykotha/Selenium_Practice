

Feature: Validating db connection
  
 
  Scenario: verify if connection is successed
    Given JDBC connection through "root" and "master#123"
    When retrieve the data from db and login to website
    Then I validate the login sucessfull
  Scenario: verify if connection was successed and sent wrong parameters
    Given JDBC connection through "root" and "master#123"
    When retrieve the data from db and login to website
    Then I validate the login was unsuccessfull
