package ink.hkc.Swing.jScroll;

import javax.swing.*;
import java.awt.*;

public class JScrollTest {
    public static void main(String[] args) {
        new MyJScroll().init();
    }
}

class MyJScroll extends JFrame {
    public void init() {
        setBounds(200, 200, 300, 300);
        Container container = getContentPane();

        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("hello world");

        JScrollPane scrollPane = new JScrollPane(textArea);

        container.add(scrollPane);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}