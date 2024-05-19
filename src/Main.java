import java.math.BigDecimal;  // Importuje třídu BigDecimal z balíku java.math pro přesné aritmetické operace.
import java.time.LocalDate;  // Importuje třídu LocalDate z balíku java.time pro práci s daty.
import java.util.ArrayList;  // Importuje třídu ArrayList z balíku java.util pro dynamické pole.
import java.util.List;  // Importuje třídu List z balíku java.util pro práci s kolekcemi.

public class Main {  // Definice veřejné třídy Main.
        public static void main(String[] args) {  // Hlavní metoda, která se spustí při startu programu.

                LocalDate birthdate1 = LocalDate.of(1993, 3, 13);  // Vytvoří objekt LocalDate s datem 13. března 1993.
                LocalDate birthdate2 = LocalDate.of(1995, 5, 5);  // Vytvoří objekt LocalDate s datem 5. května 1995.

                Guest guest1 = new Guest("Jana", "Malíková", birthdate1);  // Vytvoří objekt Guest s jménem Jana Malíková a datem narození birthdate1.
                Guest guest2 = new Guest("Jan", "Dvořáček", birthdate2);  // Vytvoří objekt Guest s jménem Jan Dvořáček a datem narození birthdate2.

                List<Guest> guests = new ArrayList<>();  // Vytvoří prázdný seznam hostů.
                guests.add(guest1);  // Přidá guest1 do seznamu guests.
                guests.add(guest2);  // Přidá guest2 do seznamu guests.

                for (Guest guest : guests) {  // Pro každý objekt guest v seznamu guests.
                        System.out.println(guest);  // Vytiskne informace o guest do konzole.
                }

                Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));  // Vytvoří objekt Room s číslem 1, jednou postelí, balkonem, výhledem na moře a cenou 1000.
                Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000));  // Vytvoří objekt Room s číslem 2, jednou postelí, balkonem, výhledem na moře a cenou 1000.
                Room room3 = new Room(3, 3, true, false, BigDecimal.valueOf(2400));  // Vytvoří objekt Room s číslem 3, třemi postelemi, balkonem, bez výhledu na moře a cenou 2400.

                Booking booking1 = new Booking(List.of(guest1), 1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), true);  // Vytvoří objekt Booking pro guest1, pokoj číslo 1, od 19. července 2021 do 26. července 2021, jako pracovní cestu.
                Booking booking2 = new Booking(List.of(guest1, guest2), 3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), true);  // Vytvoří objekt Booking pro guest1 a guest2, pokoj číslo 3, od 1. září 2021 do 14. září 2021, jako pracovní cestu.

                System.out.println(booking1);  // Vytiskne informace o booking1 do konzole.
                System.out.println(booking2);  // Vytiskne informace o booking2 do konzole.

                BookingManager bookingManager = new BookingManager();  // Vytvoří objekt BookingManager.
                fillBookings(bookingManager);  // Zavolá metodu fillBookings a předá jí bookingManager.

                printBookings(bookingManager.getBookings());  // Zavolá metodu printBookings a předá jí seznam rezervací z bookingManager.
                printFirstNRecreationalBookings(bookingManager.getBookings(), 8);  // Zavolá metodu printFirstNRecreationalBookings a předá jí seznam rezervací z bookingManager a číslo 8.
                printGuestStatistics(bookingManager.getBookings());  // Zavolá metodu printGuestStatistics a předá jí seznam rezervací z bookingManager.

                System.out.println("Počet pracovních pobytů: " + bookingManager.getNumberOfWorkingBookings());  // Vytiskne počet pracovních pobytů.
                System.out.println("Průměrný počet hostů na rezervaci: " + bookingManager.getAverageGuests());  // Vytiskne průměrný počet hostů na rezervaci.
        }

        private static void printGuestStatistics(List<Booking> bookings) {
        }

        private static void fillBookings(BookingManager bookingManager) {  // Soukromá metoda fillBookings, která přijímá objekt BookingManager.
                Guest karelDvorak1 = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));  // Vytvoří objekt Guest s jménem Karel Dvořák a datem narození 15. května 1990.
                Guest karelDvorak2 = new Guest("Karel", "Dvořák", LocalDate.of(1979, 1, 3));  // Vytvoří objekt Guest s jménem Karel Dvořák a datem narození 3. ledna 1979.
                Guest karolinaTmava = new Guest("Karolína", "Tmavá", LocalDate.of(1985, 6, 25));  // Vytvoří objekt Guest s jménem Karolína Tmavá a datem narození 25. června 1985.

                Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));  // Vytvoří objekt Room s číslem 1, jednou postelí, balkonem, výhledem na moře a cenou 1000.
                Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000));  // Vytvoří objekt Room s číslem 2, jednou postelí, balkonem, výhledem na moře a cenou 1000.
                Room room3 = new Room(3, 3, true, false, BigDecimal.valueOf(2400));  // Vytvoří objekt Room s číslem 3, třemi postelemi, balkonem, bez výhledu na moře a cenou 2400.

                bookingManager.addBooking(new Booking(List.of(karelDvorak1), 3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), true));  // Přidá novou rezervaci do bookingManager.
                bookingManager.addBooking(new Booking(List.of(karelDvorak2), 2, LocalDate.of(2023, 7, 18), LocalDate.of(2023, 7, 21), false));  // Přidá novou rezervaci do bookingManager.

                for (int i = 1; i <= 10; i++) {  // Smyčka od 1 do 10.
                        LocalDate startDate = LocalDate.of(2023, 8, i * 2 - 1);  // Vytvoří datum začátku rezervace.
                        LocalDate endDate = startDate.plusDays(1);  // Vytvoří datum konce rezervace.
                        bookingManager.addBooking(new Booking(List.of(karolinaTmava), 2, startDate, endDate, false));  // Přidá novou rezervaci do bookingManager.
                }

                bookingManager.addBooking(new Booking(List.of(karolinaTmava), 3, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 31), false));  // Přidá novou rezervaci do bookingManager.
        }

        private static void printBookings(List<Booking> bookings) {  // Soukromá metoda printBookings, která přijímá seznam rezervací.
                for (Booking booking : bookings) {  // Pro každý objekt booking v seznamu bookings.
                        System.out.println(booking);  // Vytiskne informace o booking do konzole.
                }
        }

        private static void printFirstNRecreationalBookings(List<Booking> bookings, int n) {  // Soukromá metoda printFirstNRecreationalBookings, která přijímá seznam rezervací a číslo n.
                int count = 0;  // Inicializace počítadla.
                for (Booking booking : bookings) {  // Pro každý objekt booking v seznamu bookings.
                        if (!booking.isBusinessTrip()) {  // Pokud rezervace není pracovní cestou.
                                System.out.println(booking);  // Vytiskne informace o booking do konzole.
                                count++;  // Zvýší počítadlo.
                                if (count >= n) break;  //
                        }}}}