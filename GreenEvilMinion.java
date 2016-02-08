import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilMinion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenEvilMinion extends EvilMinion
{
    public GreenEvilMinion()
    {
        imageL = new GreenfootImage("EvilMinion2L.png");
        imageR = new GreenfootImage("EvilMinion2R.png");
        imageDeath = new GreenfootImage("evilminionDeath2.png");
        setImage(imageL);
        stability = 1;
        imageChangeTime = 5;
        EnemySpeed = 5;
    }
    
    /**
     * Calls the necessary methods to move the ghoomba, animate it and decide whether or not it has been hit
     */
    public void act() 
    {
        if(!isDead)
        {
            playsound();
            
            moveEnemy();

            //switchImage();
            checkHit();
        }
        else
        {
            deathAnimation();
        }
        
    } 
    
       
}
