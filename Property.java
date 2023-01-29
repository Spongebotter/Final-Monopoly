 // Property class

public class Property {

    private String name;
    private int price;
    private int rent;
    private int location;
    private String details;
    private Player owner;

    // Constructor
    public Property(String newName, int newPrice, int newRent, int newLocation, String newDetails) {
        name = newName;
        price = newPrice;
        rent = newRent;
        owner = null;
        location = newLocation;
        details = newDetails;
    }

    //Accessor to general information "toString" method.
    public String toString() {
        String info = "\nName: " + name + "\nOwner: " + owner + "\nRent: " + rent + "\nLocation: " + location + "\nDetails: " + details;
        return info;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player newOwner) {
        owner = newOwner;
    }

    public int compareTo(Property other) {
        if (location < other.location) {
            return -1;
        }
        if (location > other.location) {
            return 1;
        }
        return 0;

    }

    public void setLocation(int newLocation) {
        location = newLocation;
    }

    public int getLocation() {
        return location;
    }

    public void setDetails(String newDetails) {
        details = newDetails;
    }

    public String getDetails() {
        return details;
    }
}
