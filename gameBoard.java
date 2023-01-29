import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.LinkedList;
import java.util.Scanner; // Import the Scanner class to read text files

// Board class
public class gameBoard {

    private LinkedList < Property > properties; //linked list used

    // Constructor
    public gameBoard() {
        properties = new LinkedList < > ();
        loadProperties();
    }

    public void loadProperties() {
        try {
            Scanner reader = new Scanner(new File("boardSquares.txt"));
            while (reader.hasNextLine()) {
                String[] data = reader.nextLine().split(",");
                String name = data[0];
                int price = Integer.parseInt(data[1]);
                int rent = Integer.parseInt(data[2]);
                int location = Integer.parseInt(data[3]);
                String details = (data[4]);
                properties.add(new Property(name, price, rent, location, details));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. File with name 'boardSquares' does not exist");
        }
    }

    // Getter
    public LinkedList < Property > getProperties() {
        return properties;
    }

    public int indexOf(String name) {
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Sorting Algorithm
    public void sortProperties() {
        for (int i = 0; i < properties.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < properties.size(); j++) {
                if (properties.get(j).compareTo(properties.get(min)) < 0) {
                    min = j;
                }
            }
            Property temp = properties.get(min);
            properties.set(min, properties.get(i));
            properties.set(i, temp);
        }

    }

    // Method to print board
    public void printBoard() {
        System.out.println("\n---------------");
        System.out.println("     BOARD       ");
        System.out.println("---------------\n\n");
        String[][] board = new String[][] {
            {
                "□",
                "□",
                "□",
                "□",
                "□",
                "□"
            }, {
                "□",
                " ",
                " ",
                " ",
                " ",
                "□"
            }, {
                "□",
                " ",
                " ",
                " ",
                " ",
                "□"
            }, {
                "□",
                " ",
                " ",
                " ",
                " ",
                "□"
            }, {
                "□",
                " ",
                " ",
                " ",
                " ",
                "□"
            }, {
                "□",
                "□",
                "□",
                "□",
                "□",
                "□"
            }
        };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");


        sortProperties();


    }

    // Method to search for a property
    public Property searchProperty(String name) {
        for (Property property: properties) {
            if (name.equalsIgnoreCase(property.getName())) {
                return property;
            }
        }
        return null;
    }
}