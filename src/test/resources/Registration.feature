Feature: Festicket

  Scenario: Register with valid details

    When I click on log in button
    Then I should see login text as "Log in"
    Given I enter email as "test1@gmail.com"
    Given I enter password as "festicket"
    When I click on login button
    When I click on cross button image on top right corner
    Then I should see expected user name
    When I click on log out

