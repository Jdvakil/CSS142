import java.util.Scanner;
public class partThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        // iterating thorugh a-z to find the indexes using the indexOf method
        for(char c='a';c<='z';c++){
            System.out.println(c+" = "+str.indexOf(c));
        }
    }
}