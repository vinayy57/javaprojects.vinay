package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class dobooking {
    String passengername;
    int busNo; 
    Date date;

    
     dobooking(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your Name:     ");
        passengername = scanner.next();
        System.out.println("Enter bus no:  ");
        busNo=scanner.nextInt();
        System.out.println("Enter the Date <dd-mm-yyyy>:  ");
        String dateInput =scanner.next();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    public boolean isAvailable(ArrayList<dobooking>bookings, ArrayList<Bus>buses)
         {
            int capacity=0;
            for(Bus bus:buses){
                if(bus.getBusNo()==busNo)
                capacity=bus.getCapacity();
            }
            int booked =0;
            for(dobooking b: bookings){
                if(b.busNo==busNo && b.date.equals(date)){
                    booked++;
                }
                 
            }
    return booked<capacity?true:false;
           

}}
