import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

                Guest guest1 = new Guest("Jana", "Malíková", 1993, 03, 13);
                Guest guest2 = new Guest("Jan", "Dvořáček", 1995, 05, 05);

                List<Guest> guests = new ArrayList<>();
                guests.add(guest1);
                guests.add(guest2);

                for (Guest guest : guests) {
                        System.out.println(guest);


                        Room room1 = new Room(1, 1, true, true, BigDecimal 1000);
                        Room room2 = new Room(2, 1, true, true, BigDecimal 1000);
                        Room room3 = new Room(3, 3, true, false, BigDecimal 2400);

                        Booking booking1 = new Booking(guest1, room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), true);
                        Booking booking2 = new Booking(List.of(guest1, guest2), room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), true);

                        System.out.println(booking1);
                        System.out.println(booking2);

                }
        }
}






