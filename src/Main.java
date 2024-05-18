import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

                LocalDate birthdate1=LocalDate.of(1993,03,13);
                LocalDate birthdate2=LocalDate.of(1995,05,05);

                Guest guest1 = new Guest("Jana", "Malíková", birthdate1);
                Guest guest2 = new Guest("Jan", "Dvořáček", birthdate2);

                List<Guest> guests = new ArrayList<>();
                guests.add(guest1);
                guests.add(guest2);

                for (Guest guest : guests) {
                        System.out.println(guest);
                }

                        Room room1 = new Room(1, 1, true, true,  BigDecimal.valueOf(1000));
                        Room room2 = new Room(2, 1, true, true,  BigDecimal.valueOf(1000));
                        Room room3 = new Room(3, 3, true, false, BigDecimal.valueOf(2400));

                        Booking booking1 = new Booking(List.of(guest1), 1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), true);
                        Booking booking2 = new Booking(List.of(guest1, guest2), 3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), true);
                        //Booking booking2 = new Booking(new ArrayList<>(List.of(guest1, guest2)), room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), true);

                        System.out.println(booking1);
                        System.out.println(booking2);

                }
        }







