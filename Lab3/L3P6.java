import java.util.Scanner;
public class L3P6 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();
        boxMaker(x);
    }

    public static void boxMaker(int x){
        for(int i = 0;i<x;i++){
            for(int j = 0;j<x;j++){
                if(i == 0 || j == 0 || i==x-1 || j == x-1){
                    System.out.printf("*");
                }
                else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
