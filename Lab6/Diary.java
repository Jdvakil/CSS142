import java.io.*;
import java.util.*;
public class Diary

{
    public static void main(String[] args)throws Exception

    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the date as three integers separated by spaces:");

        int m= scan.nextInt();

        int dt= scan.nextInt();

        int y= scan.nextInt();

        String newdate=m+"/"+dt+"/"+y;

        //BufferedWriter TO WRITE TO FILE

        //OPEN THE FILE IN APPEND TO STORE INFORMATION AT THE END OF THE FILE

        BufferedWriter bufw = new BufferedWriter(new FileWriter("diaryLog.txt",true));

        bufw.write("Date: "+newdate);

        bufw.newLine();

        System.out.println("enter as many lines of prose you wish (for their to-do's list or diary entry)");

        System.out.println("enter quit to stop ");

        String wishLine;  

        while(!(wishLine= scan.nextLine()).equalsIgnoreCase("quit"))

        {

            bufw.write(wishLine); //write diary entry to file

            bufw.newLine();

        }

        bufw.close(); //once writing over close the file
    }
}
