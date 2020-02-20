import java.util.Scanner;
/**
 * This is the main class for the genie app, here the user interface works and gives the user 7 choices an user can play with the genie.
 * @author Jay Darshan Vakil
 * @version 02/28/19
 */
public class GeniegotchiDemo {
    /**
     * The main method which calls the other method and allows the user to select their choice.
     */
    public static void main(String[] args) {

        //scanner to read user input

        Scanner scanner = new Scanner(System.in);

        //creating genie

        Geniegotchi genie = new Geniegotchi();

        //printing menu

        printMenu();

        int choice = -1;

        //looping until choice becomes 0

        while (choice != 0) {

            //prompting,getting choice

            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            //handling choice

            switch (choice) {

                case 1:

                System.out.print("Enter new name for Geniegotchi: ");

                String name = scanner.nextLine();

                genie.setName(name);

                break;

                case 2:

                genie.genieInfo();

                break;

                case 3:

                genie.feed();

                break;

                case 4:

                genie.play();

                break;

                case 5:

                genie.askFortune();

                break;

                case 6:

                printMenu();

                break;

                case 0:

                break;

                default:

                System.out.println("Invalid choice");

                break;

            }
        }
    }

    /**
     * This method prints the menu
     */
    public static void printMenu() {

        System.out.println("GenieGotchi welcomes you!");

        System.out.println("0. Quit");

        System.out.println("1. Rename your Geniegotchi");

        System.out.println("2. Get current stats on Geniegotchi");

        System.out.println("3. Feed your Geniegotchi");

        System.out.println("4. Play with your Geniegotchi");

        System.out.println("5. Ask your fortune!");

        System.out.println("6. Print Menu");

    }

}