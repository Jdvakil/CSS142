/**
 * This class is to instantiate two coordinates on cartesian plane. 
 * @author Jay Darshan Vakil
 * @version 03/08/2019
 */
public class Point {

    // data fields

    private double x;

    private double y;

    /**
     * This is the constructor for this class, here the private data fields are initialized.
     */
    public Point(double x_coord, double y_coord) {

        this.x = x_coord;

        this.y = y_coord;

    }

    /**
     * This is the equals method, here two points are compared.
     */
    public boolean equals(Point anotherPoint) {

        if (x == anotherPoint.x && y == anotherPoint.y)

            return true;

        else

            return false;

    }

    /**
     * This is the lessThan method, this compares two different points.
     */
    public boolean lessThan(Point anotherPoint) {

        if ((y < anotherPoint.y) || (y == anotherPoint.y && x < anotherPoint.x))

            return true;

        else

            return false;

    }

    /**
     * This method calculates and returns the slope value.
     */
    public double slopeTo(Point anotherPoint) {

        double slope = 0;

        if (anotherPoint.x - x != 0)

            slope = (anotherPoint.y - y) / (anotherPoint.x - x);

        return slope;

    }

    // compareSlopes method

    int compareSlopes(Point anotherPoint) {

        Point origin = new Point(0, 0);

        if (slopeTo(origin) < anotherPoint.slopeTo(origin))

            return -1;

        else if (slopeTo(origin) == anotherPoint.slopeTo(origin))

            return 0;

        else // if(slopeTo(origin) > anotherPoint.slopeTo(origin))

            return 1;

    }

    // toString method

    public String toString() {

        return "(" + x + ", " + y + ")";

    }

}