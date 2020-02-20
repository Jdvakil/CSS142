
//necessary imports for file i/o
import java.io.FileInputStream; //"turns" the file into a read stream
import java.util.Scanner; //reads from stream
//import java.io.File;

import java.io.FileOutputStream; //"turns" the file into a write stream
import java.io.PrintWriter; //writes to the stream

import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!

/**
 * Write a description of class Stats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stats {
    public static void main(String[] args) {
        // Scanner and PrintWrite must be declared outside the try block
        // otherwise their scope will be limited to within the block  
        Scanner input = null; 
        PrintWriter output = null;
        try {
            input= new Scanner(new FileInputStream("fileIn.txt"));//Your turn!
            output=new PrintWriter(new FileOutputStream("fileOut.txt"));//initialize ithe variables nput and output here
        } catch (FileNotFoundException e) {
            System.out.println("Problem opening file.");
            // System.exit(0);//Your turn!
            //If an exception is caught, we need to handle it.
            //Print a nice message telling the user the file was not found and
            //exit the program normally, i.e. use the exit method.
        }

        //Declare some useful variables here - the ones you will need to
        //modify in the loop below to calculate the required statistics
        //i.e. max, min, sum, count, etc.
        //Hint: initialize max to be -infinity and min to be +infinity
        double sum=0;
        double max=0;
        double min=0;
        double previousValue=0;
        double negNum=0;
        double btw0and100=0;
        double numAbove=0;

        
        //This is the loop where you read from the file and calculate some stats as you go. 
        while (input.hasNextDouble()) {
            //Your turn!
            double value=input.nextDouble();
            sum=value+sum;

            if(value<0){
                negNum++;

            }else if(value>=0 && value<100){
                btw0and100++;
            }else if(value>=100){
                numAbove++;
            }
            if(value>previousValue && value>max){
                max=value;
            }else if (value <previousValue&& value<min){
                min = value;
            }
        }
        double numTotal= negNum+btw0and100+numAbove;
        double Average= sum/numTotal;
        //output.println("There are "+negNum+" negative numbers, "+btw0and100+" numbers between o(inclusive) and 100(exclusive) and "+geq+" numbers that are greater than or equal t0 100./n"); //Let's print the results:
        output.println("Statistics for the numbers in fileIn.txt:");
        output.printf("Average= %.5f %n", Average);
        output.printf("Maximum= %.5f %n", max);
        output.printf("Minimum= %.5f %n", min);
        output.printf("Negative numbers= %.0f %n",negNum);
        output.printf("Numbers between 0 and 100= %.0f %n",btw0and100);
        output.printf("Numbers above or equal to 100= %.0f %n", numAbove);

        
        input.close();
        output.close();
    }
}


