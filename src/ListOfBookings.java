import java.util.List;

public class ListOfBookings{
    public ListOfBookings(List<Booking> bookingsList) {
        this.bookingsList = bookingsList;
    }

    private List<Booking> bookingsList;

    public Booking getBooking(int index) {
        if (index >= 0 && index < bookingsList.size()) {
            return bookingsList.get(index);
        } else {
            return null; // or throw an exception
        }
    }

    public List<Booking> getBookingsList() {
        return bookingsList;
    }

    public void setBookingsList(List<Booking> bookingsList) {
        this.bookingsList = bookingsList;
    }
}