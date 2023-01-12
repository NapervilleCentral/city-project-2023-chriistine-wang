
/**
 * Write a description of class window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class window extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private Color myColor;
    private int[] xPos = {95,105, 110, 90};
    private int[] yPos = {45, 45, 70, 70};
    
    /**
     * Constructor for objects of class window
     */
    public window(int x, int y, Color userColor)
    {
        // initialise instance variables
        this.myColor =  userColor;
        this.xPos[0] = x;
        this.yPos[0] = y;
    }

    /**
     * a required component
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        //invoke the draw method
        //....
        draw(g2);
    }
    
    public void draw(Graphics2D page)
    {
        page.setColor(myColor);
        page.fillPolygon(xPos, yPos, xPos.length);
    }
    
    public void run()
    {
        int running = 0;
            while(true)
            {
                if (running %2 == 0)
                    myColor = new Color(200, 200, 200);
                else
                    myColor = Color.yellow;
                
                try{
                    Thread.sleep(17);
                }catch (Exception e){}
                System.out.println(myColor);
                running++;
            }
        }  
    }

