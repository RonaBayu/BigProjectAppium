@KanbanBoard
Feature: Kanban Board Feature in Cicle app

  Background: User already logged in into Staging Cicle app
    Given User already opened Staging Cicle app and click big project team
    When User click Kanban Board in Team


  Scenario: User add board list with valid data in board list name field
    And User click "+" button
    And User input board name "This is board" in board list name field
    And User click submit button
    Then Board list is successfully created

#  Scenario: User archive board list that has been created


  Scenario: User add card list with valid data in card name field
    And User click add new card button in board that has been created
    And User input card name "This is card" in card name field
    And User click "checklist logo" in card name field
    Then Card is successfully created
#
#  Scenario: User archive all cards list in one board list
#  Scenario: User set card to private
  

    @test
  Scenario: User add board list with blank data in board list name field
    And User click "+" button
    And User input blank data in board list name field
    And User click submit button
    Then The board list is not successfully created

  # Scenario: User edit board list name with blank data in board list name field

#  Scenario: User add card list with blank data in card name field
