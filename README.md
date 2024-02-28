
## Link to forked repo: https://github.com/tomgrbz/cs4520-assg3-starter-code


## Project Overview
This project emulates a basic calculator that supports the following basic mathematical operations between two numbers: add, subtract, multiply, and divide.
The result of these operations are outputted below following the `Result` text edit field. If any operation were to fail either due to invalid inputs or a divide by 0 error, then a toast message
is displayed to the user notifying them. 

The user is first prompted whether to use the app with a MVP or MVVM architecture. The same calculator is present on both architectures of the app.
Only difference being that the MVVM's result will stay persistent across horizontal and vertical arrangements of the device.

To run this app, open android studio after building the app, against Pixel 3A on API level 34, or the generic medium sized Android at the same level. 
## Architecture

There are two architectural patterns employed in this project. 
- Model, View, Presenter (MVP)
  
  - Model: Represents the data and business logic of the application. In this context, the CalculatorModel class encapsulates the functionality for performing arithmetic operations such as addition, subtraction, multiplication, and division.

  - View: Represents the UI components and is responsible for displaying data to the user and capturing user input. In this context, the MVPFragment class implements the Fragment UI components such as EditTexts for input, TextView for displaying results, and Buttons for triggering operations. The Fragment is also responsible for handling user interactions and displaying error messages.

  - Presenter: Acts as an intermediary between the Model and View. It contains the application logic for processing user inputs, interacting with the Model to perform calculations, and updating the View with the results. In this context, the CalculatorPresenter class orchestrates the communication between the MVPFragment and CalculatorModel, handling user input validation, triggering calculations, and updating the UI with the results or error messages.
- Model, View, ViewModel (MVVM)
  - Model: Same as in MVP, represents the data and business logic of the application. The CalculatorModel class encapsulates the functionality for performing arithmetic operations.

  - View: Represents the UI components and is responsible for displaying data to the user and capturing user input. In this context, the MVVMFragment class implements the Fragment UI components and observes changes in the ViewModel to update the UI accordingly.

  - ViewModel: Acts as a link between the View and the Model. It contains the presentation logic and maintains the state of the UI components. The CalculatorViewModel class receives user input from the View, interacts with the Model to perform calculations, and updates the View with the results. It also handles data persistence and UI state management. In this context, the ViewModel exposes LiveData objects to the View, which allows the View to observe changes in data and update the UI reactively.

Within this app is one main activity and the user works through each fragment using a navigation graph declared in res/navigation/nav_graph.xml.

 
