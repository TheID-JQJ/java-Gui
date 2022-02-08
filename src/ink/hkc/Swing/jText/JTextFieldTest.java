package ink.hkc.Swing.jText;

        import javax.swing.*;
        import java.awt.*;

public class JTextFieldTest {
    public static void main(String[] args) {
        new MyJTextField().init();
    }
}

class MyJTextField extends JFrame {
    public void init() {
        this.setBounds(200, 200, 300, 300);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 1));

        JTextField textField1 = new JTextField("hello");
        JTextField textField2 = new JTextField("world", 20);

        container.add(textField1);
        container.add(textField2);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}