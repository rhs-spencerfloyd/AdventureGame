
public class Consumable extends Item {

    // instance data
    private int usesLeft;


    // constructor
    public Consumable(String name, String image, int usesLeft) {
        super(name, image);
        this.usesLeft = usesLeft;
    }

}
