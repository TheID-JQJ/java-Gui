package ink.hkc.AWT.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutWork {
    public static void main(String[] args) {
        Frame frame = new Frame("Layout work");

        frame.setBounds(500, 500, 500, 500);

        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();
        Panel panel5 = new Panel();

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");
        Button button7 = new Button("button7");
        Button button8 = new Button("button8");
        Button button9 = new Button("button9");
        Button button10 = new Button("button10");

        panel1.setLayout(new GridLayout(2, 1));
        panel1.add(button1);
        panel1.add(button2);

        panel2.setLayout(new GridLayout(2, 1));
        panel2.add(button3);
        panel2.add(button4);

        panel3.setLayout(new GridLayout(2, 1));
        panel3.add(button5);
        panel3.add(button6);

        panel4.setLayout(new GridLayout(2, 2));
        panel4.add(button7);
        panel4.add(button8);
        panel4.add(button9);
        panel4.add(button10);

        panel5.setLayout(new GridLayout(2, 1));
        panel5.add(panel3);
        panel5.add(panel4);

        frame.add(panel1, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.CENTER);

        frame.setResizable(false);//不可拖拽调整窗口大小
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
