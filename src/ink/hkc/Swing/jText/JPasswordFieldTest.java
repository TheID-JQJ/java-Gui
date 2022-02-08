package ink.hkc.Swing.jText;

import javax.swing.*;
import java.awt.*;

public class JPasswordFieldTest {
    public static void main(String[] args) {
        new MyJPasswordField().init();
    }
}

class MyJPasswordField extends JFrame {
    public void init() {
        this.setBounds(200, 200, 300, 300);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 1));

        JTextField textField1 = new JTextField("user name");
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');

        container.add(textField1);
        container.add(passwordField);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}