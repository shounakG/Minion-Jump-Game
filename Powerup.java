import greenfoot.*;

/**
 * Write a description of class Powerup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Powerup extends Actor implements BoostDecorator

{
    MinionContext minion = MinionContext.getInstanceCurrentState(getWorld());
   
     
    public GreenfootImage growpower = new GreenfootImage("power1.png");
    public GreenfootImage lifepower = new GreenfootImage("power4.png");
 
    private boolean changed = false; //This determines whether the brick has changed images or not
    public static int counter = 0;
    
    /**
     * Act - do whatever the Powerup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        boost();// Add your action code here.
    }    
    public void boost()
    {
        setpower();
    }
    
    public void setpower(){
        
        setImage(growpower);
        AllMinionState s = (AllMinionState)getOneIntersectingObject(AllMinionState.class);
        if(s!=null){
            minion.grow(getWorld());
            counter++;
       }
    }
    
    
}
