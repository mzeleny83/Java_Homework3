import java.time.LocalDate;
import java.util.List;

public class Booking {
    private List<Guest> guests;
    private int roomNumber;
    private LocalDate startDate;
    private LocalDate endaDate;
    private boolean isBusinessTrip;


    public int getRoomNumber() {
        return roomNumber;
    }


    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public void setEndaDate(LocalDate endaDate) {
        this.endaDate = endaDate;
    }

    public void setBusinessTrip(boolean businessTrip) {
        isBusinessTrip = businessTrip;
    }


    public LocalDate getEndaDate() {
        return endaDate;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public boolean isBusinessTrip() {
        return isBusinessTrip;
    }



    public Booking(List<Guest> guests, LocalDate startDate, LocalDate endaDate, boolean isBusinessTrip) {
        this.guests = guests;
        this.startDate = startDate;
        this.endaDate = endaDate;
        this.isBusinessTrip = isBusinessTrip;
    }


}