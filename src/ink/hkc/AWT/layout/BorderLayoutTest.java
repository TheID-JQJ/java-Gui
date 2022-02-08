package ink.hkc.AWT.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutTest {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout test");

        frame.setLayout(new BorderLayout());
        frame.setBounds(500, 500, 500, 500);

        Button east = new Button("east");
        Button west = new Button("west");
        Button south = new Button("south");
        Button north = new Button("north");
        Button center = new Button("center");

        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
