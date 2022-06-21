@contact_us @regression

Feature: WebDriver_University - Contact_us

  Scenario: To validate successful submission of Contact us Page
    Given I access to the WebDriverUniversity contact us Page
    When I enter valid First Name
    And I enter valid Last Name
    And I enter valid email address
    And I enter valid comment
    And I click submit button
    Then I should be presented by a successful submission message

    Scenario: To validate successful submission of Contact_Us Page - Cucumber_Expression
      Given I access to the WebDriverUniversity contact us Page "https://www.webdriveruniversity.com/Contact-Us/contactus.html"
      When I enter valid First Name Prani
      And I enter valid Last Name Prabha
      And I enter valid email address 123@abc.com
      And I enter valid comment "agg,,,,gaffggaV asfs HASH"
      And I click submit button
      Then I should be presented by a successful submission message
