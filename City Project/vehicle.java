
import java.awt.*;
import java.util.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class train here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicle extends JComponent implements Runnable 
{
    private BufferedImage car;
    private int x, y;
    private int running = 0;
    
    Random generator = new Random();
    
    /**
     * Constructor for objects of class train
     */
    public vehicle()
    {
        x = 0;
        y = 325;
        try 
        {
            car = ImageIO.read(new File("car.PNG"));
        }
        catch (IOException e) {}
        
    }
    public void draw (Graphics2D page)
    {
        page.drawImage(car, x, y, null);
        
    }

    public void nextFrame()
    {
        //x += 20;
        //repaint();
    }

   
   public void run()
   {
       while(true)
       {
            //int newX = 100 + generator.nextInt(45);
            //x = newX;
            
            x += 10;
            if (x > 1300)
                x = -1000;
            try
            {
                Thread.sleep(17);
            }
            catch (Exception e){}
            
            System.out.print(x+"----");
            
       }
    }
    
}