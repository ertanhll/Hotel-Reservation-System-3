
import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        
	        String[] hotelName= new String [20];
	        Room room = new Room();
	        Reservation[] reservations = new Reservation[20];
	       
	        int reservationCount = 0;
	        int option;

	        while (true) {
	            System.out.println("1. Create new Reservation");
	            System.out.println("2. Display all Reservations");
	            System.out.println("3. Display the total number of reservations");
	            System.out.println("0. Exit");
	            System.out.println("Enter your option: ");
	          
	            option = input.nextInt();        
	            System.out.println("\n");

	            switch (option) {
	            
	                case 1:
	                    System.out.print("Hotel Name: ");
	                    input.nextLine();
	                    hotelName[reservationCount] = input.nextLine();
	                   
	                   
	                    int roomTypeNum = 0;
	                    
	                    while(roomTypeNum == 0 ) {
	                    	 System.out.print("Room Type: ");                        
	                    String roomTypeOption = input.nextLine();
	                  
	                    if(roomTypeOption.equals("Single")) 
	                    	roomTypeNum += 1;
	                    else if(roomTypeOption.equals("Double"))
	                    	roomTypeNum += 2;
	                    else if(roomTypeOption.equals("Club"))
	                        roomTypeNum += 3;
	                    else if(roomTypeOption.equals("Family"))
	                        roomTypeNum += 4;
	                    else if(roomTypeOption.equals("Family with View"))
	                        roomTypeNum += 5;
	                   	else if(roomTypeOption.equals("Suite"))
	                        roomTypeNum += 6;
	                   	else
	                   		System.out.println("Invalid Input");
	                    }
	                    
	                    int invalidMonth = 0;
	                    String reservationMonth = null;
	                    
	                    while(invalidMonth == 0) {                    
	                    System.out.print("Reservation Month: ");
	                    reservationMonth = input.nextLine();
	                    if (reservationMonth.equals("January") || reservationMonth.equals("February") || reservationMonth.equals("March")
	                    		|| reservationMonth.equals("April") || reservationMonth.equals("May") || reservationMonth.equals("June")
	                    		|| reservationMonth.equals("July") || reservationMonth.equals("August") || reservationMonth.equals("September")
	                    		|| reservationMonth.equals("October") || reservationMonth.equals("November") || reservationMonth.equals("December")) {
	                    	invalidMonth++;                    	
	                    }else
	                    	System.out.println("Invalid input");                    	
	                    }
	                    int reservationStart = 0;
	                    while (reservationStart <= 0 || reservationStart > 30) {
	                        System.out.print("Reservation Start (1-30): ");
	                        reservationStart = input.nextInt();
	                        if (reservationStart <= 0 || reservationStart > 30) {
	                            System.out.println("Invalid start day. Please enter a day between 1-30.");
	                        }
	                    }
	                  
	                    int reservationEnd = 0;
	                    while (reservationEnd <= 0 || reservationEnd > 30 || reservationEnd < reservationStart) {
	                        System.out.print("Reservation End (" + reservationStart + "-30): ");
	                        reservationEnd = input.nextInt();
	                        if (reservationEnd <= 0 || reservationEnd > 30) {
	                            System.out.println("Invalid end day. Please enter a day between " + reservationStart + "-30.");
	                        } else if (reservationEnd < reservationStart) {
	                            System.out.println("Invalid end day. End day must be greater than or equal to the start day.");
	                        }
	                    }
	                    Room selectedRoom = room.getRooms()[roomTypeNum-1];
	                 
	                    System.out.println("Daily Cost: "+ room.getRooms()[roomTypeNum-1].getCost());
	                    System.out.println("Has Bath: "+ room.getRooms()[roomTypeNum-1].hasBath());
	                    System.out.println("Room Size: "+ room.getRooms()[roomTypeNum-1].getRoomSize());
	                    System.out.println("\n");
	                  
	                    Reservation newReservation = new Reservation(selectedRoom, reservationMonth, reservationStart, reservationEnd);
	                    reservations[reservationCount] = newReservation;
	                    reservationCount++;
	                    System.out.println("Reservation created! \n\n");
	                    break;
	              
	               case 2:
	                    for (int i = 0; i < reservationCount; i++) {
	                        System.out.println("Reservation for a " + reservations[i].getRoom().getType() + " room in " + hotelName[i] + " starts on " +
	                                reservations[i].getReservationMonth() + " " + reservations[i].getReservationStart() + " and ends on " +
	                                reservations[i].getReservationMonth() + " " + reservations[i].getReservationEnd() + ".");
	                        System.out.println("Reservation has a total cost of $" + reservations[i].calculateTotalPrice());
	                        System.out.println("\n");
	                    }
	                    break;

	                case 3:
	                    System.out.println(reservationCount + (reservationCount < 2 ? " reservation " : " reservations ")+"created so far.");
	                    System.out.println("\n");
	                    break;

	                case 0:
	                    System.out.println("Goodbye");
	                    input.close();
	                    System.exit(-1);
	                    break;

	                default:
	                    System.out.println("Invalid input");
	                    System.out.println("\n");
	                    break;
	            }   
	        }     	
	  }   
}
