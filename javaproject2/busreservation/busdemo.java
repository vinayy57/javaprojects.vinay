package busreservation;
import java.util.Scanner;
import java.util.ArrayList;

public class busdemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<dobooking> bookings = new ArrayList<dobooking>();

        buses.add(new Bus(1,true,2));
         buses.add(new Bus(2,true,20));
          buses.add(new Bus(3,false,35));
           buses.add(new Bus(4,true,55));

        int UserOpt = 1;
        Scanner scanner = new Scanner(System.in);
        for(Bus b:buses){
            b.displayBusInfo();}
        
        while(UserOpt==1) 
        {
            System.out.println("Enter 1 to book and 3 to exit");
            UserOpt=scanner.nextInt();
            if(UserOpt==1) {
                dobooking booking =new dobooking();
                 
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is Confirmed");}
                
                else
                
                  System.out.println("Sorry dear customer ,bus is full.Try another Bus or Date.");
                 }}}
                
    } 
            
          

        