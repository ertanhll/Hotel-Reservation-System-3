Below, you can find the description of your third assignment, which also
includes the expected output of this assignment in the Application Walkthrough
section.
This week, you are expected to improve your existing Hotel Reservation System
by introducing six new room types. You should create a Room class and its
objects where it will hold room’s type (in a String), dailyCost (in an int),
roomSize (in an int) and hasBath (in Boolean). Furthermore, the dailyCost data
should be hidden and it should be only accessible via two public setter
(setCost()) and getter (getCost()) methods. You should initialize each Room
instance with the following type and specifications.
Room Type dailyCost roomSize hasBath
Single $100 15 False
Double $180 30 False
Club $250 45 True
Family $400 50 False
Family with View $450 50 True
Suite $650 80 True
Additionally, you are required to modify the variables of your Reservation class
to store the following information in a structure as shown below.
Variable Name Type
room Room
reservationMonth String
reservationStart int
reservationEnd int
dailyCost int
The hotel owners highlighted that June, July and August are their peak times
and stated that they would like to charge double for these months. Accordingly,
you are required to check the reservation month before calculating total price
and pass three variables to an overloaded calculateTotalPrice(), which includes
an integer multiplier variable.
All the reservations should be stored in a Reservation array and parsed as it
was implemented in the second assignment. Furthermore, all access to
instance variables of Reservation class should be made through getter and
setter methods.
Application Walkthrough
1. Create new Reservation
2. Display all Reservations
3. Display the total number of reservations
0. Exit
1
Hotel Name: Hilton
Room Type: Single
Reservation Month: June
Reservation Start: 7
Reservation End: 10
Daily Cost: 100
Has Bath: False
Room Size: 15
Reservation created!
1. Create new Reservation
2. Display all Reservations
3. Display the total number of reservations
0. Exit
1
Hotel Name: Ramada
Room Type: Club
Reservation Month: April
Reservation Start: 6
Reservation End: 16
Daily Cost: 250
Has Bath: True
Room Size: 45
Reservation created!
1. Create new Reservation
2. Display all Reservations
3. Display the total number of reservations
0. Exit
2
Reservation for a Single room in Hilton starts on June 7 and ends on June 10.
Reservation has a total cost of $600.
Reservation for a Club room in Ramada starts on April 6 and ends on April 16.
Reservation has a total cost of $2500.
1. Create new Reservation
2. Display all Reservations
3. Display the total number of reservations
0. Exit
3
2 reservations created so far.
1. Create new Reservation
2. Display all Reservations
3. Display the total number of reservations
0. Exit
0

