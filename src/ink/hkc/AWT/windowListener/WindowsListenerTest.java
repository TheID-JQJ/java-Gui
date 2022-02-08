package ink.hkc.AWT.windowListener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowsListenerTest {
    public static void main(String[] args) {
    new MyFrame().init();
    }
}

class MyFrame extends Frame {
    public void init() {
        setBounds(200, 200, 300, 300);
        addWindowListener(new MyWindowListener());

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

    private class MyWindowListener extends WindowAdapter{
        @Override
        public void windowActivated(WindowEvent e) {
            //窗口被激活后执行
            System.out.println("Active");
        }
    }
}