import greenfoot.*;

/**
 * Write a description of class Castlebricks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Castlebricks extends BrickDecorator
{
    
    public GreenfootImage bricks = new GreenfootImage("castlebrick.png");
    //Brick br = new Brick();
      public Castlebricks(Obstacle br)
    {
      super(br);
    }
    public void act()
    {
       //br.act2();
       action();
    }
    public void action()
    {
        if(getWorld() instanceof MyWorld )
            {
                setImage(bricks);
                //System.out.println("here");
               
    }
    }
}
