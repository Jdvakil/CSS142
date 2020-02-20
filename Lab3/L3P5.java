public class L3P5{
    public static void main(String[] args){
        StraightLine(10);
    }

    public static void StraightLine(int size){
        for(int j = 1; j<=size; j++){
            for(int i = 1; i <=size; i++){
                System.out.print("*");
            }
            System.out.println();
        }     
    }
}