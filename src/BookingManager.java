import java.util.List;

public class BookingManager {

    public static void main(String[] args) {
        private List<Booking> bookings;

 public BookingManager() {
            this.bookings = new ArrayList<>();
 }

        public void addBooking(Booking newBooking) {
            bookings.add(newBooking);
        }

        public Booking getBooking(int index){
            return bookings.get(index);
        }

        public List<Booking> getBookings() {
            return bookings;
        }
                public void clearBookings() {
            bookings.clear();
        }
                    public long getNumberOfWorkingBookings() {
            return bookings.stream().filter(Booking::isWorkStay).count();
        }

        public long getNumberOfWorkingBookings() {
            return bookings.stream().filter(Booking::isWorkStay).count();
 }

        public double getAverageGuests() {
            return bookings.stream().mapToInt(Booking::getNumberOfGuests).average().orElse(0);
        }

        public void getAverageGuests{

        }
}}
