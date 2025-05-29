Feature: Ebay Home page scenarios

  Scenario: Navigating to advanced search
    Given I am in ebay homepage
    When I click the advanced search link
    Then I navigated to the advanced search page

  Scenario: Clicking the ebay Logo
    Given I am in ebay homepage
    When I click the EBay Logo
    Then I navigated to the Ebay Homepage

  Scenario Outline: I search for a baby product by selecting the search category
    Given I am in ebay homepage
    When I enter the '<product>'
    And I select the '<category>'
    And click the search button
    Then I get the relevant '<product>' for the search
    And have multiple '<product>' listed

    Examples:
      | product     | category     |
      | Baby Powder | Baby         |
      | Cat Food    | Pet Supplies |
