package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape(ArrayList<Point> points) {
        this.points = points;

    }


    public double Per() {
        double perimeter = 0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            perimeter += currentPoint.disTo(nextPoint);
        }

        return perimeter;
    }

    public double LongSide() {
        double longestSide = 0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            double currentDistance = currentPoint.disTo(nextPoint);
            if (currentDistance > longestSide) {
                longestSide = currentDistance;
            }
        }

        return longestSide;
    }

    public double AverageSide() {
        double totalLength = 0;
        int numSides = points.size();

        for (int i = 0; i < numSides; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numSides);

            totalLength += currentPoint.disTo(nextPoint);
        }

        return totalLength / numSides;
    }
}
