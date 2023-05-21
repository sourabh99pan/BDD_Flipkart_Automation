Feature: Feature to test lacaptitale login

  Scenario: Check Login is successfull with valid credentials
    Given user is on login page
    When user enters username and password
    	|username|breathelife@lacapitale.com|
    	|password|MmdZLQ@7FWj0YbW|
    And clicks on login button
    Then user is navigated to home page
