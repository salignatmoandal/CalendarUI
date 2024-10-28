abstract class Character implements Movable {
    // Attribute
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected String RPGclass;

    // Constructor
    public Character(String name, String RPGclass) {
        this.name = name;
        this.RPGclass = RPGclass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;

    }

    // Movable method
    public void moveRight(String name) {
        System.out.println(name + ": moves right");
    }

    public void moveLeft(String name) {
        System.out.println(name + ": moves left");
    }

    public void moveForward(String name) {
        System.out.println(name + ": moves forward");
    }

    public void moveBack(String name) {
        System.out.println(name + ": moves back");
    }

    // Method Unseathe
    public final void unseathe(String name) {
        System.out.println(name + ": unsheathes his weapon.");

    }

}