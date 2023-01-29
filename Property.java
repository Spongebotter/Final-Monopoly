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
    // Pre: Requires no parameters
    // Post: Returns properties name
    // Desc: Returns properties name
    public String getName() {
        return name;
    }

    // Pre: Requires no parameters
    // Post: Returns properties price
    // Desc: Returns properties price
    public int getPrice() {
        return price;
    }

    // Pre: Requires no parameters
    // Post: Returns properties rent
    // Desc: Returns properties rent
    public int getRent() {
        return rent;
    }

    // Pre: Requires no parameters
    // Post: Returns properties owner
    // Desc: Returns properties owner
    public Player getOwner() {
        return owner;
    }

    // Pre: Requires the player newOwner parameters
    // Post: Returns nothing to main
    // Desc: Sets the owner of the property
    public void setOwner(Player newOwner) {
        owner = newOwner;
    }

    // Pre: Requires parameters for other property 
    // Post: Returns a check for the property required for the sort
    // Desc: Returns a check for the property required for the sort
    public int compareTo(Property other) {
        if (location < other.location) {
            return -1;
        }
        if (location > other.location) {
            return 1;
        }
        return 0;

    }

    // Pre: Requires the player newLocation parameters
    // Post: Returns nothing to main
    // Desc: Sets the location of the property
    public void setLocation(int newLocation) {
        location = newLocation;
    }


    // Pre: Requires no parameters
    // Post: Returns property location
    // Desc: Returns property location
    public int getLocation() {
        return location;
    }

    // Pre: Requires the player newDetails parameters
    // Post: Returns nothing to main
    // Desc: Sets the details of the property 
    public void setDetails(String newDetails) {
        details = newDetails;
    }

    // Pre: Requires no parameters
    // Post: Returns property details
    // Desc: Returns property details
    public String getDetails() {
        return details;
    }
}