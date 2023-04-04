@GroupChat
Feature: Group Chat Feature in Cicle app
  As a registered user
  I want to be able to send messages in group chat
  So that I can communicate with other members of the group

  Background: User already logged in into Staging Cicle app and a member of team
    Given User already opened Staging Cicle app and click big project team
    When User click group chat in Team

  @PositiveCase @GC_001 @done
  Scenario: Send message in group chat with valid data in message field
    And User input data "Hello all" in message field
    And User click send button
    Then Message is successfully sent and displayed in group chat

  @PositiveCase @GC_002
  Scenario: Send or upload video in group chat
    And User click attach logo
    And User click Document & Video
    And User choose and click Video
#    Then Video is successfully sent and displayed in group chat

  @PositiveCase @GC_003
  Scenario: Send or upload image from gallery in group chat
    And User click attach logo
    And User click image from gallery
    And User choose and click image
#    Then Image from gallery is successfully sent and displayed in group chat

  @PositiveCase @GC_004 @done
  Scenario: Send or upload file pdf format in group chat
    And User click attach logo
    And User click Document & Video
    And User choose and click pdf file
    Then pdf file is successfully sent and displayed in group chat

  @PositiveCase @GC_005
  Scenario: Send message and mention all member in group chat with valid data in message field
    And User click message field
    And User input data "Hello all" in message field
    And User click @ button
    And User click mention all button
    And User click send button
#    Then Message is successfully mentioned all sent and displayed in group chat

  @PositiveCase @GC_006 @done
  Scenario: Delete message in group chat
    And User input data "Hello all" in message field
    And User click send button
    And User click on the message that they want to delete
    And User click Delete button in pop up menu
    And User click OK button in the pop-up alert
    Then The message is successfully deleted and text "This message was deleted" on message is displayed

  @NegativeCase @GC_007 @done
  Scenario: User should not be able to send message in group chat with blank data in message field
    And User input blank data in message field
    Then User cannot send message and send button is not displayed
