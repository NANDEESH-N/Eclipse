Feature: Testing ecommerce website

  Background: landing page of ecommerce

  Scenario Outline: User Register Functionality Test
    Given Go to Register page
    When enter the login details with "<firstname>","<lastname>","<email>","<password>" and "<confirmPassword>"
    Then click on register button

    Examples: 
      | firstname | lastname | email           | password | confirmPassword |
      | user      |        1 | user1@gmail.com |   123123 |          123123 |
      | user      |        2 | user2@gmail.com |   123123 |          123123 |
      | user      |        3 | user3@gmail.com |   123123 |          123123 |
