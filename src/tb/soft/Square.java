package tb.soft;

import java.awt.*;

public class Square {
    private final int a = 30;
    private final int b = 30;
    private final int x;
    private final int y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected void drawSquare(Graphics2D g2d){
        g2d.fillRect(x,y,a,b);
    }
}
