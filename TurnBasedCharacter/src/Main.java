import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String enemyName = "Goblin";
        int enemyHealth = 50;
        int initialHealth = 100;

        System.out.println("Welcome to our turn based game");
        System.out.println("--------------------------------");
        System.out.println(" ");
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        Player player = new Player(name, initialHealth);
        Enemy enemy = new Enemy(enemyName, enemyHealth);

        player.displayStatus();
        enemy.displayStatus();

        player.attack(enemy);


        scanner.close();
    }
}
