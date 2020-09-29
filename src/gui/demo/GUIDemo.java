package gui.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo {

    private JFrame frame;
    private JTextField input;
    private JLabel label;
    private JButton button1;
    private JButton button2;
    private int width;
    private int height;

    public GUIDemo(int width, int height) {
        frame = new JFrame();
        label = new JLabel("HELLO");
        input = new JTextField(10);
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        this.width = width;
        this.height = height;
    }

    public void setUpGUI(){
        Container cp = frame.getContentPane();
        FlowLayout flow = new FlowLayout();
        cp.setLayout(flow);
        frame.setSize(width,height);
        frame.setTitle("First GUI");
        cp.add(input);
        cp.add(label);
        cp.add(button1);
        cp.add(button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setUpButtonListeners(){
        ActionListener buttonListener = new ActionListener() {
            @Override //interface?
            public void actionPerformed(ActionEvent e) {
                System.out.println("click!");
            }
        };

        button1.addActionListener(buttonListener);
    }
}
//Using awt and swing toolkits
