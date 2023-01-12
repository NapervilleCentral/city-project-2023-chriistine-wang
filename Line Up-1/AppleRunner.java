
/**
 * Write a description of class AppleRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AppleRunner
{
    public static void main(String[] args)
    {
        // processors/cores can do many things w each increased amt
        // threads are similar. splits core if not enough processors, switching back n forth between tasks quickly
        // makes it look like its processed same time
        
        // put your code here
        // threads must implement runnable
        // if static, no need for thread. if moves, yes
        Thread t1 = new Thread(new Apple("one"));
        Thread t2 = new Thread(new Apple("two"));
        Thread t3 = new Thread(new Apple("three"));
        t1.start();
        t2.start();
        t3.start();
    }
}
