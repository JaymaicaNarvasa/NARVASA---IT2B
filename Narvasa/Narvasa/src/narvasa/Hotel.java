package narvasa;

import java.util.Scanner;

public class Hotel {
    Scanner sc = new Scanner(System.in);
    Hotels[] hl= new Hotels[50];
    Set<Integer> idSet = new HashSet<>();
           
        int num;
    public void addHotel(){
             while(true){
                System.out.printf("Enter no. of Bookings: ");
                if (sc.hasNextInt()){
                     num = sc.nextInt();
                     break;
                }else if (num > 50){
                    System.out.println("You can only booked 50 rooms");
                }else{
                      System.out.println(" INVALID INPUT");
                      System.out.println("Please try again: ");
                      sc.next();
                    }
             }
        
    for(int j = 0; j < num; j++){
        System.out.println("Details of booking no. " + (j + 1) + ":");
        int id;
             while(true){
             System.out.printf("ID:");
             if(sc.hasNextInt()){
             id = sc.nextInt();
             
                 if(idSet.contains(id)){
                     System.out.println("This ID already exist. Please enter a unique ID.");
                 }else{
                     idSet.add(id);
                     break;         
                 }   
                 
             }else{
                 System.out.println("Enter only number please.");
                 sc.next();
             }
             }
        
        System.out.println("Name: ");
        String name = sc.next();
        
        System.out.println("Room Type: ");
        String rtype = sc.next();
        
        System.out.println("Check-in-Date: ");
        int cin = sc.nextInt();
        
        System.out.println("Check-out-Date: ");
        int cout = sc.nextInt();
        
        System.out.println("Payment Status: ");
        String pstats = sc.next();
        
        System.out.println("Status: ");
        String stats = sc.next();
        
        hl[j] = new Hotels();
        hl[j].getHotels(name, rtype, rtype, rtype, id, cout, cin);
    }
        System.out.printf("|  %-10s  |  %-10s  |  %-10s  |  %-10s  |  %-10s  |  %-10s  |  %-10s  |", "Booking ID", "Name", "Room Type", "Check-in-Date", "Check-out-Date", "Payment Status", "Status");
        
        for(int j = 0; j < num; j++){
            hl[j].viewHotel();
        }
}
}
