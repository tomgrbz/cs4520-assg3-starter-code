
## Link to forked repo: https://github.com/tomgrbz/cs4520-assg3-starter-code


## Project Overview
This project emulates a basic calculator that supports the following basic mathematical operations between two numbers: add, subtract, multiply, and divide.
The result of these operations are outputted below following the `Result` text edit field. If any operation were to fail either due to invalid inputs or a divide by 0 error, then a toast message
is displayed to the user notifying them. 


Following successful login, the user can then see a list of products, with each featuring an image, name, expiry date (if applicable), and price. Food products have a yellow background while tools have a red background, to distinguish between the two.

To get back to the login page, the user can swipe to the right, from the left side of the screen. Performing this action again, the user will then close the app.

To run this app in android studio, it has been tested on Pixel 3A on API level 34, and the generic medium sized Android at the same level. 
## Architecture

There is not much to go into detail here. There is a single main activity which sets the navigation graph for child fragments. The navigation graph has most of the movement logic in regards to navigating the app, namely that the user is prompted with the login fragment which just holds logic for checking the admin credentials are correct, to which it then uses the nav graph to emit the action to move to the Product List page. At this page the user interacts with a list of products using the Recycler view pattern, with an adapter made for creating the views of each product. 

 
