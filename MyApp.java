import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("/Users/nurzhanov_004/IdeaProjects/assi1/src/source");
        Scanner sc= new Scanner(file);
        ArrayList<Point> pointArrayList =new ArrayList<>();
        while (sc.hasNextLine()){
            double x= sc.nextDouble();
            double y= sc.nextDouble();
            pointArrayList.add(new Point(x ,y));
        }
        Shape shape= new Shape(pointArrayList);

        System.out.println(shape.Per());
        System.out.println(shape.AverageSide());
        System.out.println(shape.LongSide());
    }
}