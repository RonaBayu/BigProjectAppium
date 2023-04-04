@PrivateChat
Feature: Private Chat Feature in Cicle app
  As a registered user
  I want to be able to send messages in group chat
  So that I can communicate with other members of the group

  Background: User already logged in into Staging Cicle app and a member of team
    Given User already opened Staging Cicle app and click big project team
    When User click Menu button in footer
    And User click inbox button

    @PC_008 @PositiveCase  @done
  Scenario: Send private message
#    And User click + add chat button
    And User click name that want to chat
    And User input message "Hello!" in message field
    And User click the send button
    Then The message is successfully sent to the receiver

     @PC_009 @NegativeCase @done
  Scenario: User should not be able to send message with blank data in message field
#     And User click + add chat button
     And User click name that want to chat
     And User input blank data in message field
     Then User cannot send message and send button is not displayed

     @PC_010 @PositiveCase @done
  Scenario: Delete message in private chat
    And User click name that want to chat
    And User click message that they want to delete
    And User click Delete button in pop up menu
    And User click OK button in the pop-up alert
    Then The message is successfully deleted and text "This message was deleted" on message is displayed