package ink.hkc.AWT.Paint;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

public class DrawingTest {
    public static void main(String[] args) {
        new MyDrawing();
    }
}

class MyDrawing extends Frame {
    ArrayList points;

    public MyDrawing() {
        //存储鼠标点击的点
        points = new ArrayList<>();

        setBounds(200, 200, 800, 800);
        addMouseListener(new MyDrawingListener());

        setVisible(true);
        close(this);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    public void addPaint(Point point) {
        points.add(point);
    }

    private class MyDrawingListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            Point point = new Point(e.getX(), e.getY());
            addPaint(point);
            repaint();
        }
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