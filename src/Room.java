import java.math.BigDecimal;
import java.time.LocalDate;

public class Room {
    private int number;
    private int beds;
    private LocalDate birthdate;

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setSeaSide(boolean seaSide) {
        isSeaSide = seaSide;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private boolean hasBalcony;
    private boolean isSeaSide;

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isSeaSide() {
        return isSeaSide;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getBeds() {
        return beds;
    }

    public int getNumber() {
        return number;
    }

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