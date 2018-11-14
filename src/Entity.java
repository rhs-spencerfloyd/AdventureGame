
public abstract class Entity {

    // instance data
    private int health;
    private int healthMax;
    private String name;
    private double locationX;
    private double locationY;
    private double speed;
    private double direction;
    private String image;


    // constructor without location data
    public Entity(int health, int healthMax, String name, String image) {
        this.health = health;
        this.healthMax = healthMax;
        this.name = name;
        this.image = image;
    }

    // constructor with location data
    public Entity(int health, int healthMax, String name, String image, double locationX, double locationY, double direction) {
        this.health = health;
        this.healthMax = healthMax;
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
        this.image = image;
    }

    // abstract methods
    public abstract String talk();

}
