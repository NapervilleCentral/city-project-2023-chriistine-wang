import java.awt.*;
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
public class lake extends JComponent
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

       public void draw (Graphics2D page)
       {
          page.setColor(blue);
          page.fillRect(x, y, w, h); //rectangle
          
       }

}
