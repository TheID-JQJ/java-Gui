package ink.hkc.AWT.actionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator {
    public static void main(String[] args) {
        new MyCalculator().loadFrame();
    }
}

class MyCalculator extends Frame {
    TextField num1, num2, num3;

    public void loadFrame() {
        num1 = new TextField();
        num2 = new TextField();
        num3 = new TextField();
        Label label = new Label("+");
        Button button = new Button("=");

        button.addActionListener(new MyCalculatorListener());

        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);
        close(this);
    }

    private class MyCalculatorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText("" + (n1+n2));
            num1.setText("");
            num2.setText("");
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