package tb.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MainWindow extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow frame = new MainWindow();
                    frame.setResizable(false);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public MainWindow() throws HeadlessException {
        this("Labolatorium nr 4");
    }

    public MainWindow(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380, 380);

        JPanel contentPane = new JPanel();

        contentPane.setBounds(0,0,360,360);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton run = new JButton("Run");
        JButton reset = new JButton("Reset");

        run.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(e.getX() > 0) { //strefa bezbieczna z lewej strony
                    Random random = new Random();
                    run.setLocation(random.nextInt(250), random.nextInt(250));
                }
            }
        });
        run.setBounds(70, 140, 90, 23);
        contentPane.add(run);

        reset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                run.setLocation(70,140);
            }
        });
        reset.setBounds(200, 140, 90, 23);
        contentPane.add(reset);
    }
}
