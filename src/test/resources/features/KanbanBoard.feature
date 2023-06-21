@KanbanBoard
Feature: Kanban Board Feature in Cicle app

  Background: User already logged in into Staging Cicle app
    Given User already opened Staging Cicle app and click big project team
    When User click Kanban Board in Team

  @KB_001 @PositiveCase
  Scenario: User add board list with valid data in board list name field
    And User click "+" button
    And User input board name "This is board" in board list name field
    And User click the submit button
    Then Board list is successfully created

  @KB_002 @NegativeCase
  Scenario: User should not be able to add board list with blank data in board list name field
    And User click "+" button
    And User input blank data in board list name field
    And User click the submit button
    Then The board list is not successfully created

  @KB_003 @PositiveCase
  Scenario: User add card list with valid data in card name field
    And User click add new card button in board that has been created
    And User input card name "This is card" in card name field
    And User click "checklist logo" in card name field
    Then Card is successfully created

  @KB_004 @NegativeCase
  Scenario: User should not be able to add card list with blank data in card name field
    And User click add new card button in board that has been created
    And User input blank data in board card name field
    And User click "checklist logo" in card name field
    Then Card is not successfully created

  @KB_005 @NegativeCase
  Scenario: User should not be able to add comment in card with blank data in add new comment field
    And User click card that has been created
    And User input blank data in add new comment field
    And User click submit comment button
    Then User is not successfully add comment and showed error message

  @KB_006 @NegativeCase
  Scenario: User should not be able to add label with blank data
    And User click card that has been created
    And User click +label button
    And User input blank data in label name field
    And User click submit button
    Then The label is not successfully added

  @KB_007 @PositiveCase
  Scenario: User should be able to set as a complete list
    And User click three dots of list
    And User click set as a complete list button
    Then The list is set as a complete

  @KB_008 @PositiveCase
  Scenario: User should be able to unset complete list
    And User click three dots of list
    And User click unset complete list button
    Then The list is unset as a complete

  @KB_009 @PositiveCase
  Scenario: User archive all cards list in one board list
    And User click three dots of list
    And User click Archive all cards in this list button
    Then All cards is successfully archived and showed success message

  @KB_010 @PositiveCase
  Scenario: User archive board list that has been created
    And User click three dots of list
    And User click Archive this list button
    Then The board list is successfully archived and showed success message
