Feature: To validate the values on the given Page

	Scenario Outline: Validate the values on the Page
		Given user is on the Page
		When the values are displayed
		Then the right "<count>" of values appear on the screen
		And the values on the screen are greater than "<number>"
		And the total balance is correct based on the values listed on the screen
		And the values are formatted as currencies
		And the total balance matches the the sum of values
		Examples:
		|count	|number	|
		|   5	|   0	|