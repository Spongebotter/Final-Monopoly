public class Go extends Property {

    private int cost;

    // Pre: Requires for name, price, rent, location and details parameters
    // Post: Returns nothing to main
    // Desc: Constructor which initializes variables to the object in main
    public Go() {
        super("Go", 0, 0, 1, "");
        cost = 0;
    }

    // Pre: Requires the cost of property
    // Post: Returns nothing to main
    // Desc: Sets the cost of the property
    public void setCost(int newCost) {
        cost = newCost;
    }

    // Pre: Requires no parameters
    // Post: Returns cost of properties
    // Desc: Returns cost of properties
    public int getCost() {
        return cost;
    }



}