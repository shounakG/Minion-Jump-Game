import greenfoot.*;

/**
 * Write a description of class ReturnMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReturnMenu extends Actor
{
    public ReturnMenu()
    {
        GreenfootImage back = new GreenfootImage("back_button.png");
        setImage (back);
    }
    
    /**
     * Act - do whatever the ReturnMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MyGameMenu());
        }
    }    
}
