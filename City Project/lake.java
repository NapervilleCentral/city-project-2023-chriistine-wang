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
public class lake extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private int x,y,w,h;
    private Color blue = new Color(9, 8, 25);

    /**
     * Constructor for objects of class Floor
     */
    public lake()
    {
        x = 0;
        y = 400;
        w = 1000;
        h = 200;
    }

    @Override
    public void paintComponent(Graphics g) //required
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method 
        // ...
        draw(g2);
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void setX(int running)
    {
        // update the objects in the cityscape so they are animated
        // ...
        //height = 100 +generator.nextInt(45);
        
        if (running % 2 == 0)
            x +=20;
        else
            x -= 20;
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
    
       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, and height.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          page.setColor(blue);
          page.fillRect(x, y, w, h); //rectangle
          
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
