public class Lab8{
    public static void main(String[] args){
        //for exercises 1, 2
        double[] oddSet = {0.5, 3.1415, 7.6, 42, 799.4};
        double[] evenSet = {0.5, 2.2, 3.1415, 7.6, 42, 799.4};
        double[] notSorted = {3.4, 0.01, 8.7, 2.3};
        System.out.println("Exercise 1: ");
        System.out.println(median(oddSet));
        System.out.println(median(evenSet));
        System.out.println();
        System.out.println("Exercise 2: ");
        System.out.println(isSorted(evenSet));
        System.out.println(isSorted(notSorted));
        System.out.println();
        //for exercises 3, 4, 5
        int[] a1 = {3, 8, 5, 6, 5, 8, 9, 2};
        int[] a2 = {5, 15, 4, 6, 7, 3, 9, 11, 9, 3, 12, 13, 14, 9, 5, 3, 13};
        int[] common = new int[a1.length];
        System.out.println("Exercise 3: ");
        findCommon(a1,a2,common);

        System.out.println("Exercise 4: ");
        rotateRight(a1);
        System.out.println();

        System.out.println("Exercise 5: ");
        for(int i = 0; i < a2.length; i++){
            System.out.print(a2[i] + " ");
        }
        System.out.println("Number 3 comes: ");
        count(a2, 3);

    }    

    public static double median(double list[])

    {

        int size=list.length;

        if(size%2!=0)

            return list[size/2];

        else

            return(list[size/2-1]+list[size/2])/2.0;

    }

    public static boolean isSorted(double list[])

    {

        for(int i=0;i<list.length-1;i++)

        {

            if(list[i]>list[i+1])

                return false;

        }

        return true;

    }

    public static void findCommon(int a1[],int a2[],int common[])
    {
        int c=0;
        for(int i=0;i<a1.length;i++)
        {
            boolean isFilled=false;
            for(int j=0;j<c;j++)
            {
                if(a1[i]==common[j])
                {
                    isFilled=true;
                    break;
                }
            }
            if(isFilled)
            {
                for(int k=0;k<a2.length;k++)
                {
                    if(a1[i]==a2[i])
                    {
                        common[c]=a1[i];
                        c++;
                        break;
                    }
                }
            }
        }
        while(c<common.length)
        {
            common[c]=0;
           c++;
        }
        System.out.print("For array 1: [");
        for(int i = 0; i< a1.length-1; i++){
            System.out.print(a1[i] + ", ");
        }
        System.out.println(a1[a1.length-1] + "]");
        System.out.println("and array 2: [ ");
        for(int i = 0; i < a2.length-1; i++){
            System.out.print(a2[i] + ", ");
        } 
        System.out.println(a2[a2.length-1] + "]");
        System.out.print("The commons are: [ ");
        for(int i = 0; i < common.length; i++){
            System.out.print(common[i] + ", ");
        }
        System.out.println(common[common.length-1] + "]");        
    }

    public static void rotateRight(int list[])
    {
        int temp=list[list.length-1];
        for(int i=list.length-1;i>0;i--)
        {
            list[i]=list[i-1];
        }
        list[0]=temp;
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }

    public static int count(int list[],int n)
    {
        int ncount=0;
        for(int i=0;i<list.length;i++)
        {
            if(list[i]==n)
                ncount++;
        }
        return ncount;
    }
    
    public static int[] stretch(int list[])

    {

        int stretchedList[]=new int[list.length*2];

        int k=0;

        for(int i=0;i<list.length;i++)

        {

            int n=list[i];

            if(n%2==0)

            {

                stretchedList[k]=n/2+1;

                stretchedList[k+1]=n/2;

            }

            k+=2;

        }

        return stretchedList;

    }
}
