package ink.hkc.Swing.icon;

import javax.swing.*;
import java.awt.*;

public class IconTest {
    public static void main(String[] args) {
        MyIcon myIcon = new MyIcon(50, 50);
        myIcon.init();
    }
}

class MyIcon extends JFrame implements Icon {
    private int width;
    private int height;

    public MyIcon() {
    }

    public MyIcon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init() {
        setBounds(200, 200, 300, 300);

        JLabel label = new JLabel("this is icon", this, SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(Color.red);
        g.fillOval(x, y, width, height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
