package ink.hkc.Swing.jPanel;

import javax.swing.*;
import java.awt.*;

public class JPanelTest {
    public static void main(String[] args) {
        new MyJPanel().init();
    }
}

class MyJPanel extends JFrame {
    public void init() {
        setBounds(200, 200, 300, 300);
        Container container = getContentPane();
        container.setLayout(new GridLayout(2, 2, 10, 10));

        JPanel panel1 = new JPanel(new GridLayout(2, 1));
        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        JPanel panel3 = new JPanel(new GridLayout(2, 1));
        JPanel panel4 = new JPanel(new GridLayout(2, 2));
        panel1.add(new JButton("button"));
        panel1.add(new JButton("button"));
        panel2.add(new JButton("button"));
        panel2.add(new JButton("button"));
        panel3.add(new JButton("button"));
        panel3.add(new JButton("button"));
        panel4.add(new JButton("button"));
        panel4.add(new JButton("button"));
        panel4.add(new JButton("button"));
        panel4.add(new JButton("button"));

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}