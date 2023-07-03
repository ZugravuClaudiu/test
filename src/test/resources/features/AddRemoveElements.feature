Feature: Add and Remove elements - this feature tests AddRemoveElements
  Scenario: The user can add and delete a button
    Given The user enters the application
    When the user clicks on the Add button
    And the user clicks on the Delete button
    Then The delete button no longer exists

  Scenario: The user can add and delete multiple buttons
    Given The user enters the application
    When The user ads multiple buttons
    And the user removes multiple buttons
    Then The delete button no longer exists
