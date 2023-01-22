
import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class rain extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private Color myColor;
    private Color lightColor = new Color(125, 81, 142);
    private int x1, x2, y1, y2, h1, h2;
    private final int VARIANCE = 50; // height diff between rain droplets
    
    Random generator = new Random();        

    
    /**
         * Constructor for objects of class building
         * sets up building's primary attributes
         */
        public rain(int x1, int x2, int y1, int y2, Color userColor)
        {
            // initialise instance variables
            myColor = userColor;
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    
    public void draw(Graphics2D page)
    {
        page.setColor(myColor);
        for (int i = 0; i < 1000; i += 50)
        {
            page.setColor(myColor);
            h1 = i + generator.nextInt(VARIANCE);
            h2 = i + generator.nextInt(VARIANCE);
            page.drawLine(x1+h1,y1+h2,x2+h1, y2 +h2);

            for (int h = 0; h < 1000; i += 50)
            {
                page.setColor(myColor);
                h1 = h + generator.nextInt(VARIANCE);
                h2 = h + generator.nextInt(VARIANCE);
                page.drawLine(x1+h1,y1+h2,x2+h1, y2 +h2);
                for (int j = 0; j < 500; j += 50)
                {
                    page.setColor(lightColor);
                    h2 = j + generator.nextInt(VARIANCE);
                    page.drawLine(x1+h1,y1+h2,x2+h1,y2+h2);
                }
                /*for (int j = 10; j < y1; j+= 20)
                {
                    System.out.println(y1+j + " -" +y2);
                    page.setColor(myColor);
                    page.drawLine(x1+i,y1+j,10,15);
                }*/
            }
        }
    }
    
    public void run()
    {
        int running = 0;
        /*
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
            */

        }  
}
