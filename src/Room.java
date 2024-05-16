import java.math.BigDecimal;

public class Room {
    private int number;
    private int beds;
    private BigDecimal price;
    private boolean hasBalcony;
    private boolean isSeaSide;

    public Room(int number, int beds, boolean hasBalcony, boolean isSeaSide, BigDecimal price) {
        this.number = number;
        this.beds = beds;
        this.hasBalcony = hasBalcony;
        this.isSeaSide = isSeaSide;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isSeaSide() {
        return isSeaSide;
    }

    public void setSeaSide(boolean seaSide) {
        isSeaSide = seaSide;
    }
}