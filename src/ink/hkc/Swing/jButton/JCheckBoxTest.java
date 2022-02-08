package ink.hkc.Swing.jButton;

import javax.swing.*;
import java.awt.*;

public class JCheckBoxTest {
    public static void main(String[] args) {
        new MyJCheckBox().init();
    }
}

class MyJCheckBox extends JFrame {
    public void init() {
        this.setBounds(200, 200, 300, 300);
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());

        JCheckBox checkBox1 = new JCheckBox("first");
        JCheckBox checkBox2 = new JCheckBox("second");
        JCheckBox checkBox3 = new JCheckBox("third");

        container.add(checkBox1);
        container.add(checkBox2);
        container.add(checkBox3);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}