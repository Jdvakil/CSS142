import java.util.Scanner;//did not import the scanner package.
public class Average 
{
    public static void main(String[] args) { 
        double n = 1.0;//loosy conversion, cant store double data type in int
        Scanner scanner = new Scanner(System.in);//system.in should be System.in
        System.out.println("This program calculates " +"the average (mean) of entered numbers.");
        double x;//assigned x to zero becuase we are adding and not multiplying 
        do {
            System.out.println("Enter another number " +"(or 0 to stop and show the average): ");
            x = scanner.nextDouble();//should be nextInt() because we are inputting int and not string
            x += x;
            n++;
        }while (x != 0);
        System.out.println("Your final average is: " + x / n);
    }
}