import java.util.ArrayList;

public class Player extends Entity {

    // instance data
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private int holding;


    // constructor
    public Player(int health, int healthMax, String name, String image, double locationX, double locationY, double direction) {
        super(health, healthMax, name, image, locationX, locationY, direction);
    }


    // implement abstract methods
    // talk gives a basic message
    // TODO: allow user input to talk
    public String talk() {
        return "Hello World!";
    }

}
