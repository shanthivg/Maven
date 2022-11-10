Feature: Hotel Booking In Adactin Application

Scenario: User login In Adactin Application

Given user Launch The Web Application

When user Enter The UserName In UserName Field

And user Enter The Password In Password Field

Then user Click The Login Button And Navigates To Search Hotel Page

Scenario: User Search Hotel In Adactin Application
When user Select Location in  Dropdown
And user Select Hotel in Dropdown
And user Select RoomType in Dropdown
And user Select Number Of Rooms 
And user Check In Date
And user Check In Out Date
And user Select Adults per Room In  How Many Days
And user  Select Children Per Room In How Many Days
Then user Click the Search Button

Scenario: User Select Hotel Adactin Application
When user Click Box in  Hotel Below the Botton
Then user Click The Continue Button

Scenario: User Book In Hotel Application
When user Text in  First Name
And user Text in Last Name
And user  Text in Billing Address
And user Text In Credit Card Number
And user Select Credit Card Type In Dropdown
And user Select Expiry Month In Dropdown
And user Select Expiry Year In Dropdown
And user Text in Cvv Number 
Then user Click in Book Now Botton

Scenario: User Booking Confirmationa Adactin Application
Then user Click In Logout Botton In Logout Field
