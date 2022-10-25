@android
Feature: Calculator

 @test @positive @calscenario1
 Scenario Outline: Calculator functionality
   Given user is already login
   When user input <firstnumber> on first number field
   And user input <secondnumber> on second number field
   And user click dropdown button
   And user choose "<operator>" operator
   And user click equal button
   Then result should be <result>
   Examples:
   |firstnumber|secondnumber|operator|result|
   |2          |2           |+       |4     |
   |8          |2           |-       |6     |
   |3          |4           |*       |12    |
   |10         |5           |/       |2     |
   
 @test @negative @calscenario2
 Scenario: Calculator functionality with invalid string input
   Given user is already login
   When user input "satu" on first number field
   And user input "dua" on second number field
   And user click equal button
   Then result should be "NaN"

  @test @negative @calscenario3
  Scenario: Calculator functionality with invalid special char input
    Given user is already login
    When user input "|" on first number field
    And user input "||" on second number field
    And user click equal button
    Then result should be "NaN"

#  @test @positive @calscenario4
#  Scenario: Calculator functionality with decimal input
#    Given user is already login
#    When user input 0.1 on first number field
#    And user input 0.2 on second number field
#    And user click equal button
#    Then result should be 0.3
