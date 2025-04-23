public class Adress {
    private String street;
    private String city;
    private String postalCode;
    private String houseNumber;

    public Adress(String street, String city, String postalCode, String houseNumber) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
    }

    public String toString() {
        return street + ", " + houseNumber + ", " + postalCode + " " + city;
    }
}