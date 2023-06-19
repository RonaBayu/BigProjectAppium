@PrivateChat
Feature: Private Chat Feature in Cicle app

  Background: User already logged in into Staging Cicle app and a member of team
    Given User already opened Staging Cicle app
    When User click Menu button in footer
    And User click inbox button

    @PC_001 @PositiveCase
  Scenario: User should be able to send private message to company member
    And User click name that want to chat
    And User input message "Hello!" in message field
    And User click the send button
    Then The message is successfully sent to the receiver

    @PC_002 @NegativeCase
  Scenario: User should not be able to send private message to non company member
    And User click add chat button
    And User search a non company member name
    Then The member name is not found

    @PC_003 @NegativeCase
  Scenario: User should not be able to send message with blank data in message field
     And User click name that want to chat
     And User input blank data in message field
     Then User cannot send message and send button is not displayed

     @PC_004 @PositiveCase
  Scenario: User should be able to delete message in private chat
    And User click name that want to chat
    And User click message that they want to delete
    And User click Delete button in pop up menu
    And User click OK button in the pop-up alert
    Then The message is successfully deleted and text "This message was deleted" on message is displayed