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
public class train extends JComponent 
{
    private BufferedImage trainCar;
    private int x, y, randomGraphX, randomGraphY;
    private int moving = 0;
    
    Random generator = new Random();
    
    /**
     * Constructor for objects of class train
     */
    public train()
    {
        x = 100;
        y = 100;
        try {
            trainCar = ImageIO.read(newFile("trainCar.PNG"));
        }
        catch (IOException e) {}
        
    }
    public void draw (Graphics2D page)
    {
        page.drawImage(trainCar, 30, 48, null);
        
    }
    
}
