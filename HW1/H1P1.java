import java.util.*;
public class H1P1{
    public static void main(String[] arg)
    {
        double Bmi = BmiOne(50, 1.6);
        BmiTwo(63, 110);bmiPrint(Bmi);
        Bmi = BmiOne(60, 1.8);
        BmiTwo(73,120);bmiPrint(Bmi);
    }

    public static double BmiOne(double mass, double height)
    {
        double BMI = mass/(height*height);
        return BMI;
    }

    public static double BmiTwo(double height, double weight)
    {
        double Bmi2 = (weight/(height*height))*703;
        return Bmi2;
    }

    public static void bmiPrint(double bmi)
    {
        System.out.print("Your BMI value is: ");
        System.out.printf("%.2f", bmi);
        System.out.println(". \nPlease refer to the table below to check the category for this value:\n");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|BMI                    |Category               |");
        System.out.println("|-----------------------|-----------------------|");
        System.out.println("|From 16.0 to 18.5      |Underweight            |");
        System.out.println("|-----------------------|-----------------------|");
        System.out.println("|From 18.5 to 25.0      |Normal                 |");
        System.out.println("|-----------------------|-----------------------|");
        System.out.println("|From 25.0 to 30        |Overweight             |");
        System.out.println("|-----------------------|-----------------------|");
        System.out.println("|From 30 to 35.0        |Moderately Obese       |");
        System.out.println("|-----------------------|-----------------------|");
        System.out.println("|From 35 to 40.0        |Severely Obese         |");
        System.out.println("|-----------------------|-----------------------|");
    }
}
