import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class ExecutePageAtGivenTime {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Execute Page At Given Time");

        // Create a button
        JButton button = new JButton("Execute Page");

        // Add a listener to the button
        button.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                // Get the time to execute the page at
                long executeTime = 500;

                // Create a timer to execute the page at the given time
                Timer timer = new Timer(executeTime - System.currentTimeMillis(), new ActionListener() {
                    //@Override
                    public void actionPerformed(ActionEvent e) {
                        // Open the page in a web browser
                        try {
                            Desktop.getDesktop().browse(new URI("https://www.google.com"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

                // Start the timer
                timer.start();
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(button);

        // Pack the frame and make it visible
        frame.pack();
        frame.setVisible(true);
    }
}