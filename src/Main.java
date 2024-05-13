import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Guest {
    private String Name;
    private String Surname;
    private LocalDate Birthdate;
}

public class Room {
    private int number;
    private int beds;
    private LocalDate birthdate;
    private boolean hasBalcony;
    private boolean isSeaSide;
    private BigDecimal price;
}

public class Booking {
    private List<Guest> guests;
    private LocalDate startDate;
    private LocalDate endaDate;
    private boolean isBusinessTrip;
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
