Feature: Search by keyword
  I want the ability to search the website
  So that I can find the information I am looking for

  @cci-search
  Scenario Outline: Search by keyword
    Given I am on clear channel international home page
    And I click on search icon
    And I search for <searchterm>
    When I click on search
    Then search results are displayed
    Examples:
      | searchterm |
      | test       |