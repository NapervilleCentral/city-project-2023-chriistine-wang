
    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class building extends JComponent implements Runnable
{
    private Color myColor;
       
    private int x1, x2, y1, y2;
    
    /**
         * Constructor for objects of class building
         * sets up building's primary attributes
         */
        public building(int x1, int x2,int y1, int y2, Color userColor)
        {
            // initialise instance variables
            myColor = userColor;
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
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
        page.fillRect(x1, x2, y1, y2);
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