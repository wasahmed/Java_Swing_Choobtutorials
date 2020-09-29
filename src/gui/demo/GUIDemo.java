package gui.demo;

import javax.swing.*;

public class GUIDemo {

    private JFrame frame;
    private JButton button;
    private int width;
    private int height;

    public GUIDemo(int width, int height) {
        frame = new JFrame();
        button = new JButton("CLICK ME");
        this.width = width;
        this.height = height;
    }

    public void setUpGUI(){
        frame.setSize(width,height);
        frame.setTitle("First GUI");
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
//Using awt and swing toolkits
