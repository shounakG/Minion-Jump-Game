import greenfoot.*;

/**
 * Write a description of class StartGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartGame extends Actor
{
    private GameMenuInvoker menuInvoker = new GameMenuInvoker();
    private MyWorld myworld= new MyWorld();
    private ICommand myGame = new MyGameCommand(myworld);
    
    /**
     * Act - do whatever the StartGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public StartGame ()
    {
        GreenfootImage start = new GreenfootImage("Start.png");
        setImage (start);
    }
    
    public void act() 
    {
        menuInvoker.setCommand(myGame);
        if (Greenfoot.mouseClicked(this)){
            //Greenfoot.setWorld(new MyGame());
           menuInvoker.clickMenuOption();
        }
    }   
}
