package ink.hkc.AWT.panel;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelTest {
    public static void main(String[] args) {
        Frame frame = new Frame("Panel test");
        Panel panel = new Panel();

        frame.setLayout(null);

        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(Color.red);

        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(Color.blue);

        frame.add(panel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
