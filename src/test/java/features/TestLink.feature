@testGoogleSearch
Feature: Test Google search Link
Scenario Outline: To verify search result Link in Google
Given i open url '<url>' in browser
When i search for '<keyword>' and search
When i check links in page
Then i search entered '<keyword>' in page and verify occurence

Examples:
      | url      							 | keyword|
      | https://www.google.com/| oracle |