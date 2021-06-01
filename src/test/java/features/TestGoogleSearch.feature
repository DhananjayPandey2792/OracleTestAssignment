@testGoogleSearch
Feature: Test Google search
Scenario Outline: To verify search result in Google
Given i open url '<url>' in browser
When i search for '<keyword>'
Then search result is displayed
Then retrieve and store the top 10 results
Then i read the values from the file and display it in the console


Examples:
      | url      							 | keyword|
      | https://www.google.com/| oracle |
      | https://www.google.com/| Test   |
      | https://www.google.com/| Google |
      | https://www.google.com/| Java   |
      | https://www.google.com/| python |
      