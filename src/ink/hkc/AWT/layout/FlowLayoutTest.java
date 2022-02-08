package ink.hkc.AWT.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout test");

//        frame.setLayout(new FlowLayout());//默认CENTER
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setBounds(500, 500, 200, 200);

        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
