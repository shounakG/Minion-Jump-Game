import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
    protected int stability; //stores how much health the ghoomba has
    protected GreenfootImage imageL;
    protected GreenfootImage imageR;
    protected GreenfootImage imageML;
    protected GreenfootImage imageMR;
    protected GreenfootImage imageDeath;
    protected int imageChangeTime; //defines how long to wait before the image changes
    protected int imageChangeDelayCount; //ticks up to change the image
    protected boolean imminentDeath; //determines if the ghoomba is about to die
    protected boolean hitEdge = false; //initialize value for hitEdge. Determines whether the ghoomba has hit the edge
    protected boolean hitMinion = false;
    protected GreenfootSound birthsound;
    protected GreenfootSound deathsound;
    protected int EnemySpeed;
    protected MinionContext minion = MinionContext.getInstanceCurrentState(getWorld());
    protected boolean isDead=false;
     public void act() 
    {
        if(!isDead)
        {
            moveEnemy();
            checkHit();
        }
    }  
    
       protected void checkHit()
    {
        AllMinionState g = (AllMinionState) getOneIntersectingObject(AllMinionState.class);
 
        if(g != null)
        { 
           minion.shrink(getWorld());
        }
        
     }
    

    protected void playsound()
    {
        AllMinionState mget0 = (AllMinionState) getWorld().getObjects(AllMinionState.class).get(0);
        
        if(this.getX()>(mget0.getX()-500) && this.getX()<(mget0.getX()+500))
        {
            birthsound.play();
            birthsound.setVolume(25);
        }
        //else
        //{
         //   birthsound.stop();
        //}
    }
    
    protected void moveEnemy()
    {
    }
    
    /**
     * When this method is called, the stability of the ghoomba will be reduced by the damage that the bullet imflicts.
     * If the stability of the ghoomba is less than or equal to zero, the ghoomba wll be removed.
     */
    protected void hit(int damage) 
    {
        stability = stability - damage;
        if(stability <= 0) 
        {
            deathsound.play();
            AllMinionState mget0 = (AllMinionState) getWorld().getObjects(AllMinionState.class).get(0);
            isDead=true;
            setImage(imageDeath);
        }
    }
    
    protected void deathAnimation()
    {
        if(getY()<400)
        {
            setLocation(getX(), getY() + 5);
        }
        else
        {
            getWorld().removeObject(this);
        }
    }
}
