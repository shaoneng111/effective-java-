package ch2.entry8;

import java.awt.*;

public class ColorPointComponet {
    private final Point point;
    private final Color color;

    public ColorPointComponet(int x, int y, Color color) {
        if (color == null)
            throw new NullPointerException();

        point = new Point(x, y);
        this.color = color;

    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPointComponet)) {
            return false;
        }

        ColorPointComponet colorPoint = (ColorPointComponet) obj;
        return colorPoint.point.equals(point) && colorPoint.color.equals(color);
    }
}
