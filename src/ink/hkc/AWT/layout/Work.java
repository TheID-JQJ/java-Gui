package ink.hkc.AWT.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Work {
    public static void main(String[] args) {
        Frame frame = new Frame("Work");
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(500, 500);
        frame.setLocation(200, 200);
        frame.setResizable(false);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();

        p1.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(2, 1));
        p3.setLayout(new BorderLayout());
        p4.setLayout(new GridLayout(2, 2));

        p1.add(new Button("W1"), BorderLayout.WEST);
        p1.add(new Button("E1"), BorderLayout.EAST);
        p1.add(p2, BorderLayout.CENTER);

        p2.add(new Button("p1-C1"));
        p2.add(new Button("p1-C2"));

        p3.add(new Button("W2"), BorderLayout.WEST);
        p3.add(new Button("E2"), BorderLayout.EAST);
        p3.add(p4, BorderLayout.CENTER);

        for(int i = 0; i < 4; i++) {
            p4.add(new Button("p3-C" + i));
        }

        frame.add(p1);
        frame.add(p3);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
