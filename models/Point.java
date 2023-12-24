package models;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double disTo(Point other) {
        double deltaX = other.x- this.x;
        double deltaY = other.y- this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
