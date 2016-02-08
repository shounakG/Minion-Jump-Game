import greenfoot.*;

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MinionContext minion = MinionContext.getInstanceCurrentState(getWorld());
    GreenfootSound BananaSound = new GreenfootSound("banana.wav");
        
    public void act() 
    {
        checkHit();
    }    
    
    private void checkHit()
    {
        AllMinionState g = (AllMinionState) getOneIntersectingObject(AllMinionState.class);
         SWorld sWorld = (SWorld)getWorld();
        
        if(g != null)
        {
           //minion.grow(getWorld());
            BananaSound.play();
            BananaSound.setVolume(75);
            CollectPoints cp = new CollectPoints(); 
            cp.collectBanana(1);
           // MyWorld myWorld = (MyWorld)sWorld;
            if (getWorld() instanceof MyWorld)
            {
                MyWorld myWorld = (MyWorld)sWorld;
                myWorld.updatePointScoreboard();
            }
            getWorld().removeObject(this);
        }
     }
}
