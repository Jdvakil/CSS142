import java.util.Scanner;
/**
 * This class calcuates the vertex of a parabola whose equations coefficients would be entered by the user. After calculating the vertex, the program 
 * tells the user whether the vertex is a zero or a y-intercept. 
 * 
 * @author Jay Darshan Vakil 
 * @version 01/24/19
 */
public class H2P1
{
    /**
     * This is the main method, here the program prompts the user for input of the coeffecients of the quadratic equation and then passes them to the 
     * computeVertex method for calculations.
     */
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the a, b, and c of your quadratic function (separated by spaces):");
        double a = keyboard.nextDouble();// used double because coeffs can be decimals in some cases.
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        computeVertex(a,b,c);
    }
 
    /**
     * This method takes as arguments, a, b, c coeffecients of the equation of the parabola and then computes the vertex and determines if the vertex 
     * is a zero or a y-intercept. 
     * @param a The first coeffecient of the equation
     * @param b The second coeffecient of the equation
     * @param c The third coeffecient of the equation
     */
    public static void computeVertex(double a, double b, double c){
        double x = -b/(2*a);

        if (x==0){//This if statement is added to remove the minus sign when x == 0. 
            x = 0;
        }
        double y = (a*(x*x))+(b*x)+c;
        System.out.println("The vertex of the corresponding parabola is:\n(" +x+", "+y+")");
        if(y == 0){
            System.out.println("This vertex is also the zero of your parabola."); 
        }
        if(x==0){
            System.out.println("This vertex is also the y-intercept of your parabola");
        }
    }
}
