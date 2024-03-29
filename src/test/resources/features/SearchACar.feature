Feature: Verifying the Search

  Scenario Outline: User fill out the search option
    Given user is on landing page to search
    And  user enter "<location>" in Where text box
    And  user select "<dateFrom>" and "<dateUntil>" under From
    Then User clicks Search button



    Examples:
      | location        | dateFrom | dateUntil |
      | Los Angeles, CA | 15       | 21        |
#      | New York, NY | 23       | 25        |
#      | Texas, TX | 23       | 25        |
#      | Florida, FL | 23       | 25        |