Feature: Search functionality
  As a jobseeker on NHS jobs website
  I want to search for a job with my preferences
  So that I can get recently posted job results

  @wip
  Scenario: Search for a job with my preferences
    Given I am a jobseeker on NHS job website
    When I put my preferences into the search functionality
    Then I should get a list of jobs which matches my preferences
    And sort my search results with the newest date posted
