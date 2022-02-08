package ink.hkc.AWT.Paint;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintTest {
    public static void main(String[] args) {
        new MyPaint();
    }
}

class MyPaint extends Frame {
    public MyPaint() {
        setBounds(200, 200, 800, 800);
        setVisible(true);
        close(this);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);

        g.drawOval(200, 200, 200, 200);
        g.fillOval(400, 200, 200, 200);
        g.fillRect(200, 400, 200, 200);
        g.drawRect(400, 400, 200, 200);

        g.setColor(Color.BLACK);
    }

    private void close(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
