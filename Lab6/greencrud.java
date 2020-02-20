import java.io.*;
import java.util.*;
/**
 * This program implements fibboncis pattern to calculate the population growth in greencrud. the program inputs the required information from a file 
 * which gives the start population and the days.
 * @author Jay Darshan Vakil
 * @version 02/22/2019
 */
public class greencrud{
    public static void main(String[] args){
        try {
            FileInputStream fin = new FileInputStream("greencrud.txt");
            FileOutputStream fout = new FileOutputStream("curdout.txt");
            PrintWriter pw = new PrintWriter(fout);
            Scanner input = new Scanner(fin);
            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] list = line.split(" ");
                int start = Integer.parseInt(list[0]);
                int days = Integer.parseInt(list[1]);
                int n = days/5;
                int a = start;
                int b = start;
                int c = 0;
                if (n < 2)
                    c = a;
                for (int i = 2; i<= n; i++){
                    c = a + b;
                    b = c;
                    a = b;
                }
                pw.println(line + " " + c);
            }
            input.close();
            pw.close();

        }
        catch (Exception e){
            System.out.println("file doesnt exist");
        }  
    }
}