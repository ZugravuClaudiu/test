Feature: Login Tests - this feature contains all Login tests

  Background:
    Given the user opens the Login application

  Scenario: The user can successfully log in
    When the user enters a username "tomsmith"
    And the user enters a valid password "SuperSecretPassword!"
    And the user clicks on the Login button
    Then the user is successfully logged in

  Scenario: The user logs in with invalid username
    When the user enters a username "sdfsdfs"

