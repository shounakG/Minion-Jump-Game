import greenfoot.*;

/**
 * Write a description of class Oneup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oneup extends Powerup
{
    /**
     * Act - do whatever the Oneup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound oneUpSound = new GreenfootSound("oneUp.wav");
    //MinionContext minion = MinionContext.getInstanceCurrentState(getWorld());
    public void act() 
    {
        setpower();
        boost();
        checkHit();// Add your action code here.
    }    
    
    public void boost()
    {
         if(getWorld() instanceof MyWorld && counter% 4 ==0)
            {
                setImage(lifepower);
                counter++;
            }   
    }
    
    private void checkHit()
      {
        AllMinionState m  =  (AllMinionState) getOneIntersectingObject(AllMinionState.class);
         SWorld sWorld = (SWorld)getWorld();
           
        if(m != null)
        {
            oneUpSound.play();
            CollectPoints cp = new CollectPoints(); 
            cp.collectLives(1);
            if (getWorld() instanceof MyWorld)
            {
                MyWorld myWorld = (MyWorld)sWorld;
                myWorld.updatePointScoreboard();
            }
            getWorld().removeObject(this);
        }
      
     }
  
      
}


