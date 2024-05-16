import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

Guest guest1=new Guest("Jana","Malíková",1993,03,13);
Guest guest2=new Guest("Jan","Dvořáček",1995,05,05);

List<Guest> guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);

        for (Guest guest : guests){
        System.out.println(guest);

}
}
}

Room room1=new Room(1,1,1000,true,true);
Room room2=new Room(2,1,1000,true,true);
Room room3=new Room(3,3,2400,false,true);

Booking booking1=new Booking(<guest1>,1,19,7,2021,26,7,2021,true)
Booking booking1=new Booking(<guest1,guest2>,3,1,9,2021,14,9,2021,true)

System.out.println(booking1);
System.out.println(booking2);








