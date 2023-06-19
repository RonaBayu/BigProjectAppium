@GroupChat
Feature: Group Chat Feature in Cicle app

  Background: User already logged in into Staging Cicle app and a member of team
    Given User already opened Staging Cicle app and click big project team
    When User click group chat in Team

  @GC_001 @PositiveCase
  Scenario: Send message in group chat with valid data in message field
    And User input data "Hello all" in message field
    And User click send button
    Then Message is successfully sent and displayed in group chat

  @GC_002 @PositiveCase
  Scenario: Send or upload file pdf format in group chat
    And User click attach logo
    And User click Document & Video
    And User choose and click pdf file
    Then pdf file is successfully sent and displayed in group chat

  @GC_003 @PositiveCase
  Scenario: Send or upload file word format in group chat
    And User click attach logo
    And User click Document & Video
    And User choose and click word file
    Then Word file is successfully sent and displayed in group chat

  @GC_004 @PositiveCase
  Scenario: Send or upload file excel format in group chat
    And User click attach logo
    And User click Document & Video
    And User choose and click excel file
    Then Excel file is successfully sent and displayed in group chat

  @GC_005 @PositiveCase
  Scenario: Delete message in group chat
    And User input data "Hello all" in message field
    And User click send button
    And User click on the message that they want to delete
    And User click Delete button in pop up menu
    And User click OK button in the pop-up alert
    Then The message is successfully deleted and text "This message was deleted" on message is displayed

  @GC_006 @PositiveCase
  Scenario: Send message and mention all member in group chat with valid data in message field
    And User click message field
    And User input data "Hello all" in message field
    And User click @ button
    And User click mention all button
    And User click send button
    Then Message is successfully mentioned all sent and displayed in group chat

  @GC_007 @NegativeCase
  Scenario: User should not be able to send message in group chat with blank data in message field
    And User input blank data in message field
    Then User cannot send message and send button is not displayed

  @GC_008 @NegativeCase
  Scenario: User should not be able to Send or upload file txt format in group chat
    And User click attach logo
    And User click Document & Video
    And User choose and click txt file
    Then Txt file is unsuccessfully sent

  @GC_009 @NegativeCase
  Scenario: User should not be able to Send or upload file apk format in group chat
    And User click attach logo
    And User click Document & Video
    And User choose and click apk file
    Then Apk file is unsuccessfully sent