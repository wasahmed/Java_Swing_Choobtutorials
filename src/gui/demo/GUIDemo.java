package gui.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo {

    private JFrame frame;
    private JTextField input;
    private JLabel label;
    private JTextArea textArea;
    private JButton button1;
    private JButton button2;
    private int width;
    private int height;

    public GUIDemo(int width, int height) {
        frame = new JFrame();
        label = new JLabel("HELLO");
        input = new JTextField(10);
        textArea = new JTextArea("Hello.\nThis is a JTextArea");
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        this.width = width;
        this.height = height;
    }

    public void setUpGUI(){
        Container cp = frame.getContentPane();
//        FlowLayout flow = new FlowLayout();
        BorderLayout brdr = new BorderLayout();
        cp.setLayout(brdr);
        frame.setSize(width,height);
        frame.setTitle("First GUI");
        cp.add(input, BorderLayout.NORTH);
        cp.add(label, BorderLayout.SOUTH);
        cp.add(button1, BorderLayout.WEST);
        cp.add(button2, BorderLayout.EAST) ;
        cp.add(textArea, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setUpButtonListeners(){
        ActionListener buttonListener = new ActionListener() {
            @Override //interface?
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    String s = input.getText();
                    label.setText(s);
                    input.setText("");
                }
                if (e.getSource() == button2) {
                    String val = input.getText();
                    double n = Double.parseDouble(val);
                    double result = n * 2;
                    label.setText(Double.toString(result));
                }
            }
        };
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
    }
}
//Using awt and swing toolkits
