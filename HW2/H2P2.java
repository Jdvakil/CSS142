import java.util.Scanner;
/**
 * This program calculates the total salary for the employees at the company. 
 * 
 * @author Jay Darshan Vakil
 * @version 01/24/19
 */
public class H2P2{
    public static final double MINWAGE = 5.25;//the minimum wage

    /**
     * This is the main method of the program, here the program prompts the user for the first and last name, base pay and total hours then passes them 
     * to the next calculating method. 
     * Also, it collects the result from salaryTotal method and prints an appropriate statement. 
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first name and last name (space separated): ");
        String firstName = input.next();
        String lastName = input.next();
        System.out.println("Please enter the base pay: ");
        double basePay = input.nextDouble();
        System.out.println("Please enter the total number of hours worked in the week: ");
        double hours = input.nextDouble();

        double totalPay = salaryTotal(basePay, hours);
        if(totalPay == -1){
            System.out.println("The base salary you entered does not comply with state law.");
        }
        if(totalPay == -2){
            System.out.println("The number of hours your entered does not comply with company policy.");
        }
        if(totalPay >= 0){
            System.out.println("The total pay for " + firstName + " " + lastName + " is " + totalPay + " dollars.");
        }
    }

    /**
     * This methdod calculates the total salary of the employee given that the base pay and hours are under the state and company policies.
     * @param basePay This is the base pay entered by the user.
     * @param hours The total number of hours per week worked.
     * @return totalPay the total salary to be paid, if base pay is lower than minimum wage -1 is returned, if hours are more than 60 -2 is returned.
     */
    public static double salaryTotal(double basePay, double hours){
        double totalPay = 0.0;
        if(basePay < MINWAGE){
            totalPay = -1;
        }
        if(hours > 60){
            totalPay = -2;
        }
        if(basePay > MINWAGE && hours <= 60){
            totalPay = basePay*hours;
        }
        return totalPay;
    }
}