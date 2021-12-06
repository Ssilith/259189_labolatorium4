package tb.soft;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

public class Panel extends JPanel implements MouseInputListener, KeyListener {

    Circle cr = null;
    Square sq = null;
    int o_key = 0, k_key = 0;

    public Panel() {
        setSize(380,380);
        setBackground(Color.WHITE);
        setLayout(null);
        setFocusable(true);
        requestFocusInWindow();
        addMouseListener(this);
        addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        try {
            if(cr != null){
                g2d.setColor(Color.BLUE);
                cr.drawCircle(g2d);
            }

            if(sq != null){
                g2d.setColor(Color.GREEN);
                sq.drawSquare(g2d);
            }
        } finally {
            g2d.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_K)
            k_key = 1;
        if(e.getKeyCode() == KeyEvent.VK_O)
            o_key = 1;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        o_key = 0;
        k_key = 0;
    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(o_key == 1) {
            cr = new Circle(e.getX(),e.getY());
            repaint();
        }
        if(k_key == 1){
            sq = new Square(e.getX(),e.getY());
            repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {    }

    @Override
    public void mouseExited(MouseEvent e) {    }

    @Override
    public void mouseDragged(MouseEvent e) {    }

    @Override
    public void mouseMoved(MouseEvent e) {    }
}