package ink.hkc.AWT.actionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionEventTest {
    public static void main(String[] args) {
        Frame frame = new Frame("Action event test");
        frame.setSize(200, 200);
        frame.setLocation(300, 300);

        Button button = new Button("click");
        button.addActionListener(new MyActionLister());

        frame.add(button);
        frame.setVisible(true);
        close(frame);
    }
    public static void close(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionLister implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
    }
}
