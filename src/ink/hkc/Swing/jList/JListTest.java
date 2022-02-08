package ink.hkc.Swing.jList;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Vector;

public class JListTest {
    public static void main(String[] args) {
        new MyJList().init();
    }
}

class MyJList extends JFrame {
    public void init() {
        this.setBounds(200, 200, 300, 300);
        Container container = this.getContentPane();

//        String[] content = {"first", "second", "third"};
        Vector content = new Vector();
        JList list = new JList(content);
        content.add("first");
        content.add("second");
        content.add("third");


        container.add(list);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}