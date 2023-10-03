Feature: Access Home Page Without Login
  As a user,
  I want to able to access the home page without the need to log in
  So that i can quickly view information about the application

  Scenario: Access without login
    Given User navigate to first page
    And User select get started
    And User select 3 topics
    And User select continue
    When User select skip login
    Then User is already on the home page