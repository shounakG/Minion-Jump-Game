import greenfoot.*;

/**
 * Interacts with Receiver of the command.
 * 
 * @author Jaya 
 * @version 1.0
 */

public class ControlsCommand implements ICommand
{
    private GameControls gamecontrols;
    
    public ControlsCommand (GameControls gamecontrols){
        this.gamecontrols = gamecontrols;
    }
    
    public void execute ()
    {
        Greenfoot.setWorld(gamecontrols);
        //Greenfoot.setWorld(new GameControls());
    }
    
}
