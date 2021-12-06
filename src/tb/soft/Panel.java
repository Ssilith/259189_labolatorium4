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
    int mouseX = -1, mouseY = -1;

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
                cr.draw(g2d);
            }

            if(sq != null){
                g2d.setColor(Color.GREEN);
                sq.draw(g2d);
            }
        } finally {
            g2d.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(mouseX >= 0 && mouseX >= 0){
            if(e.getKeyCode() == KeyEvent.VK_K){
                sq = new Square(mouseX,mouseY);
                repaint();
            }
            if(e.getKeyCode() == KeyEvent.VK_O){
                cr = new Circle(mouseX,mouseY);
                repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e) {    }

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