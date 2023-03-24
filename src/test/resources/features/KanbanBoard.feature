@KanbanBoard
Feature: Kanban Board Feature in Cicle app

  Background: User already logged in into Staging Cicle app
    Given User already opened Staging Cicle app and click big project team
    When User click Kanban Board in Team

  @PositiveCase
  Scenario: User add board list with valid data in board list name field
    And User click "+" button
    And User input board name "This is board" in board list name field
    And User click submit button
    Then Board list is successfully created

  @NegativeCase
  Scenario: User should not be able to add board list with blank data in board list name field
    And User click "+" button
    And User input blank data in board list name field
    And User click submit button
    Then The board list is not successfully created

  @PositiveCase
  Scenario: User add card list with valid data in card name field
    And User click add new card button in board that has been created
    And User input card name "This is card" in card name field
    And User click "checklist logo" in card name field
    Then Card is successfully created

  @NegativeCase
  Scenario: User should not be able to add card list with blank data in card name field
    And User click add new card button in board that has been created
    And User input blank data in board card name field
    And User click "checklist logo" in card name field
    Then Card is not successfully created

  @PositiveCase
  Scenario: User archive all cards list in one board list
    And User click three dots of list that want to archive
    And User click Archive all cards in this list button
    Then All cards is successfully archived and showed success message

  @PositiveCase
  Scenario: User archive board list that has been created
    And User click three dots of list that want to archive
    And User click Archive this list button
    Then The board list is successfully archived and showed success message

  @PositiveCase
  Scenario: User edit card that has been created to private
    And User click card that has been created
    And User click three dots besides card name
    And User click set card to private button
    Then The card is successfully set to private and showed message "update card is success"

  @NegativeCase
  Scenario: User should not be able to add comment in card with blank data in add new comment field
    And User click card that has been created
    And User input blank data in add new comment field
    And User click submit comment button
    Then User is not successfully add comment and showed errror message


  # Scenario: User edit board list name with blank data in board list name field
