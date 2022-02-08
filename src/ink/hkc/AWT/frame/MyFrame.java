package ink.hkc.AWT.frame;

import java.awt.*;

public class MyFrame extends Frame {
    static int num = 0;

    public MyFrame(int x, int y, int w, int h, Color color) {
        super("Frame test:"+(++num));
        setBounds( x, y, w, h);
        setBackground(color);
        setVisible(true);
    }
}
