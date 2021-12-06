package tb.soft;

import java.awt.Graphics2D;

public class Circle extends Shape {
    private final int r = 40;

    public Circle(int x, int y){
        super(x,y);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.fillOval(x,y,r,r);
    }
}
