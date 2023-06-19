@CheckIns
Feature: CheckIns Feature in Cicle app

  Background: User already logged in into Staging Cicle app
    Given User already opened Staging Cicle app and click big project team
    When User click Check Ins in Team

  @CI_001 @PositiveCase
  Scenario: User should be able to create check in with valid data in all field
    And User click "+" button in Check-Ins page
    And User input data "How is it going?" in question field
    And User input which day that want to ask the question
    And User set the time
    And User click start collecting answers! button
    Then User should see success message and the question is successfully created

  @CI_002 @NegativeCase
  Scenario: User should not be able to create check in without input any data
    And User click "+" button in Check-Ins page
    And User click start collecting answers! button
    Then User should see error message and the question is unsuccessfully created

  @CI_003 @NegativeCase
  Scenario: User should not be able to create check in without input data in question field
    And User click "+" button in Check-Ins page
    And User input which day that want to ask the question
    And User set the time
    And User click start collecting answers! button
    Then User should see error message and the question is unsuccessfully created

  @CI_004 @NegativeCase
  Scenario: User should not be able to create check in without input data in day
    And User click "+" button in Check-Ins page
    And User input data "How is it going?" in question field
    And User set the time
    And User click start collecting answers! button
    Then User should see error message and the question is unsuccessfully created

  @CI_005 @NegativeCase
  Scenario: User should not be able to create check in without input data in set time
    And User click "+" button in Check-Ins page
    And User input data "How is it going?" in question field
    And User input which day that want to ask the question
    And User click start collecting answers! button
    Then User should see error message and the question is unsuccessfully created

  @CI_006 @PositiveCase
  Scenario: User should be able to add comment in the question that has been created
    And User click the question that has been created
    And User input valid data "I'm good" in add new comment field
    And User click submit button
    Then User should be able to see the comment

  @CI_007 @NegativeCase
  Scenario: User should not be able to add blank data comment in the question that has been created
    And User click the question that has been created
    And User input blank data in add comment field
    And User click submit button
    Then User should not be able to submit comment

  @CI_008 @PositiveCase
  Scenario: User should be able to edit the comment
    And User click the question that has been created
    And User click three dots of the comment
    And User click Edit Comment button
    And User input new data "I'm good all" in comment field
    And User click submit button
    Then User should be able to see the new comment

  @CI_009 @PositiveCase
  Scenario: User should be able to tag member in comment
    And User click the question that has been created
    And User click comment field
    And User click @ symbol
    And User click the member
    And User click submit button
    Then User is successfully tag member in comment

  @CI_010 @PositiveCase
  Scenario: User should be able to archive the comment
    And User click the question that has been created
    And User click three dots of the comment
    And User click Archive button
    And user click ok button
    Then The comment is successfully archived