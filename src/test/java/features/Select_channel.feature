Feature: Select a channel feature

  Background: User has to select channel
    Given User is select channel


  Scenario: Verify that the user enter in Drama channel
    Given the user navigates to the drama channel
    When the user select the Guppendentha Manasu serial
    Then the Guppendentha Manasu serial results should be displayed


  Scenario: Verify that the user search in Reality channel
  Given the user navigates to the reality channel
  When the user search the channel name
  Then the search channel results should be displayed


  Scenario: Verify that the enter in user Travel channel
  Given the user navigates to the travel channel
  When the user select the Maharastra Vedio
  Then the Maharastra vedio results should be played


  Scenario Outline: Verify that the user can search in sport channel
  Given  User navigates to the sport page
  When  User able to "<search>" the  vedio
  And User can click on enter
  Then User redirected to the relavent page
  Examples:
    |search|
    |Liger|
    |KBD Juniors|


  Scenario: Verify that the user enter in AnimalsandNature channel
    Given User navigates to the AnimalsandNature channel
    When User able to select teaser vedio
    Then the teaser vedio should be played

