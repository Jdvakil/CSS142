public class H1P2{
    public static final int dollar = 100;
    public static final int quarter = 25;
    public static final int dime = 10;
    public static final int nickel = 5;
    public static void main(String[] args){
        change(273);//2,2,2,0,3
        change(382);//3,3,0,1,2
        change(3273);//32,3,3,0,2
        inCents(3,2,4,2,4);//404
        inCents(5,2,7,3,6);//641
        inCents(60,2,4,2,3);//6103
    }

    public static void change(int cents){
        int d = cents/dollar;
        int centsRem = cents%dollar;
        int q = centsRem/quarter;
        centsRem = centsRem%quarter;
        int di = centsRem/dime;
        centsRem = centsRem%10;
        int n = centsRem/nickel;
        centsRem = centsRem%nickel;
        int p = centsRem;
        System.out.println(cents + " cents corresponds to:\n" + d + " dollars, " + q + " quarters, " + di + " dimes, " + n + " nickels, and " + p + " cents.\n");
    }

    public static void inCents(int d, int q, int di, int n, int p){
        int cents = (d*dollar)+(q*quarter)+(di*dime)+(n*nickel)+p;
        System.out.println(d + " dollars, " + q + " quarters, " + di + " dimes, " + n + " nickels,and " + p + " cents correspond to:\n" + cents + " cents.\n"); 
    }
}