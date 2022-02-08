package ink.hkc.Swing.jButton;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonTest {
    public static void main(String[] args) {
        new MyJRadioButton().init();
    }
}

class MyJRadioButton extends JFrame {
    public void init() {
        this.setBounds(200, 200, 300, 300);
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());

        JRadioButton radioButton1 = new JRadioButton("first");
        JRadioButton radioButton2 = new JRadioButton("second");
        JRadioButton radioButton3 = new JRadioButton("third");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        container.add(radioButton1);
        container.add(radioButton2);
        container.add(radioButton3);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}