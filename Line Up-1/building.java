
    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class building extends JComponent implements Runnable
{
    private Color myColor;
    private Color myLight;
       
    private int x, y, w, h;
    private int width, height;
    
    /**
         * Constructor for objects of class building
         * sets up building's primary attributes
         */
        public building(int x, int y, int width, int height, Color userColor)
        {
            // initialise instance variables
            myColor = userColor;
            this.x = x;
            this.y = y;
            this.w = width;
            this.h = height;
        }
        public building (int w, int h, Color userLight)
        {
            myLight = userLight;
            this.x = x;
            this.y = y;
            this.width = w;
            this.height = h;
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
        page.fillRect(x, y, w, h);
        
        page.fillRect(x, y, width, height);

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