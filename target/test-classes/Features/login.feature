@login
Feature: Valiadte login feature

  #  @tag2
  #  Scenario Outline: Validating login feature
  #   Given User enter the application url
  #  When User enters UserName and click on continue button
  #   | UserName   |
  #   | <UserName>|
  # Then User Enters password
  #  | password   |
  # | <password>  |
  #Then User click on Submit button
  #   Examples:
  #    | UserName                  | password  |
  #   | Archana.patil@walmart.com | Welcome@1 |
  #  | Archanaarun.allur@gmail.com | Welcome@1 |
         @login
      Scenario Outline: Validating login feature
     Given User enter the application url
    When User enters "<UserName>" and click on continue
     Then User Enters password
     | password   |
    | <password>  |
   Then User click on Submit button
     Examples:
      | UserName                  | password  |
      | Archana.patil@walmart.com | Welcome@1 |
  #  | Archanaarun.allur@gmail.com | Welcome@1 |
  
  @login
  Scenario Outline: Validating login feature
    Given User enter the application url
    When User enters "<UserName>" and password click on continue
      | password   |
      | <password> |
    Then User click on Submit button

    Examples:  
      | UserName                    | password  |
      | Archana.patil@walmart.com   | Welcome@1 |
    #  | Archanaarun.allur@gmail.com | Welcome@1 |
