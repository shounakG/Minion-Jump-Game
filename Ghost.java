import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilMinion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Enemy
{
    
    public Ghost()
    {
        imageL = new GreenfootImage("ghostL.png");
        imageR = new GreenfootImage("ghostR.png");
        imageML = new GreenfootImage("ghostML.png");
        imageMR = new GreenfootImage("ghostMR.png");
        setImage(imageL);
        stability = 1;
        imageChangeTime = 5;
        birthsound = new GreenfootSound("ghostbirth.mp3");
        deathsound = new GreenfootSound("ghostdeath.mp3");
        imageDeath = new GreenfootImage("ghostDeath.png");
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
            checkHit();
        }
        else
        {
            deathAnimation();
        }
        //switchImage();
    }  

    private void direction()
    {
        if(getImage()==imageR)
              setImage(imageMR);
        else if(getImage()==imageL)
              setImage(imageML); 
    }
    
    protected void moveEnemy()
    {
        AllMinionState mget0 = (AllMinionState) getWorld().getObjects(AllMinionState.class).get(0);
        
        if((mget0.getX()-300<getX() && mget0.getX()+300>getX()))
        {
            if (getOneObjectAtOffset (getImage().getWidth()/2+1, 0, Brick.class)!= null)
            {
                direction();
            }
            else if (getOneObjectAtOffset (-getImage().getWidth()/2-1, 0, Brick.class)!= null)
            {
                direction();
            }
            else if (getOneObjectAtOffset (getImage().getWidth()/2+1, 0, Block.class)!= null)
            {
                direction();
            }
            else if (getOneObjectAtOffset (-getImage().getWidth()/2-1, 0, Block.class)!= null)
            {
                direction();
            }
            else if (getOneObjectAtOffset (getImage().getWidth()/2+1, 0, Box.class)!= null)
            {
                direction();
            }
            else if (getOneObjectAtOffset (-getImage().getWidth()/2-1, 0, Box.class)!= null)
            {
                direction();
            }
            else if (getOneObjectAtOffset (getImage().getWidth()/2+1, 0, AllMinionState.class)!= null)
            {
                direction();
                hitMinion = true;
            }
            else if (getOneObjectAtOffset (-getImage().getWidth()/2-1, 0, AllMinionState.class)!= null)
            {
                direction();
                hitMinion = true;
            }
            else 
            {
                if(getImage()==imageML)
                    setImage(imageL); 
                else if(getImage()==imageMR)
                    setImage(imageR); 
            }
              
            
            
            if(mget0.getX()>getX())
            {
                 move(+2);
                 if(getImage()==imageMR)
                    setImage(imageMR); 
                 else 
                    setImage(imageR); 
            }
            else
            {
                move(-2);
                if(getImage()==imageML)
                    setImage(imageML); 
                else 
                    setImage(imageL); 
            }
            if(mget0.getY()>getY())
            {
                 setLocation(getX(), getY() + 2);
                 
            }
            else
            {
                setLocation(getX(), getY() - 2);
                
            }
        }
    }
    
    protected void playsound()
    {
        AllMinionState mget0 = (AllMinionState) getWorld().getObjects(AllMinionState.class).get(0);
        
        if((this.getX()>(mget0.getX()-600)&&this.getX()<(mget0.getX()-400)) || (this.getX()<(mget0.getX()+600)&&this.getX()>(mget0.getX()+400)))
        {
            deathsound.play();
            deathsound.setVolume(25);
        }
        else if((this.getX()>(mget0.getX()-300)) &&  (this.getX()<(mget0.getX()+300)))
        {
            birthsound.play();
            birthsound.setVolume(30);
        }
    }
    
   /* public void switchImage()
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
    */
}
