@login @android
Feature: Scroll, long press, and multiple tap functionality

  @test @positive
  Scenario: Scroll page functionality
    Given user is already login
    When user click hamburger button
    And user click list menu
    And user do scroll

  @test @positive
  Scenario: Long press functionality
    Given user is already login
    When user click hamburger button
    And user click list menu
    And user do long press

  @test @positive
  Scenario: Multiple tap functionality
    Given user is already login
    When user click hamburger button
    And user click list menu
    And user do taps