package ink.hkc.Swing.jFrame;

import javax.swing.*;
import java.awt.*;

public class JFrameTest {
    public static void main(String[] args) {
        new MyJFrame().init();
    }
}

class MyJFrame extends JFrame {
    public void init() {
        setBounds(200, 200, 300, 300);

        JLabel label = new JLabel("Hello World");
        add(label);
        //设置文本标签水平居中
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //获得一个容器
        Container container = getContentPane();
        container.setBackground(Color.blue);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}