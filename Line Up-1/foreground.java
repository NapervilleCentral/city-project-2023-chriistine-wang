import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class foreground extends JComponent //implements Runnable
{
   // sets stick figure dimensions
   private final int HEIGHT_MIN = 275;
   private final int VARIANCE = 25; // height and width diff between buildings
   Random generator = new Random();
   //Graphics page;
       
   //private StickFigure2 figure1 = new StickFigure2(100,150,Color.red,120);
   private building tower1,tower2,tower3,tower4,tower5,tower6,tower7,tower8;
   private lake lake1;
   private sky background;
   private subway subway1;
   private int running = 0;

   //-----------------------------------------------------------------
   //  Creates constructor for several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public foreground () //init in applet is like constructor; runs only once
   {                   //Different than start.
      int h1,h2,h3,h4;  // heights of stick figures

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);

      // 0,0 starts top L. bigger y val, goes down graph.
      // +x moves obj right, +y moves obj down
      //                      x1   x2  y1    y2
      
      // x1+ moves object right, x2+ moves object down from top. y2-  moves object up from bottom
      Color gray = new Color(36, 36, 69);
      tower1 = new building (100, 50, 325, h1, new Color (200, 200, 200));
      tower2 = new building (300, 50, 325, h2, new Color(200, 40, 40));
      tower3 = new building (800, 50, 325, h3, gray);
      lake1 = new lake();
      subway1 = new subway();
      background = new sky();
      //animates it
      //Thread t1 = new Thread(ground);
      //t1.start();
      /*
      Thread t2 = new Thread(figure2);
      t2.start();
      Thread t3 = new Thread(figure3);
      t3.start();
      Thread t4 = new Thread(myImage);
      t4.start();
      */
      //setBackground (Color.black); //sets the color of background
      //setSize (APPLET_WIDTH, APPLET_HEIGHT); //Sets up applet window

      //figure2.draw(page);


   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //  name must be unchanged
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
       //page = this.page;
       
      // order you put drawings determines layers.
      // static
      // ground first, so it will be in very back
      background.draw(page);
      tower1.draw (page);
      tower2.draw (page);
      tower3.draw (page);
      lake1.draw(page); 
      subway1.draw(page);

      //ground.draw(page);

      //Thread t1 = new Thread(ground);
      //t1.start();
      
      
      // second way to draw it
      /*
      int newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure1.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure2.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure3.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure4.setHeight(newHeight);
      */
      //try{
          //pause program for quarter-sec (in miliseconds)
          //Thread.sleep(250);
        //}
      //catch(InterruptedException e){}

      //figure1.draw(page);

      //repaint(); //IMPORTANT LINE
   }

   public void nextFrame()
   {
       //other way to doit
       
       //figure1.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure2.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure3.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure4.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //running ++;
       //ground.setX(running);
       //Thread t1 = new Thread(ground);
       //t1.start();

       repaint(); 
       //refreshes it. gives it a new frame

   }

   public void run()
   {
    
   }
}
