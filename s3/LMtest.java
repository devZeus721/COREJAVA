package s3;

import javax.swing.*;
import java.awt.*;

public class LMtest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set BorderLayout for the frame
        frame.setLayout(new BorderLayout());

        // Add components to different regions
        frame.add(new JButton("NorthPOLE"), BorderLayout.NORTH);
        frame.add(new JButton("SouthPOLE"), BorderLayout.SOUTH);
        frame.add(new JButton("EastPOLE"), BorderLayout.EAST);
        frame.add(new JButton("WestPOLE"), BorderLayout.WEST);
        frame.add(new JButton("CenterMAIN"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
