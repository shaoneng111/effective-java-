package ch2.entry8;

import java.awt.*;

public class ColorPointGetClass extends Point{
    private final Color color;

    public ColorPointGetClass(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        Point point = (Point) obj;
        return false;
    }
}
