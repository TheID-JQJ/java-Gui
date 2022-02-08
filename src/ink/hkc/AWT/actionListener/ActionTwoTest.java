package ink.hkc.AWT.actionListener;

import java.awt.*;
import java.awt.event.*;

public class ActionTwoTest {
    public static void main(String[] args) {
        Frame frame = new Frame("Action two test");
//        frame.setSize(200, 200);
        frame.setLocation(300, 300);
        frame.setLayout(new FlowLayout());

        Button button1 = new Button("start");
        Button button2 = new Button("stop");
        button2.setActionCommand("button2-stop");//设置button2的ActionCommand值

        MyActionListener m1 = new MyActionListener();
        button1.addActionListener(m1);
        button2.addActionListener(m1);

        frame.add(button1);
        frame.add(button2);

        frame.pack();
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

class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if ( e.getActionCommand().equals("start") ) {
            System.out.println("this is start");
        } else {
            System.out.println("this is stop");
        }
    }
}
