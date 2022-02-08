package ink.hkc.Work;

import javax.swing.*;
import java.awt.*;

public class Start {
    public Start() {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 1920, 1080);
        Container container = frame.getContentPane();

        container.add(new Painting());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Start();
    }
}

