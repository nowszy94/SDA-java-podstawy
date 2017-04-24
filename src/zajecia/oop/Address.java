package zajecia.oop;

/**
 * Created by Szymon on 2017-04-24.
 */
public class Address {
    public String city;
    public String street;
    public int flatNumber;
    public String postalCode;
    public String land;

    public void display() {
        System.out.println(postalCode + " " + city + ", " + land);
        System.out.println(street + " " + flatNumber);
    }
}
