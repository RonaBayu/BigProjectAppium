@GroupChat
Feature: Group Chat Feature in Cicle app

  Background: User already logged in into Staging Cicle app
    Given User already opened Staging Cicle app and click big project team
    When User click group chat in Team

  @PositiveCase @GC_001
  Scenario: Send message in group chat with valid data in message field
    And User input data in message field
    And User click send button
    Then Message is successfully sent and displayed in group chat

  @PositiveCase @GC_002
  Scenario: Send or upload video in group chat
    And User click attach logo
    And User click Document & Video
    And User choose and click Video
    Then Video is successfully sent and displayed in group chat

  @PositiveCase @GC_003
  Scenario: Send or upload image from camera in group chat
    And User click attach logo
    And User click image from camera
    And User click shutter camera
    And User click checklist logo
    Then Image from camera is successfully sent and displayed in group chat

  @PositiveCase @GC_004
  Scenario: Send or upload image from gallery in group chat
    And User click attach logo
    And User click image from gallery
    And User choose and click image
    Then Image from gallery is successfully sent and displayed in group chat

  @PositiveCase @GC_005
  Scenario: Send message and mention all member in group chat with valid data in message field
    And User click message field
    And User input data in message field
    And User click @ button
    And User click mention all button
    And User click send button
    Then Message is successfully mentioned all sent and displayed in group chat



  @NegativeCase
  Scenario: Send message in group chat with blank data in message field
    And User input blank data in message field
    Then User cannot send message and send button is not displayed







#  Scenario: Send message and upload file (rar/zip) in group chat with valid data in message field
#  Scenario: Send message and upload file (exe) in group chat with valid data in message field
#  Scenario: Send message and upload file (apk) in group chat with valid data in message field
#
#  Scenario: Delete message in group chat
#  Scenario: Send message and tag member in group chat with valid data in message field
#  Scenario: Send link message in group chat with valid data in message field
#  Scenario: Send message with background color in group chat with valid data in message field
#
#  @NegativeCase
#  Scenario: Send message and upload file (pdf) in group chat with valid data in message field
#  Scenario: Send message and upload file (excel) in group chat with valid data in message field
#  Scenario: Send message and upload file (word) in group chat with valid data in message field
#  Scenario: Send message and upload 2 different format file (word and picture) in group chat with valid data in message field
#
#
#  @PositiveCase @PrivateChat
#  Scenario: Send message in private chat to another member with valid data in message field
