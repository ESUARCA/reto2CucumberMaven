@Feature1
Feature: Conference playback on the TED plataform
  As a TED user, I want to log in to the platform and playback one of the conferences

  @tag1
  Scenario: Reproduce a conference on the TED platform
    Given I open the browser on the TED page
    Given I enter the credentials of esuarca@gmail.com with Esuarca1026
    When  I want to search the conference How humans could evolve to survive in space
    When  I open the conference
    When  I reproduce the conference
    Then  I open the conference correctly
   