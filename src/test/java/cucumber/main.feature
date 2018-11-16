
@SmokeTest
Feature: basic smoke test
  Test high scenarios for Straits Times app



	@Scenario1
	Scenario:Navigate Straits Times Home and Singapore
		Given I have installed Straits Times mobile app
		And I have passed through the registration
		When I have skip the advertisement and scroll down the home
		And I click on Singapore tab and scroll down to select an article
		Then I click back and see Singapore page
		

		
		


