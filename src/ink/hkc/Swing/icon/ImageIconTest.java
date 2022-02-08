package ink.hkc.Swing.icon;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconTest {
    public static void main(String[] args) {
        new MyImageIcon().init();
    }
}

class MyImageIcon extends JFrame {
    public void init() {
        setBounds(200, 200, 300, 300);

        JLabel label = new JLabel("Image icon");
        //获取icon路径
        URL url = MyImageIcon.class.getResource("text.jpg");
        //创建ImageIcon对象
        ImageIcon imageIcon = new ImageIcon(url);
        //设置label的Icon
        label.setIcon(imageIcon);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}