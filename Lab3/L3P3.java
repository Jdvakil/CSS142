public class L3P3{
    public static void main(String[] args){
        countGrains();
    }

    public static void countGrains()
    {
        long sum = 0;
        long eachDay = 1;

        for(int day=1; day<= 64; day++){
            sum = sum + eachDay;
            System.out.println( "Day "+ day +" and you got "+eachDay+" grain(s) of rice for a total of "+sum+" grain(s).");
            eachDay = eachDay + eachDay;
        }
    }
}
/*
 * Once the sum hits the largest possible number for a long data type, -1 returns.
 */