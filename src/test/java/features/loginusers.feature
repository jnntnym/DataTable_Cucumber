Feature:Login with multiple user data with valid credentials
@loginTable
  Scenario: Login with multiple users data
    Given The user is in signin page
    When we enters multiple user data as below
      | Email   | Password |
      | abc@123 | a123     |
      | def@123 | b456     |
      | xyz@123 | c789     |
    And enters the above data
    When user hit the login button
    Then users should be logged in successfully




