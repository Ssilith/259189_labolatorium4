package tb.soft;

import java.awt.Graphics2D;

public abstract class Shape {
    protected int x, y;

    public Shape(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public abstract void draw(Graphics2D g2d);

}
