package ink.hkc.Swing.dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {
    public static void main(String[] args) {
        new MyJFrame().init();
    }
}

class MyJFrame extends JFrame {
    public void init() {
        setBounds(200, 200, 300, 300);

        //容器
        Container container = getContentPane();
        //绝对布局
        container.setLayout(null);

        JButton jButton = new JButton("click");
        jButton.setBounds(100, 100, 100, 100);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog();
            }
        });

        container.add(jButton);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MyDialog extends JDialog {
    public MyDialog() {
        setBounds(100, 100, 200, 200);

        Container container = getContentPane();
        container.setBackground(Color.BLACK);

        JLabel label = new JLabel("this is Dialog.");
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        container.add(label);

        setVisible(true);
    }
}
