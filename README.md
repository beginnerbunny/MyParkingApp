# MyParkingApp
This is a simple parking app for booking where people can easily book their parking slots before reaching the university and also view which slots are empty and which are booked

Screenshots of the app are uploaded along with the code 

Requirements:
Git
Android Studio 2.2 
SDK version 27
Firebase 16.1.0

Installation:
Run git clone on git bash 
or
Download zip from the browser

Go to Android Studio, open -> Settings -> Version Control -> Git
Define the git executable path for the system if not already defined.

Copy link of project from browser
VCS -> Checkout from Version Control -> Git

Provide your github username and password to successfully login into your github account.

Run the project on emulator or mobile device.

Project:
The app depicts a parking lot for a college. The goal of this app is to see if there are any vacant spots in the parking lot to park the student's vehicle. If there are any, where in the parking lot is the spot. 
There is also a dashboard to see the summary of the number of vehicles parked, number of slots empty, number of slots kept for faculty and slots assigned for handicapped. 

The app is connected to a real-time database using Firebase.

The app on opening presents a dashboard where the user can see the total summary of slots in the parking lot. 
The options given are :
OPEN
CLOSED
FACULTY
HANDICAPPED

On clicking each of the button, ParkingActivity opens which shows the parking lot with slots which are color-coded. 

A student can book a slot by clicking on a parking slot. If the slot is empty, the user can book it. Once a slot is booked, it will turn to red and a toast message will appear saying "Slot booked successfully". If the slot is already booked, a toast message saying "Slot is already booked" will appear. 
