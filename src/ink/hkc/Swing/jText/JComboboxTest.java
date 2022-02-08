package ink.hkc.Swing.jText;

        import javax.swing.*;
        import java.awt.*;

public class JComboboxTest {
    public static void main(String[] args) {
        new MyJCombobox().init();
    }
}

class MyJCombobox extends JFrame {
    public void init() {
        this.setBounds(200, 200, 300, 300);
        Container container = this.getContentPane();

        JComboBox comboBox = new JComboBox();
        comboBox.addItem(null);
        comboBox.addItem("first");
        comboBox.addItem("second");
        comboBox.addItem("third");

        container.add(comboBox);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}