package ink.hkc.AWT.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutTest {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout test");

        frame.setLayout(new GridLayout(3, 2));
        frame.setLocation(500, 500);

        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");
        Button button5 = new Button("Button5");
        Button button6 = new Button("Button6");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.pack();//java函数，自动选择位置
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
