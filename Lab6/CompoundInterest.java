import java.util.Scanner;
/**
 * This program calculates the compound interest for the given principle, rate and the compounding factor. this program doesnt use any Math library 
 * functions.
 * @author Jay Darshan Vakil
 * @version 02/22/2019
 */
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principle amount, rate(divide by 100) and compounding factor (space seperated and in this order): ");
        double principle = input.nextDouble();
        double rate = input.nextDouble();
        //double years = input.nextDouble(); 
       double n = input.nextDouble();
        //Calling the compound function to calculate the total amount

        double amount = compound(principle,rate, n);

        //Printing out the results

        System.out.println("Compound Interest: "+(amount-principle));

        System.out.println("Total Amount: "+amount);

    }

    public static double compound(double principle, double rate, double n){

        double amount = principle;
        
        //using for loop instead of math.pow function to calculate

        for( int i =1; i<=n; i++){
            amount *= (1 + (rate/n));
        }

        return amount;

    }

}