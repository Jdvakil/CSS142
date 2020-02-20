/**
 * This is the demo class, here all the methods from MDArray are tested with different arrays. 
 * @author Jay Darshan Vakil
 * @version 03/16/19
 */
public class MDArrayDemo {

    /**
     * This is the main method, this calls the two testing method for testing.
     */
    public static void main(String[] args) {
        test1();
        test2();
    }

    /**
     * This is the the first tester method.
     */
    private static void test1(){
        double[][] arr = {{1,2,3,4},{2,3,5,4},{2,3,5,3}};
        MDArray array = new MDArray(arr);
        System.out.println("Original array: ");
        System.out.println(array.toString());
        if(array.isRagged()){
            System.out.println("The array is ragged.");
        }
        if(!array.isRagged()){
            System.out.println("The array is not ragged");
        }
        System.out.println("The array has: "+array.getNumberOfRows()+" rows.");
        System.out.println("The array has: "+array.getNumberOfCols()+" columns.");
        System.out.println("The value at " + "(2,3) "+ " is: " +array.getValAt(2,3));
        System.out.println("Sorting by column: ");
        array.sort(true);
        System.out.println(array.toString());
        System.out.println("sorting by row: ");
        array.sort(false);
        System.out.println(array.toString());
        System.out.println("This is the hamming number by column: "+array.hamming(true));
        System.out.println("This is the hamming number by row: "+array.hamming(false));
        System.out.println("\nThis is the row with the max num: ");
        for(int i = 0; i<array.max().length; i++){
            System.out.print(array.max()[i] + " ");
        }
        System.out.println();
    }

    /**
     * This is the second tester method.
     */
    private static void test2(){
        double[][] arr = {{1,3,5,7},{3,3,4,2},{2,4,7,6}};
        MDArray array = new MDArray(arr);
        System.out.println("Original array: ");
        System.out.println(array.toString());
        if(array.isRagged()){
            System.out.println("The array is ragged.");
        }
        if(!array.isRagged()){
            System.out.println("The array is not ragged");
        }
        System.out.println("The array has: "+array.getNumberOfRows()+" rows.");
        System.out.println("The array has: "+array.getNumberOfCols()+" columns.");
        System.out.println("The value at " + "(2,3) "+ " is: " +array.getValAt(2,3));
        System.out.println("Sorting by column: ");
        array.sort(true);
        System.out.println(array.toString());
        System.out.println("sorting by row: ");
        array.sort(false);
        System.out.println(array.toString());
        System.out.println("This is the hamming number by column: "+array.hamming(true));
        System.out.println("This is the hamming number by row: "+array.hamming(false));
        System.out.println("\nThis is the row with the max num: ");
        for(int i = 0; i<array.max().length; i++){
            System.out.print(array.max()[i] + " ");
        }
        System.out.println();
    }
}