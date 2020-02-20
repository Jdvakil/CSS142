/**
 * Given the program named messy with poor convention, I made the following changes:
 * 1) public static final double distance = 6.21; was placed in the last line, I made it the first line after class declaration.
 * 2) Also, I made the main method the first method after class declaration. 
 * 3) "35 minutes and 30 seconds" comment was inside a redundant commenting style, "//" would have worked for single line comments. 
 * 4) I also added spaces in the final print statement for aesthetics. 
 * 5) I also added the first print statement after the calculations. 
 */
public class H1P3{
    public static final double distance = 6.21;
    public static void main(String[] args){
        double TIME; double PACE;
        TIME=35.5;//35 minutes and 30 seconds
        PACE = TIME/distance;
        System.out.println("This program calculates your pace given a time and distance traveled");
        System.out.println("Your pace is " + PACE+" miles per hour");
    }

    public static double MoneyOwed(double x){return x*1.6;}
}