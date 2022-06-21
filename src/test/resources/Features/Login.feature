@Login  @regression

  Feature: WebDriver University_Login

    Scenario: To validate successful Login - Correct Credentials
      Given I access to the WebDriver University Login portal "https://www.webdriveruniversity.com/Login-Portal/index.html?"
      When I enter valid Username webdriver
      And I enter valid Password webdriver123
     And I click Login button
      Then I should be presented by successful login message

      Scenario: To validate unsuccessful login - Incorrect Credentials
        Given I access to the WebDriver University Login portal "https://www.webdriveruniversity.com/Login-Portal/index.html?"
        When I enter invalid Username ajgdgd
        And I enter invalid password gjkGD123
        And I click Login button
        Then I should be presented by Login failed message



