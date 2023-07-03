Feature: DropDown Page - this feature tests the Drop Down page
  Scenario: The user is able to choose Option 1
    Given The user navigates to the DropDown Page
    When The user clicks on the 'Please select an option' menu
    And The user selects Option 1 and 2
    Then The drop down menu displays Option 2