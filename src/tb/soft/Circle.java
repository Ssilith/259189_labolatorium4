package tb.soft;

import java.awt.*;

public class Circle { //dziedziczenie po klasie abstrakcyjnej
    private final int r = 40;
    private final int x;
    private final int y;

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected void drawCircle(Graphics2D g2d){
        g2d.fillOval(x,y,r,r);
    }
}
