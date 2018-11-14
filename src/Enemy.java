
public class Enemy extends Entity {

    // instance data
    private Weapon weapon;


    // constructor
    public Enemy(int health, int healthMax, String name, String image, double locationX, double locationY, double direction, Weapon weapon) {
        super(health, healthMax, name, image, locationX, locationY, direction);
        this.weapon = weapon;
    }


    // implement abstract methods
    // talk is basic message to say
    public String talk() {
        return "You're toast, player!";
    }

}
