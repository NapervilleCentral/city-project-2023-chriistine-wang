
    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class building extends JComponent implements Runnable
{
    private Color myColor;
    private Color lightColor = new Color(149,227,243); 
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
    public building (int w, int h)
    {
        this.x = 0;
        this.y = 325;
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
        for (int i = 10; i < w; i += 20)
        {
            System.out.println(i+"?" +w);
            page.setColor(lightColor);
            page.fillRect(x+i,y,10,15);
            for (int j = 10; j < h; j+= 20)
            {
                System.out.println(y+j + " -" +h);
                page.setColor(lightColor);
                page.fillRect(x+i,y+j,10,15);
            }
        }

    }
    public void run()
    {
        int running = 0;
            while(true)
            {
                running += 50;
                if (running % 2 == 0 && running > 500)
                {
                    lightColor = new Color(207, 229, 214);
                    lightColor = new Color(143, 216, 232);
                }
                else
                    lightColor = Color.white;
                
                try{
                    Thread.sleep(20);
                }catch (Exception e){}
                System.out.println(myColor);
                running++;
            }
        }  
}