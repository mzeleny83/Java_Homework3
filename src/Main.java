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

                BookingManager bookingManager = new BookingManager();
                fillBookings(bookingManager);

                printBookings(bookingManager.getBookings());
                printFirstNRecreationalBookings(bookingManager.getBookings(), 8);
                printGuestStatistics(bookingManager.getBookings());

                System.out.println("Počet pracovních pobytů: " + bookingManager.getNumberOfWorkingBookings());
                System.out.println("Průměrný počet hostů na rezervaci: " + bookingManager.getAverageGuests());
        }

        private static void fillBookings(BookingManager bookingManager) {
                Guest karelDvorak1 = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
                Guest karelDvorak2 = new Guest("Karel", "Dvořák", LocalDate.of(1979, 1, 3));
                Guest karolinaTmava = new Guest("Karolína", "Tmavá", LocalDate.of(1985, 6, 25));

                Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
                Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
                Room room3 = new Room(3, 3, true, false, BigDecimal.valueOf(2400));

                bookingManager.addBooking(new Booking(karelDvorak1, room3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), true));
                bookingManager.addBooking(new Booking(karelDvorak2, room2, LocalDate.of(2023, 7, 18), LocalDate.of(2023, 7, 21), false));

                for (int i = 1; i <= 10; i++) {
                        LocalDate startDate = LocalDate.of(2023, 8, i * 2 - 1);
                        LocalDate endDate = startDate.plusDays(1);
                        bookingManager.addBooking(new Booking(karolinaTmava, room2, startDate, endDate, false));
                }

                bookingManager.addBooking(new Booking(karolinaTmava, room3, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 31), false));
        }

        private static void printBookings(List<Booking> bookings) {
                for (Booking booking : bookings) {
                        System.out.println(booking);
                }
        }

        private static void printFirstNRecreationalBookings(List<Booking> bookings, int n) {
                int count = 0;
                for (Booking booking : bookings) {
                        if (!booking.isWorkStay()) {
                                System.out.println(booking);
                                count++;
                                if (count >= n) break;
                        }
                }
        }

        private static void printGuestStatistics(List<Booking> bookings) {
                long oneGuest = bookings.stream().filter(b -> b.getNumberOfGuests() == 1).count();
                long twoGuests = bookings.stream().filter(b -> b.getNumberOfGuests() == 2).count();
                long moreThanTwoGuests = bookings.stream().filter(b -> b.getNumberOfGuests() > 2).count();

                System.out.println("Počet rezervací s jedním hostem: " + oneGuest);
                System.out.println("Počet rezervací se dvěma hosty: " + twoGuests);
                System.out.println("Počet rezervací s více než dvěma hosty: " + moreThanTwoGuests);
        }
}


                }








