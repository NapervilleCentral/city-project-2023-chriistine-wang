/********************************************************************
This is my city that holds the buildings, cars, etc
draws it, refreshes it

// a component of the frame
********************************************************************/

    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class LineUp extends JComponent //implements Runnable
{
   // sets stick figure dimensions
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 45; // height diff between figures
   private window myImage; //defines so everyone can use it at class lvl
   //bobs head
   Random generator = new Random();
   //Graphics page;
    
   // StickFigure = building
   
   //private StickFigure2 figure1 = new StickFigure2(100,150,Color.red,120);
   private StickFigure figure1,figure2, figure3, figure4;
   private int running = 0;

   //-----------------------------------------------------------------
   //  Creates constructor for several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public LineUp () //init in applet is like constructor; runs only once
   {                   //Different than start.
      int h1,h2,h3,h4;  // heights of stick figures

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);

      // 0,0 starts top L. bigger y val, goes down graph.
      // +x moves obj right, +y moves obj down
      //                          x    y
      figure1 = new StickFigure (100, 150, Color.red, h1);
      //x, y, color, height
      figure2 = new StickFigure(150, 150, Color.green, h2);
      figure3 = new StickFigure(200, 150, Color.cyan, h3);
      figure4 = new StickFigure(250, 150, Color.yellow, h4);
      
      myImage = new window(45, 10, new Color(200, 200, 200));
     
      //animates it
      //Thread t1 = new Thread(ground);
      //t1.start();
      Thread t2 = new Thread(figure2);
      t2.start();
      Thread t3 = new Thread(figure3);
      t3.start();
      Thread t4 = new Thread(myImage);
      t4.start();

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
      figure1.draw (page);
      figure2.draw (page);
      figure3.draw (page);
      figure4.draw (page);
      myImage.draw (page);
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
