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
public class train implements Runnable 
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
    public void draw (Graphics2D page) {
        page.drawImage(trainCar, x, y, null);

    }

   
   public void run()
   {
       while(true)
       {
            
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
