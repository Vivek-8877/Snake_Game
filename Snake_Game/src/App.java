import java.awt.Color;

import javax.swing.JFrame;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        JFrame frame = new JFrame("Snake Game");
        frame.setBounds(10,10,905,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);

        frame.setVisible(true);

        System.out.println("THE END");
    }
}