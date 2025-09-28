import java.util.Random;

public class Character {
    Random rand = new Random();

    protected String name;
    protected int health;
    protected int attackPower;

    public Character() {

    }
    public boolean isAlive() {
        return health > 0;
    }
    public void attack(Character target){

        int damage = rand.nextInt(20);
        target.health -= damage;
        System.out.println("Damage taken: " + damage);
        System.out.println("Remaining health: " + target.health);
    }
    public void displayStatus(){
        System.out.println(name + " HP: " + health);
    }

}
