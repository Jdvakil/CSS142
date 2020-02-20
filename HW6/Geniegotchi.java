import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * This call sets the name, endurance and happiness level. it also gets the info using get and set methods.
 * @author Jay Darshan Vakil
 * @version 02/28/19
 */
public class Geniegotchi {
    // attributes
    private String name = "Bob";

    private int endurance = 4;

    private int happiness = 3;

    /**
     * sets the name
     * @param name the name of the genie
     */
    public void setName(String name) {

        this.name = name;

        System.out.println("Name has been set to " + name);

    }

    /**
     * This method gets the information about the genie
     */
    public void genieInfo() {

        System.out.println("Name: " + name);

        System.out.println("Endurance: " + endurance);

        System.out.println("Happiness: " + happiness);

    }

    /**
     * This gets the endurance of the genie
     * @return endurance the endurance of the genie
     */
    public int getEndurance() {
        return endurance;
    }

    /**
     * This gets the happiness of the genie
     * @return endurance the happiness of the genie
     */
    public int getHappiness() {
        return happiness;
    }

    /**
     * This method feeds the genie, if the endurance is below ten the genie eats else it doesnt.
     */
    public void feed() {
        if (endurance < 10) {

            // increasing endurance by 1

            endurance += 1;

            System.out.println("feeding...");

        } else {

            System.out.println("No thanks...");

        }
    }

    /**
     * This method plays the genie, if the happiness is below ten the genie eats else it doesnt. 
     */
    public void play() {

        if (happiness < 10) {

            System.out.println("Playing..");

            // increasing happiness by 1

            happiness++;

            // decreasing endurance by 2

            endurance -= 2;

        } else {

            System.out.println("No thanks...");

        }

    }

    /**
     * This method asks the genie for the fortune by generating a random number. 
     */
    public void askFortune() {
        if (happiness > 6 && endurance > 5) {

            // generating random number

            int randNum = (int) (Math.random() * 100) + 1;

            // displaying randNum'th line from fortunes.txt file

            displayFortuneLine(randNum);

        } else if (happiness > 6 && endurance <= 5) {

            System.out.println("Low endurance");

        } else if (happiness <= 6 && endurance > 5) {

            System.out.println("Low happiness");

        } else if (happiness <= 6 && endurance <= 5) {

            System.out.println("Feed and play with Geniegotchi");

        }

        // decreasing endurance and happiness by 1

        endurance--;

        happiness--;

    }


    /**
     * This method reads lines from the fortune.txt file. 
     */
    private void displayFortuneLine(int line) {

        try {

            //opening fortunes.txt file for reading

            Scanner scanner = new Scanner(new File("fortunes.txt"));

            String fortuneText = "";

            //finding line'th line

            for (int i = 0; i < line; i++) {

                fortuneText = scanner.nextLine();

            }

            //displaying line

            System.out.println(fortuneText);

        } catch (FileNotFoundException e) {

            //file not found

            System.out.println(e.getMessage());

        } catch (Exception e) {

            //not enough lines on file

            System.out.println(line + " is not a valid line number in fortunes.txt");

        }
    }
}