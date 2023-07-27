@calendar
Feature: Calendar Event Creation Feature

  Background: For all scenarios user is logged into application and on the calendar module of application
    Given user is enters username and password and hits enter
    Then user clicks on calendar link to access calendar module

  @wip @B29G19-212
  Scenario: User can create event by clicking on time box
    When user clicks on timebox for All day on sun
    And user enters information in summary section of pop-up window
    And user clicks Create
    Then user should see event created in that time box

  @B29G19-213
  Scenario: User can see event details when clicking the event on the calend
    When user clicks on event in timebox
    Then user should see pop-up window with event details
