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
public class train extends CyberpunkViewer implements Runnable 
{
    private BufferedImage trainCar;
    private int x, y;
    private int running = 0;
    
    Random generator = new Random();
    
    /**
     * Constructor for objects of class train
     */
    public train()
    {
        x = 0;
        y = 325;
        try 
        {
            trainCar = ImageIO.read(new File("trainCar.PNG"));
        }
        catch (IOException e) {}
        
    }
    public void draw (Graphics2D page)
    {
        page.drawImage(trainCar, x, y, null);
        
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
            
            x += 5;
            if (x > 1300)
                x = -500;
            try
            {
                Thread.sleep(170);
            }
            catch (Exception e){}
            
            System.out.print(x+"----");
            
       }
    }
    
}
