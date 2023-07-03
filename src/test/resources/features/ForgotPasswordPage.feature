Feature:ForgotPassword - this feature tests the Forgot Password Page
  Scenario:The user can add a random password
    Given The user navigates to ForgotPassword app
    When The user enters a random password "randompass"
    And The user clicks on 'Retrieve Password' button
    Then A new message appears displaying 'Internal Server Error'
