import greenfoot.*;

/**
 * Interacts with receiver of the command MyGame.
 * 
 * @author Jaya
 * @version 1.0
 */
public class MyGameCommand implements ICommand
{
    private MyWorld myworld;
    
    public MyGameCommand (MyWorld myworld){
        this.myworld = myworld;
    }
    
    public void execute()
    {
        Greenfoot.setWorld(myworld);
        //Greenfoot.setWorld(new MyWorld());
    }
    
}
