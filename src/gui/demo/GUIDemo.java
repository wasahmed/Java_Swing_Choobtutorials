package gui.demo;

import javax.swing.JFrame;

public class GUIDemo {

    private JFrame frame;
    private int width;
    private int height;

    public GUIDemo(int width, int height) {
        frame = new JFrame();
        this.width = width;
        this.height = height;
    }

    public void setUpGUI(){
        frame.setSize(width,height);
        frame.setTitle("First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
//Using awt and swing toolkits
