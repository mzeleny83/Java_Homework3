import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Booking {
    private List<Guest> guests;
    private int roomNumber;
    private LocalDate startDate;
    private LocalDate endaDate;
    private boolean isBusinessTrip;

}

public void getRoomNumber() {
    return roomNumber;
}

public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;

    public Booking(List<Guest> guests, int roomNumber, LocalDate startDate, LocalDate endaDate, boolean isBusinessTrip) {
        this.guests = guests;
        this.roomNumber = roomNumber;
        this.startDate = startDate;
        this.endaDate = endaDate;
        this.isBusinessTrip = isBusinessTrip;
    }


    public Room getRoom() {
        return room;
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

    public int getBookingLength(){
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.of(2023,6,1);
    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
    return (int) daysBetween;
    }

    public BigDecimal getPrice() {
        return room.getPrice().multiply(BigDecimal.valueOf(getBookingLength()));
    }

    public int getNumberOfGuests() {
        return guests.size();

    }}

