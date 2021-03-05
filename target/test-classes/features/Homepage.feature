Feature:Verifying the Main Page

  Scenario: Homepage verification
    Given user is on landing page
    And user verifies that default elements on homepage
    Then user verifies that homepage title is present