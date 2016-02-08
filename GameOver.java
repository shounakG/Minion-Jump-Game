import greenfoot.*;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private int enterDelayCount;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
     //   lost.play();
    }
    
    public void act()
    {
        
          enterDelayCount ++; 
         if (Greenfoot.isKeyDown("enter") && enterDelayCount > 15)
        {
            //clicked.play();
            Greenfoot.setWorld(new MyGameMenu());
        }
                 
    }
}
