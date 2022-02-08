package ink.hkc.AWT.actionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest {
    public static void main(String[] args) {
        new MyFrame("Text field test");
    }


}

class MyFrame extends Frame{
    public MyFrame(String title) {
        super(title);
        TextField textField = new TextField();
        textField.addActionListener(new TextActionListener());
        textField.setEchoChar('*');

        add(textField);
        pack();
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
}

class TextActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField event = (TextField)e.getSource();
        System.out.println(event.getText());
        event.setText("");
    }
}