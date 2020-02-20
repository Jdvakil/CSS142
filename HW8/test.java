public class test{
    public static void main(String[] args){
        int[][] a = {{1,7,3},{4,5,9},{6,8,9}};
        //int[][] t = new int[3][3];
        int temp = 0;
        for(int i = 0; i <3; i++){
            for(int j= 1; j<3; j++){
                if(a[i][j-1]>a[i][j]){
                    temp = a[i][j-1];
                    a[i][j-1] = a[i][j];
                    a[i][j] = temp;
                }
            }
        }
        for(int i = 0; i <3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}