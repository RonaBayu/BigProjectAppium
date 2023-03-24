Feature: CheckIns Feature in Cicle app

  Background: User already logged in into Staging Cicle app
    Given User already opened Staging Cicle app and click big project team
    When User click Check Ins in Team

  @PositiveCase @test
  Scenario: User create check in with valid data in all field
    And User click "+" button in Check-Ins page
    And User input data "How is it going?" in question field
    And User input which day that want to ask the question
    And User set the time
    And User click start collecting answers! button
    Then User should see success message and the question is successfully created


  Scenario: User archive the check in that has been created


  @NegativeCase
  Scenario: User should not be able to create check in without input any data
    And User click "+" button in Check-Ins page
    And User click start collecting answers! button
#    Then User should see error message and the question is unsuccessfully created

  @NegativeCase
  Scenario: User should not be able to create check in without input data in question field
    And User click "+" button in Check-Ins page
    And User input which day that want to ask the question
    And User set the time
    And User click start collecting answers! button


  @NegativeCase
  Scenario: User should not be able to create check in without input data in day
    And User click "+" button in Check-Ins page
    And User input data "How is it going?" in question field
    And User set the time
    And User click start collecting answers! button
    Then User should see success message and the question is successfully created


  @NegativeCase
  Scenario: User should not be able to create check in without input data in set time
    And User click "+" button in Check-Ins page
    And User input data "How is it going?" in question field
    And User input which day that want to ask the question
    And User click start collecting answers! button