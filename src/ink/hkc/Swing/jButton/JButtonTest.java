package ink.hkc.Swing.jButton;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonTest {
    public static void main(String[] args) {
        new MyJButton().init();
    }
}

class MyJButton extends JFrame {
    public void init() {
        this.setBounds(200, 200, 300, 300);
        Container container = this.getContentPane();

        URL resource = MyJButton.class.getResource("text.jpg");
        ImageIcon icon = new ImageIcon(resource);

        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");

        container.add(button);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}