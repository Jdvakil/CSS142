import java.util.*;
public class Lab5
{    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Welcome to Lab5!");
            System.out.println("Enter 1 to check how long it takes to get rich on a magic dollar coin.");
            System.out.println("Enter 2 to calculate e^x for a real x value.");
            System.out.println("Enter 3 to check palindrome."); 
            System.out.println("Enter 4 to re-print the menu.");
            System.out.println("Enter 0 to exit.");
            System.out.println("Enter your choice: "); 
            menu = s.nextInt();
            switch(menu){
                case 1:
                getRichQuick();
                break;

                case 2:
                System.out.println("Enter a number: ");
                double x = s.nextDouble();
                System.out.println("e^" + x + " = " + eTaylor(x));
                break;

                case 3:
                System.out.println("Enter a String: ");
                String str = s.nextLine();
                palindromeCheck();
                break;

                case 4: 
                System.out.println("\nWelcome to Lab5!");
                System.out.println("Enter 1 to check how long it takes to get rich on a magic dollar coin.");
                System.out.println("Enter 2 to calculate e^x for a real x value.");
                System.out.println("Enter 3 to check palindrome."); 
                System.out.println("Enter 4 to re-print the menu.");
                System.out.println("Enter 0 to exit.");
                System.out.println("Enter your choice: "); 
                break;

                case 0: 
                break;

                default:
                System.out.println("Not a valid choice, please try again");
                break;
            }
        }while(menu !=0);
        if (menu == 0)System.out.println("Goodbye!");
    }

    public static void getRichQuick() {
        double amount = 1;
        int day = 1;
        System.out.println("Day 1: $1");
        while (amount < 1000000) {
            day++;
            if(amount + 1 + (amount/2) < 1000000)
                System.out.printf("Day %d: $%.2f + ($1 + %.2f) = $%.2f\n", day, amount, amount/2, amount+(amount/2)+1);
            else
                System.out.printf("Day %d: $%.2f + ($1 + %.2f) >= $1000000\n", day, amount, amount/2);
            amount += (1 + (amount/2));
        }
    }

    public static double eTaylor (double x)
    {
        int count = 1;
        double total = 0;
        double nextTerm = 1;
        for (; nextTerm > 10e-16; count++) { 
            total += nextTerm; 
            nextTerm = getNext(nextTerm, x, count); 
        }
        return total;
    }

    public static double getNext(double thisTerm, double x, int count)
    {
        return (thisTerm * x) / count;
    }  

    public static void palindromeCheck() {
        String word = ""; //Stores words read from user input
        int count = 0; //keeps track of Palindrome words
        int total = 0; //Counts the total number of lines read from the given text file
        System.out.println("Enter some words separated by white space");
        Scanner s = new Scanner(System.in);
        int pal = 0;
        String line = s.nextLine().trim();
        s = new Scanner(line);
        while (s.hasNext()) {
            word = s.next(); // store each word in a String variable then operate
            if(isPalindrome(word)){
                System.out.println(word);
                pal++;
            }
            total++; //increment number of words as you read each one
        }
        System.out.println("There are "+pal+" palindromes out of "+total+" provided by the user");
    }

    public static boolean isPalindrome(String word){
        for(int i=0;i<=word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
