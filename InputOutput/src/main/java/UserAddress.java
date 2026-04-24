import java.io.Serializable;

public class UserAddress {
    private String streetName;
    private int numberOfHouse;

    public UserAddress(String streetName, int numberOfHouse) {
        this.streetName = streetName;
        this.numberOfHouse = numberOfHouse;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public String toString() {
        return "UserAdress{" +
                "streetName='" + streetName + '\'' +
                ", numberOfHouse=" + numberOfHouse +
                '}';
    }
}
