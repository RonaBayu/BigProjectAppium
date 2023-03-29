@CheckIns
Feature: CheckIns Feature in Cicle app

  Background: User already logged in into Staging Cicle app
    Given User already opened Staging Cicle app and click big project team
    When User click Check Ins in Team

  @PositiveCase @CI_001 @done
  Scenario: User create check in with valid data in all field
    And User click "+" button in Check-Ins page
    And User input data "How is it going?" in question field
    And User input which day that want to ask the question
    And User set the time
    And User click start collecting answers! button
    Then User should see success message and the question is successfully created

  @NegativeCase @CI_002 @done
  Scenario: User should not be able to create check in without input any data
    And User click "+" button in Check-Ins page
    And User click start collecting answers! button
    Then User should see error message and the question is unsuccessfully created

  @NegativeCase @CI_003 @done
  Scenario: User should not be able to create check in without input data in question field
    And User click "+" button in Check-Ins page
    And User input which day that want to ask the question
    And User set the time
    And User click start collecting answers! button
    Then User should see error message and the question is unsuccessfully created

  @NegativeCase @CI_004 @done
  Scenario: User should not be able to create check in without input data in day
    And User click "+" button in Check-Ins page
    And User input data "How is it going?" in question field
    And User set the time
    And User click start collecting answers! button
    Then User should see error message and the question is unsuccessfully created

  @NegativeCase @CI_005 @done
  Scenario: User should not be able to create check in without input data in set time
    And User click "+" button in Check-Ins page
    And User input data "How is it going?" in question field
    And User input which day that want to ask the question
    And User click start collecting answers! button
    Then User should see error message and the question is unsuccessfully created

  @PositiveCase @CI_006 @done
  Scenario: User add comment in the question that has been created
    And User click the question that has been created
    And User input valid data "I'm good" in add new comment field
    And User click submit button
    Then User should be able to see the comment

  @NegativeCase @CI_007
  Scenario: User can not add blank data comment in the question that has been created
    And User click the question that has been created
    And User input blank data in add comment field
    And User click submit button
    Then User should not be able to see the comment

    @test
  Scenario: User can edit the comment
    And User click the question that has been created
    And User click three dots of the comment
    And User click Edit Comment button
    And User input new data "I'm good all" in comment field
    And User click submit button


  Scenario: User can archive the comment
    And User click the question that has been created
    And User click three dots of the comment
    And User click Archive button
    And user click ok button
#    Then



#  @PositiveCase
#  Scenario: User archive the check in that has been created
#    And User click the question that has been created
#    And User click three dots of the question
#    And User click Archive button
#    And User click Yes button
#    Then User should not see the question in check ins page