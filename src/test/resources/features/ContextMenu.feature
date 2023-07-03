Feature: Context Menu - The user right clicks on the hot spot, and an alert is displayed.

  Scenario:The user right clicks the hot spot
    Given The user opens the Context Menu Page application
    When The user right clicks on the hotspot
    Then the JavaScript alert You selected a context menu is displayed