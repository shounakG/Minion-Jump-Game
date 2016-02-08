import greenfoot.*;

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls extends Actor
{
    private GameMenuInvoker menuInvoker = new GameMenuInvoker();
    
    private GameControls gamecontrols= new GameControls();
    
    private ICommand control = new ControlsCommand(gamecontrols);
    
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Controls()
    {
        GreenfootImage controls = new GreenfootImage("Controls.png");
        setImage (controls);
    }
    
    public void act() 
    {
        menuInvoker.setCommand(control);
        if (Greenfoot.mouseClicked(this)){

           menuInvoker.clickMenuOption();
            //Greenfoot.setWorld(new GameControls());
        }
    }    
}
