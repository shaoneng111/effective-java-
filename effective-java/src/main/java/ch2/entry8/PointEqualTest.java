package ch2.entry8;

import java.awt.*;

public class PointEqualTest {
    public static void main(String[] args) {
        int x = 10; int y = 10;
        Color color = Color.red;
        ColorPoint colorPoint = new ColorPoint(x, y , color);

        Point point = new Point(x, y);

        boolean bool = colorPoint.equals(point);
        System.out.println(bool);

        ColorPoint colorPoint1 = new ColorPoint(x, y, Color.black);

        boolean bool1 = point.equals(colorPoint1);
        System.out.println(bool1);

    }
}
