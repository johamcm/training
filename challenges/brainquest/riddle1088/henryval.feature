# language: en

Feature: Solve the riddle 1088
  From bqbi.net brainquest website
  From the orbis pictus category
  With my username henryval

  Background:
    Given a picture of some island
    And I have access to internet

  Scenario: Successful solution
    Given the image
    When I see look for it on google images
    And I find the solution
    Then I solve the challenge
