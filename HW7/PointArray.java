import java.io.*;
/**
 * This is the pointArray class, here the objects are entered in an array.
 * @author Jay Darshan Vakil
 * @version 03/09/19
 */
public class PointArray {

    // data field

    private Point points[];

    // constructor 1

    public PointArray(double arr[]) {

        points = new Point[arr.length / 2];

        int i = 0;

        int j = 0;

        while (i < arr.length) {

            points[j] = new Point(arr[i], arr[i + 1]);

            i += 2;

            j++;

        }

    }

    // constructor 2

    public PointArray(FileInputStream fis) throws IOException {

        byte b1[] = new byte[fis.available()];

        fis.read(b1, 0, b1.length);

        char ch = (char) b1[0];

        int size = Integer.parseInt("" + ch);

        String lines[] = new String[size];

        for (int i = 0; i < lines.length; i++)

            lines[i] = "";

        int k = 0;

        int count = 0;

        for (int i = 3; i < b1.length; i++) {

            if (b1[i] == '\n') {

                count++;

                if (count == 1)

                    k++;

            } else {

                lines[k] += (char) b1[i];

                count = 0;

            }

        }

        points = new Point[size];

        int j = 0;

        for (int i = 0; i < lines.length; i++) {

            String line = lines[i];

            String tokens[] = line.split(" ");

            double x_coord = Double.parseDouble(tokens[0]);

            double y_coord = Double.parseDouble(tokens[1]);

            points[j] = new Point(x_coord, y_coord);

            j++;

        }

        fis.close();

    }

    // contains3collinear method

    public boolean contains3collinear() {

        if (points[0].slopeTo(points[1]) == points[1].slopeTo(points[2]))

            return true;

        else

            return false;

    }

    // sort method

    public void sort() {

        for (int i = 0; i < points.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < points.length; j++) {

                if (points[j].lessThan(points[minIndex]))

                    minIndex = j;

            }

            if (minIndex != i) {

                Point temp = points[i];

                points[i] = points[minIndex];

                points[minIndex] = temp;

            }

        }

    }

    // equals method

    public boolean equals(PointArray anotherPointArray) {

        if (points.length != anotherPointArray.points.length)

            return false;

        boolean founds[] = new boolean[points.length];

        for (int i = 0; i < points.length; i++) {

            for (int j = 0; j < anotherPointArray.points.length; j++) {

                if (points[i].equals(anotherPointArray.points[j]) && founds[j] == false) {

                    founds[j] = true;

                    break;

                }

            }

        }

        for (int i = 0; i < founds.length; i++) {

            if (founds[i] == false)

                return false;

        }

        return true;

    }

    // toString method

    public String toString() {

        String result = "{";

        for (int i = 0; i < points.length; i++) {

            if (i != points.length - 1)

                result += points[i] + ", ";

            else

                result += points[i];

        }

        result += "}";

        return result;

    }

}