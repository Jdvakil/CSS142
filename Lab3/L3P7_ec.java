public class L3P7_ec{
    public static void main(String args[]){
        inverseTriangle(6);
        diagonal(3);
    }

    public static void inverseTriangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i>j){ // staring spaces
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }
    }

    public static void diagonal(int n){
        int i,j,k;
        int s=0,m=n*2 - 1;
        for(k=0;k<2;k++){
            for(i=0;i<n;i++){
                for(j=0;j<s;j++){
                    // starting spaces for a line
                    System.out.print(" ");
                }
                System.out.print("*");
                for(j=0;j<m;j++){
                    // middle spaces for a line
                    System.out.print(" ");
                }
                System.out.print("*");
                if(k==0){
                    // First half
                    s = s+1;
                    m = m-2;
                }
                else{
                    // second half
                    s = s-1;
                    m = m+2;
                }
                System.out.println();
            }
            if(k==0){
                for(i=0;i<n;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                s = n-1;
                m = 1;

            }
        }
    }
}