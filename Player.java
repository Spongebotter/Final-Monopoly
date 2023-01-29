// Player class
public class Player {

    private String name;
    private int balance;
    private String position;
    private gameBoard board;

    // Constructor
    // Pre: Requires for name and board parameters
    // Post: Returns nothing to main
    // Desc: Constructor which initializes variables to the object in game class
    public Player(String newName, gameBoard newBoard) {
        name = newName;
        balance = 1500;
        position = "Go";
        board = newBoard;
    }

    // Getters and Setters
    // Pre: Requires no parameters
    // Post: Returns players name
    // Desc: Returns players name
    public String getName() {
        return name;
    }

    // Pre: Requires no parameters
    // Post: Returns players name
    // Desc: Returns players name
    public int getBalance() {
        return balance;
    }

    // Pre: Requires no parameters
    // Post: Returns players position
    // Desc: Returns players position
    public String getPosition() {
        return position;
    }

    // Pre: Requires the player newBalance parameters
    // Post: Returns nothing to main
    // Desc: Sets the amount of the player newBalance
    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    // Pre: Requires the player rent
    // Post: Returns nothing to main
    // Desc: Sets the amount of the player balance plus rent received 
    public void addRent(int newRent) {
        balance += newRent;
    }

    // Pre: Requires the players position
    // Post: Returns nothing to main
    // Desc: Sets the players position on the board
    public void setPosition(String newPosition) {
        position = newPosition;
    }

    // Other Methods
    public void move(int spaces) {
        int currentIndex = board.indexOf(position);
        int newIndex = (currentIndex + spaces) % board.getProperties().size();
        position = board.getProperties().get(newIndex).getName();
    }

    public void buyProperty(Property p) {
        p.setOwner(this);
        balance -= p.getPrice();
    }

    public void payRent(Player owner, int rent) {
        balance -= rent;
        owner.addRent(rent);
    }

}