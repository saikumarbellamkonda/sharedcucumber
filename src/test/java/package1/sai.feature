Feature: Test calculator
Scenario:Add two number
Given I enter 50 in calculator
And I press add
And I have entered 50 in calculator
When  I press equal symbol
Then The result should be 100 on screen