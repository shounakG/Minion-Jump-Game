import greenfoot.*;

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick extends Actor implements Obstacle
{
    public GreenfootImage bricks = new GreenfootImage("castlebrick.png");
    public GreenfootImage nbrick = new GreenfootImage("brick.png");
 
    private boolean changed = false; //This determines whether the brick has changed images or not
    public static int counter = 0;
    
    /**
     * Defines the image for the brick
     */
    public Brick()
    {
        
    }
    
    public void act()
    {
        action();
    }
    
    /**
     * If the world is world four or five, the image will be changed to the bricks image.
     */
    public void action() 
    {
        act2();
            
        
    
}
    public void act2(){
        
            setImage(nbrick);
            //System.out.println(counter);
            counter++;
    }
    
}
