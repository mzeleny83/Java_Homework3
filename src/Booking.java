import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Booking {
    private List<Guest> guests;
    private int roomNumber;
    private LocalDate fromDate;
    private LocalDate toDate;
    private boolean businessTrip;
    private BigDecimal roomPrice;
    private boolean seaView;

    public Booking(List<Guest> guests, int roomNumber, LocalDate fromDate, LocalDate toDate, boolean businessTrip, BigDecimal roomPrice, boolean seaView) {
        this.guests = guests;
        this.roomNumber = roomNumber;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.businessTrip = businessTrip;
        this.roomPrice = roomPrice;
        this.seaView = seaView;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public boolean isBusinessTrip() {
        return businessTrip;
    }

    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    public boolean hasSeaView() {
        return seaView;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "guests=" + guests +
                ", roomNumber=" + roomNumber +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", businessTrip=" + businessTrip +
                ", roomPrice=" + roomPrice +
                ", seaView=" + seaView +
                '}';
    }
}
