import java.io.*;
/**
 * This is the PointArray tester, this imports from the pointArray method and then tests all the methods and objects out.
 * @author Jay Darshan Vakil
 * @version 03/09/19
 */
public class PointArrayTester {

    /**
     * This is the main method
     */
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream(new File("pointsFile.txt"));

        double arr1[] = { 2.4, 3.5, 4.7, 1.0, 6.4, 11.01 };

        double arr2[] = { 4.2, 5.3, 7.4, 0.1, 4.6, 1.11 };

        double arr3[] = { 2.4, 3.5, 4.7, 1.0, 6.4, 11.01 };

        PointArray pa1 = new PointArray(file);

        PointArray pa2 = new PointArray(arr1);

        PointArray pa3 = new PointArray(arr2);

        PointArray pa4 = new PointArray(arr3);

        System.out.println("Points Array #1: " + pa1);

        System.out.println("Points Array #2: " + pa2);

        System.out.println("Points Array #3: " + pa3);

        System.out.println("Points Array #4: " + pa4);

        System.out.println("\nPoints Array #1 is collinear.(T/F): " + pa1.contains3collinear());

        System.out.println("Points Array #2 is collinear.(T/F): " + pa2.contains3collinear());

        System.out.println("Points Array #3 is collinear.(T/F): " + pa3.contains3collinear());

        System.out.println("Points Array #4 is collinear.(T/F): " + pa4.contains3collinear());

        System.out.println("\nPoints Array #1 is equal to Points Array #3.(T/F): " + pa1.equals(pa3));

        System.out.println("Points Array #2 is equal to Points Array #4.(T/F): " + pa2.equals(pa4));

        pa1.sort();

        pa2.sort();

        pa3.sort();

        pa4.sort();

        System.out.println("\nSorted Points Array #1: " + pa1);

        System.out.println("Sorted Points Array #2: " + pa2);

        System.out.println("Sorted Points Array #3: " + pa3);

        System.out.println("Sorted Points Array #4: " + pa4);

        file.close();

    }

}