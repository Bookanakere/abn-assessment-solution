Feature: Validate message shown on clicking mail icon
  User should be able to see a notification message when they click on mail icon

  Scenario: Validate message shown on clicking mail icon
    Given the app is open on the android device
    When I click on the mail icon
    Then I should see a notification message "Replace with your own action"