package ink.hkc.AWT.frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {
    public static void main(String[] args) {
        new MyFrame(100, 100, 500, 500, Color.red).addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
