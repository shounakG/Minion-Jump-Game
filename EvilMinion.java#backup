import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilMinion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilMinion extends Enemy
{
    public EvilMinion()
    {
        imageL = new GreenfootImage("evilminionL.png");
        imageR = new GreenfootImage("evilminionR.png");
        imageML = new GreenfootImage("evilminionML.png");
        imageMR = new GreenfootImage("evilminionMR.png");
        imageDeath = new GreenfootImage("evilminionDeath.png");
        setImage(imageL);
        stability = 1;
        imageChangeTime = 5;
        birthsound = new GreenfootSound("evilminionbirth.mp3");
        deathsound = new GreenfootSound("squish.wav");
        EnemySpeed = 2;
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
            switchImage();
            checkHit();
        }      
        else
            deathAnimation();
    }  

         public void moveEnemy()
    {
        if (getOneObjectAtOffset (getImage().getWidth()/2+1, 0, Brick.class)!= null)
               hitEdge = true;
        if (getOneObjectAtOffset (-getImage().getWidth()/2-1, 0, Brick.class)!= null)
               hitEdge = false;
        if (getOneObjectAtOffset (getImage().getWidth()/2+1, 0, Block.class)!= null)
               hitEdge = true;
        if (getOneObjectAtOffset (-getImage().getWidth()/2-1, 0, Block.class)!= null)
               hitEdge = false;
        if (getOneObjectAtOffset (getImage().getWidth()/2+1, 0, Box.class)!= null)
               hitEdge = true;
        if (getOneObjectAtOffset (-getImage().getWidth()/2-1, 0, Box.class)!= null)
               hitEdge = false;
        if (getOneObjectAtOffset (getImage().getWidth()/2+1, 0, AllMinionState.class)!= null){
               hitEdge = true;
               hitMinion = true;
            }
        if (getOneObjectAtOffset (-getImage().getWidth()/2-1, 0, AllMinionState.class)!= null){
               hitEdge = false;
               hitMinion = true;
            }
        if (hitEdge == false)
        {
            move(EnemySpeed);
            setImage(imageR);
        }
        else if (hitEdge == true)
        {
            move(-EnemySpeed);
            setImage(imageL);
        } 
    }
    
    public void switchImage()
        {
        if(imageChangeDelayCount >= imageChangeTime)
        {
            if(getImage() == imageL)
            {
                setImage(imageML);
                imageChangeDelayCount = 0;
            }
            else if(getImage() == imageML)
            {
                setImage(imageL);
                imageChangeDelayCount = 0;
            }
            else if(getImage() == imageR)
            {
                setImage(imageMR);
                imageChangeDelayCount = 0;
            }
            else
            {
                setImage(imageR);
                imageChangeDelayCount = 0;
            }
        }
        else
        {
            imageChangeDelayCount++;
        }
    } 
}
