import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Write a description of class Floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// animation needs runnable
public class subway extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private int x,y,w,h, width, height;
    private Color gray = new Color(100, 100, 110);
    private Color myLight;


    /**
     * Constructor for objects of class subway
     */
    public subway()
    {
        x = 0;
        y = 325;
        w = 1000;
        h = 75;
    }
    
    public subway (int w, int h, Color userLight)
        {
            myLight = userLight;
            this.x = 0;
            this.y = 325;
            this.width = w;
            this.height = h;
        }
       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, and height.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          page.setColor(gray);
          page.fillRect(x, y, w, h); //rectangle
          
          page.setColor(myLight); 
          page.fillRect(x, y, width, height); //light strip on subway tunnel
       }
       
    public void run()
    {
        int running  = 0;
    while(true){
        
        if(running % 2 == 0)
            x +=20;
        else
            x -= 20;
        running ++;
            try{
            Thread.sleep(17);
        }catch (Exception e){}
        
        System.out.print(x+"-----------------");
        //repaint();
    }
  
    }
}