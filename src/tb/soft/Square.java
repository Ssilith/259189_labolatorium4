package tb.soft;

import java.awt.Graphics2D;

public class Square extends Shape {
    private final int a = 30;
    private final int b = 30;

    public Square(int x, int y) {
        super(x,y);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.fillRect(x,y,a,b);
    }
}
