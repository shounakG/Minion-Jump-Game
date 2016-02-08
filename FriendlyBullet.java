import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 */
public class FriendlyBullet extends Actor
{
    private int damage = 1; //defines how much damage the bullet does to enemies
    private boolean left; //defines whether the bullet should move left or right
    private boolean directionSet = false; //defines whether or not the bullet direction has been set or not
    private boolean imminentDeath = false; //determines whether or not to kill the bullet

    /**
     * This will call the methods that move and remove the bullet, as well as set the direction for the bullet once.
     */
    public void act() 
    {
        if (directionSet == false)
        {
            setDirection();
        }
        moveBullet();
        checkCollision();
    }
    
    /**
     * This will set the direction for the bullet based on mario's direction when the bullet was shot
     */
    private void setDirection()
    {
        SWorld sWorld = (SWorld)getWorld();
        if (sWorld.minionL == true)
        {
            left = true;
        }
        if(sWorld.minionL == false)
        {
            left = false;
        }
        directionSet = true;
    }
        
    /**
     * This will move the Bullet based on the original direction that marioG was facing
     */
    public void moveBullet()
    {
        if(left == true)
        {
            move(-10);
        }
        if(left == false)
        {
            move(10);
        }
    }
    
    /**
     * When called, this will check if the bullet is colliding with any enemies or terrain objects.
     * If the bullet hits an enemy, it will damage the enemy and remove the bullet.
     * If the bullet hits a terrain object, it will remove the bullet.
     */
    public void checkCollision()
    {
       
        Brick br = (Brick) getOneIntersectingObject(Brick.class);
        Castlebricks cb = (Castlebricks) getOneIntersectingObject(Castlebricks.class);
        Enemy g = (Enemy) getOneIntersectingObject(Enemy.class);
        Block bl = (Block) getOneIntersectingObject(Block.class);
        Pumpkin pk = (Pumpkin) getOneIntersectingObject(Pumpkin.class);
        Platform pl = (Platform)getOneIntersectingObject(Platform.class);
        Pipe pi = (Pipe) getOneIntersectingObject(Pipe.class);
        
        if(g != null)
        {
            g.hit(1);
            imminentDeath = true;
        }
        if( pk != null)
        {
            
            imminentDeath = true;
        }
        if(pl != null)
        {
           
            imminentDeath = true;
        }
        if(pi != null)
        {
            
            imminentDeath = true;
        }
        
        if(br != null)
        {
            imminentDeath = true;
        }
        if(bl != null)
        {
            imminentDeath = true;
        }
        if(cb != null)
        {
            imminentDeath = true;
        }
        if (imminentDeath == true)
        {
            getWorld().removeObject(this);
        }
    }
}
