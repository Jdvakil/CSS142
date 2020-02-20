import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Advice {

    public static void main(String[] args) throws Exception {
        //Reading from file
        Scanner in = new Scanner(new File("advice.txt"));
        String adviceInFile = in.nextLine();
        in.close();

        //Reading from Console, and Sysout
        Scanner cin = new Scanner(System.in);
        System.out.println("Our Advice: "+adviceInFile);
        System.out.println("What's your advice: ");
        String yourAdvice = cin.nextLine();
        cin.close();

        //Writing to files
        //Overwrite
        FileWriter writer = new FileWriter("advice.txt");
        writer.write(yourAdvice);
        writer.close();

        //Append
        writer = new FileWriter("adviceLog.txt",true);
        writer.write(yourAdvice+"\n");
        writer.close();

    }

}