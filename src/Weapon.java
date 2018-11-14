
public class Weapon extends Item {

    // instance data
    private double damage;
    private double cooldown;
    private Item ammo;


    // constructor
    public Weapon(String name, String image, double damage, double cooldown, Item ammo) {
        super(name, image);
        this.damage = damage;
        this.cooldown = cooldown;
        this.ammo = ammo;
    }


}
