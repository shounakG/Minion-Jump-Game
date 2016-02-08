import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinionGun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinionGun extends AllMinionState
{
    /**
     * Act - do whatever the MinionGun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int gunReloadTime; //this is the number that the reloadDelayCount must pass before the gun shoots
    private int reloadDelayCount; //this number ticks up to time the gun
    private int scrolled; //this int determines how far mario has moved in the x direction
     public int bullets; //this number determines how many bullets you have
     public int bulletCount = 1000;
    final int jSpeed = 25; // the initial 'jump' speed
    int ySpeed = 0, xSpeed = 0; // the initial vertical and horizontal speeds
    boolean aboutFace; // the direction (left or right) the actor is facing
    boolean onGround; // the state of the actor being set on an object or not
    private int invincibilityTime; //this is the number that the invincibilityDelayCount must pass before invincibility runs out
    private int invincibilityDelayCount; //this number ticks up to determine how long you are invincible
    private int imageTime; //this is the number that the imagedDelayCount must pass before the image switches
    private int imageDelayCount; //this number ticks up to time the image switch
    private GreenfootImage imageL;
    private GreenfootImage imageR;
    private GreenfootImage imageML;
    private GreenfootImage imageMR;
    private boolean mLeft; //this boolean shows whether or not mario is left
   
   
    
    
    public MinionGun(MinionContext minion){
     super(minion);
    
    };
    
    public MinionGun(){
        imageL = new GreenfootImage("miniongunL.png");
        imageR = new GreenfootImage("miniongunR.png");
        imageML = new GreenfootImage("miniongunML.png");
        imageMR = new GreenfootImage("miniongunMR.png");
        invincibilityTime = 50;
        invincibilityDelayCount = 0;
        imageTime = 8;
        imageDelayCount = 0;
        gunReloadTime = 20;
        reloadDelayCount = 0;
   }
   
    public void act() 
    {
        
        animateMario();
        reloadDelayCount++;
        invincibilityDelayCount++;
        imageDelayCount++;
        moveVertically();
        moveHorizontally();
    }    
    
    /**
     * Moves the actor with appropriate image.  Checks for obstacles and adjusts
     * the position of the actor accordingly.
     */
    public void moveHorizontally()
    {
        setLocation(getX()+xSpeed, getY());
        while (getOneObjectAtOffset (getImage().getWidth()/2, 0, Block.class)!= null)
        {
            setLocation(getX()-1, getY());
            xSpeed = 0;
        }
        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, Block.class)!= null)
        {
            setLocation(getX()+1, getY());
            xSpeed = 0;
        }
        
         while (getOneObjectAtOffset (getImage().getWidth()/2, 0, Castlebricks.class)!= null)
        {
            setLocation(getX()-1, getY());
            xSpeed = 0;
        }
        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, Castlebricks.class)!= null)
        {
            setLocation(getX()+1, getY());
            xSpeed = 0;
        }
        
        while (getOneObjectAtOffset (getImage().getWidth()/2, 0, Brick.class)!= null)
        {
            setLocation(getX()-1, getY());
            xSpeed = 0;
        }
        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, Brick.class)!= null)
        {
            setLocation(getX()+1, getY());
            xSpeed = 0;
        }
        while (getOneObjectAtOffset (getImage().getWidth()/2, 0, Platform.class)!= null)
        {
            setLocation(getX()-1, getY());
            xSpeed = 0;
        }
        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, Platform.class)!= null)
        {
            setLocation(getX()+1, getY());
            xSpeed = 0;
        }
        while (getOneObjectAtOffset (getImage().getWidth()/2, 0, Pipe.class)!= null)
         {
             setLocation(getX()-1, getY());
             xSpeed = 0;
         }
         while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, Pipe.class)!= null)
         {
            setLocation(getX()+1, getY());
             xSpeed = 0;
         }
         while (getOneObjectAtOffset (getImage().getWidth()/2, 0, Pumpkin.class)!= null)
         {
             setLocation(getX()-1, getY());
             xSpeed = 0;
         }
         while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, Pumpkin.class)!= null)
         {
            setLocation(getX()+1, getY());
             xSpeed = 0;
         }

        
        if (Greenfoot.isKeyDown("right"))
        {
            if (xSpeed < 0)
            {
                xSpeed = 0;
            }
            if (xSpeed < 5)
            {
                xSpeed = xSpeed +1;
            }
            SWorld sWorld = (SWorld)getWorld();
            sWorld.minionL = false;
        }
        if (Greenfoot.isKeyDown("left"))
        {
            if (xSpeed > 0)
            {
                xSpeed = 0;
            }
            if (xSpeed > - 5)
            {
                xSpeed = xSpeed -1;
            }
            SWorld sWorld = (SWorld)getWorld();
            sWorld.minionL = true;
        }
        if (!Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right"))
        {
            xSpeed = 0;
        }
        if (Greenfoot.isKeyDown("up"))
        {
            jump();
        }
        if(Greenfoot.isKeyDown("space")){
        
            shoot();
        }
    }
    
    /**
     * This method will move mario vertically and then check if he should be removed because he is out of the world.
     * It will also check if mario should kill an enemy which he is standing on.
     * If the s key is pressed and there is a pipe below mario, the world will change.
     */
    protected void moveVertically()
    {
        ySpeed ++;
        setLocation(getX(), getY()+ySpeed/2);
        onGround = false;
        
         while (getOneObjectAtOffset (0, getImage().getHeight()/2 - 2, Castlebricks.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }
         while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, Castlebricks.class)!= null)
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
        
      while (getOneObjectAtOffset (0, getImage().getHeight()/2 - 2, Ground.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }
        while (getOneObjectAtOffset (0, getImage().getHeight()/2 - 2, Brick.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }
         while (getOneObjectAtOffset (0, getImage().getHeight()/2 - 2, Pumpkin.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }
        while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, Block.class)!= null)
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
        while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, Brick.class)!= null)
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
         while (getOneObjectAtOffset (0, getImage().getHeight()/2 - 2, Platform.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }
         while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, Platform.class)!= null)
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
        while (getOneObjectAtOffset (0, getImage().getHeight()/2 - 2, Pipe.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }
        
        Enemy g = (Enemy) getOneIntersectingObject(Enemy.class);
        Actor evilminion = getOneObjectAtOffset (0, getImage().getHeight()/2, EvilMinion.class);
        Actor Scarlet = getOneObjectAtOffset (0, getImage().getHeight()/2, Scarlet.class);
     
        if(g != null)
        {
            ySpeed = -20;
            //squish.play();
            g.hit(1);
        }
    }
    
    /**
     * Moves the actor with appropriate image.  Checks for obstacles and adjusts
     * the position of the actor accordingly.
     */
    private void jump()
    {
        if (onGround == true)
        {
              ySpeed -= jSpeed;
        }
    }
    
    protected void animateMario()
    {
        SWorld sWorld = (SWorld)getWorld();
        mLeft = sWorld.minionL;
        if (mLeft == true && Greenfoot.isKeyDown("left"))
        {
            if (getImage() == imageL && imageDelayCount >= imageTime)
            {
                setImage(imageML);
                imageDelayCount = 0;
            }
     
            if (getImage() == imageML && imageDelayCount >= imageTime)
            {
                setImage(imageL);
                imageDelayCount = 0;
            }
            if (getImage() == imageR)
            {
                setImage(imageL);
                imageDelayCount = 0;
            }
            if (getImage() == imageMR)
            {
                setImage(imageL);
                imageDelayCount = 0;
            }
        }
        if (mLeft == true && Greenfoot.isKeyDown("left") == false)
        {
            setImage(imageL);
        }
        
        if (mLeft == false && Greenfoot.isKeyDown("right"))
        {
            if (getImage() == imageR && imageDelayCount >= imageTime)
            {
                setImage(imageMR);
                imageDelayCount = 0;
            }
            if (getImage() == imageMR && imageDelayCount >= imageTime)
            {
                setImage(imageR);
                imageDelayCount = 0;
            }
            if (getImage() == imageL)
            {
                setImage(imageR);
                imageDelayCount = 0;
            }
            if (getImage() == imageML)
            {
                setImage(imageR);
                imageDelayCount = 0;
            }
        }
        if (mLeft == false && Greenfoot.isKeyDown("right") == false)
        {
            setImage(imageR);
        }
    }
    
    public void shoot()
    {
        SWorld sWorld = (SWorld)getWorld();
        bullets = bulletCount;
        scrolled = ((SWorld)getWorld()).getUnivTest(getX());
       
        if(reloadDelayCount >= gunReloadTime && bullets > 0)
        {
             //shot.play();
            ((SWorld)getWorld()).addObject(new FriendlyBullet(), scrolled, getY(), true);
            reloadDelayCount = 0;
            decreaseAmmo();
        }
        else if (bullets == 0)
        {
           // dryfire.play();
        }
    }
    
    public void decreaseAmmo(){
        bulletCount--;
        SWorld sWorld = (SWorld)getWorld();
        CollectPoints cp = new CollectPoints(); 
            cp.decreaseAmmo(bulletCount);
           // MyWorld myWorld = (MyWorld)sWorld;
            if (getWorld() instanceof MyWorld)
            {
                MyWorld myWorld = (MyWorld)sWorld;
                myWorld.updatePointScoreboard();
            }
    }
    
    public void grow(int x , int y){
    
    
    }
    
    public void shrink(int x , int y){
    
        SWorld world = (SWorld)getWorld();    
        Actor futureMain = new Minion();
        world.addObject(futureMain, x, y, false); 
        world.mainActor = futureMain;
        setLocation(x, y);
       
        invincibilityDelayCount = 0;
        world.removeObject(this);
        minion.setState(minion.getMinion());
    
    }
}
