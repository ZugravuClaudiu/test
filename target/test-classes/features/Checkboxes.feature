Feature: CheckBoxes - this feature tests checkboxes app
  Scenario: the user is able to check/uncheck the checkboxes
    Given the user opens the checkboxes application
    When the user clicks the checkboxes
    Then CheckBox1 is checked, and CheckBox2 is unchecked
