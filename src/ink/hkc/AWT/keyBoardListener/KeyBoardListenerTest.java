package ink.hkc.AWT.keyBoardListener;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyBoardListenerTest {
    public static void main(String[] args) {
    new MyFrame().init();
    }
}

class MyFrame extends Frame {
    public void init() {
        setBounds(200, 200, 300, 300);

        addKeyListener(new MyKeyBoardListener());

        setVisible(true);
        close(this);
    }

    public void close(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private class MyKeyBoardListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            char keyChar = e.getKeyChar();
            if (keyChar == KeyEvent.VK_SPACE) {
                System.out.println("按下了空格键");
            }
        }
    }
}