import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Guest {
    private String name;
    private String surname;
    private LocalDate birthdate;


    public Guest(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }
}

public class Room {
    private int number;
    private int beds;
    private LocalDate birthdate;
    private boolean hasBalcony;
    private boolean isSeaSide;
    private BigDecimal price;

    public Room(int number, int beds, LocalDate birthdate, boolean hasBalcony, boolean isSeaSide, BigDecimal price) {
        this.number = number;
        this.beds = beds;
        this.birthdate = birthdate;
        this.hasBalcony = hasBalcony;
        this.isSeaSide = isSeaSide;
        this.price = price;
    }


}

public class Booking {
    private List<Guest> guests;
    private LocalDate startDate;
    private LocalDate endaDate;
    private boolean isBusinessTrip;

    public Booking(List<Guest> guests, LocalDate startDate, LocalDate endaDate, boolean isBusinessTrip) {
        this.guests = guests;
        this.startDate = startDate;
        this.endaDate = endaDate;
        this.isBusinessTrip = isBusinessTrip;
    }


}

public class ListOfBookings{
    private List<Booking> bookingsList;

    public Booking getBooking(int index) {
        if (index >= 0 && index < bookingsList.size()) {
            return bookingsList.get(index);
        } else {
            return null; // or throw an exception
        }
    }

    }
