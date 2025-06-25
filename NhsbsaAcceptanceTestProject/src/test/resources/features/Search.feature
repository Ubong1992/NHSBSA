@wip
Feature: Search functionality
  As a jobseeker on NHS jobs website
  I want to search for a job with my preferences
  So that I can get recently posted job results


  Scenario: Jobseeker searches with full preferences
    Given I am on the NHS job search page
    When I enter "Automation Test" as the job title
    And I enter "NE15 8NY" as the postcode
    And I select "+10 Miles" as the distance
    And I click on search options
    And I enter "914-BSA7285783" as the job reference
    And I enter "NHS Business Services Authority" as the employer
    And I select "£30,000 to £40,000" as the pay range
    Then I should see relevant job results
