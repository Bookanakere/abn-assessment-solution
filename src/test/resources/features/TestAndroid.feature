Feature: Validate homepage of the app
  User should be able to land on the homepage with correct welcome message and features

  Scenario: Validate welcome message on the homepage
    Given the app is open on the android device
    Then I should see the message "Hello World!"

  Scenario: Validate title on the homepage screen
    Given the app is open on the android device
    Then I should see the title "ReferenceAndroid"