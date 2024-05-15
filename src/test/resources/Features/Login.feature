Feature: Login with Valid Credentials

  @Smoke
  Scenario: Check search function
    Given the user navigates to login page
    And I click on st

  @WebTesting
  Scenario: Verify the PDF Training file exists
    Given I am on the home page
    And I click on the "Driver Support" in the "Drivers" menu of the menu bar
    And I am on the driver support page
    And I search for "driver" from the text box search
    And I verify the text "Download the Jitsu Driver Training PDF" is displaying on the page
    And I click on "Download the Jitsu Driver Training PDF" and download file




