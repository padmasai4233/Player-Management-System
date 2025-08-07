import controller.PlayerController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerController controller = new PlayerController();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Player Management System ---");
            System.out.println("1. Add Player");
            System.out.println("2. Remove Player");
            System.out.println("3. View All Players");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter player role: ");
                    String role = sc.nextLine();
                    controller.addPlayer(name, role);
                    break;
                case 2:
                    System.out.print("Enter player name to remove: ");
                    String nameToRemove = sc.nextLine();
                    controller.removePlayer(nameToRemove);
                    break;
                case 3:
                    controller.displayAllPlayers();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
