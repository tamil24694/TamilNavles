Feature: axis bank login page check

Scenario: check the login pahe of axis bank
Given User enter the url
When User enter the searchbox 
And User click the text from suggestion 
And User click the first Link
And user click the close X
When User mouseover to login Button
And User click the personal login
When User enter the invalid username
When User enter the invalid password
And click the logn button
Then User validate the invalid text


