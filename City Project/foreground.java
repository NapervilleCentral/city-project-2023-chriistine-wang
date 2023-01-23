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
   private Color gray = new Color(36, 36, 69);
   private Color lapis = new Color(57,95,166);
   private Color ultramarine = new Color(61,54,99);
   private Color purple = new Color(71, 37, 96);
   private Color magenta = new Color(118,48,131);
   //Graphics page;
       
   //private StickFigure2 figure1 = new StickFigure2(100,150,Color.red,120);
   private building tower1,tower2,tower3,tower4,tower5,tower6,tower7,tower8;
   private lake lake1;
   private sky background;
   private subway subway1, lightStrip;
   private train train1;
   private vehicle car;
   private rain raining;
   
   private int running = 0;

   //-----------------------------------------------------------------
   //  Creates constructor for several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public foreground () //init in applet is like constructor; runs only once
   {                   //Different than start.

      // 0,0 starts top L. bigger y val, goes down graph.
      // +x moves obj right, +y moves obj down
      //                      x1   x2  y1    y2
      
      // x1+ moves object right, x2+ moves object down from top. y2-  moves object up from bottom
      tower1 = new building (100, 75, 150, 300, lapis);
      tower2 = new building (300, 75, 150, 300, purple);
      tower3 = new building (850, 10, 40, 300, gray);
      tower4 = new building (300, 25, 100, 300, magenta);
      tower5 = new building (460, 50, 120, 300, purple);
      tower6 = new building (620, 15, 70, 300, lapis);
      tower7 = new building (690, 20, 100, 300, ultramarine);
      tower8 = new building (790, 75, 50, 300, gray);
      
      lightStrip = new subway (1000, 5, new Color (240, 164, 239));
      lake1 = new lake();
      subway1 = new subway();
      background = new sky();
      train1 = new train();
      //raining = new rain(20, 0, 30, 60, new Color(242, 205, 245));
      
      Thread t1 = new Thread(train1);
      t1.start();
      /**
      Thread t2 = new Thread(tower1);
      t2.start();
      Thread t3 = new Thread(tower2);
      t3.start();
      Thread t4 = new Thread(tower3);
      t4.start();
      Thread t5 = new Thread(tower4);
      t5.start();
      Thread t6 = new Thread(tower5);
      t6.start();
      Thread t7 = new Thread(tower6);
      t7.start();
      Thread t8 = new Thread(tower7);
      t8.start();
      Thread t9 = new Thread(tower8);
      t9.start();
      
      Thread t10 = new Thread(raining);
      t10.start();
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
      tower4.draw (page);
      tower5.draw (page);
      tower6.draw (page);
      tower7.draw (page);
      tower8.draw (page);
      
      lake1.draw(page); 
      subway1.draw(page);
      lightStrip.draw(page);
      train1.draw(page);
      //car.draw(page);
      //raining.draw(page);

      //ground.draw(page);

      
      
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
