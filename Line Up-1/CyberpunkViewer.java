import javax.swing.JFrame;
import java.awt.*;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author Christine Wang
 * @version Jan 12 2023
 */

public class CyberpunkViewer
{
    static final int ANIMATION_TIME_IN_SECONDS = 110;

    /*
     * main method for the program which creates and configures the frame for the program
     * 
     * @param args  not used
     *
     */
    
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        //frame is container, holds component. 
        
        Color red = new Color(200, 2, 0);
        // sets size
        frame.setSize(1000 /* x */, 600 /* y */); // sets width, height,xy
        frame.setTitle("City");
        frame.setBackground(red);
        frame.setResizable(false); // locks the size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //changes component
        //int h1 = 100 + (int)(Math.random()*45);
        //int h2 = 100 + (int)(Math.random()*45);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        //CityscapeComponent component = new CityscapeComponent();
        
        
        foreground lineup = new foreground();
        //frame.add(component);
        frame.add(lineup);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            lineup.nextFrame(); //refreshes it
            //may need to adj to make city look better
            Thread.sleep(84); // pauses it, tells the thread to wait, milisec.
            // calls the frame every sleep interval. changes framerate
        }
    }
}
