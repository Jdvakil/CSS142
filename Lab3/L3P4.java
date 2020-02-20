import java.util.Scanner;
public class L3P4{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        //Part 1
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int res = powerOfTwo(num);
        if (res==0){
            System.out.println(num+" is not a power of 2.");
        }
        if(res!=0){
            System.out.println(num+" is 2 to the power of "+res);
        }
        //Part 2
        System.out.println("Enter the number : ");
        int num2 = input.nextInt();

        int reverse = numBackward(num2);
        if (num2 == reverse) {
            System.out.println("backward: "+reverse+" ,palindrome!");
        }
        else
        {
            System.out.println("backward: "+reverse+" ,not palindrome!");
        }
    }

    static int powerOfTwo (int x)
    {
        int count=0;
        while (((x % 2) == 0) && x > 1) /* While x is even and > 1 */
        {
            x /= 2;
            count++;
        }
        return count;
    }

    public static int numBackward(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return reverse;
    }
}