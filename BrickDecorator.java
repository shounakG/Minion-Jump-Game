import greenfoot.*;

/**
 * Write a description of class BrickDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class BrickDecorator extends Actor implements Obstacle
{
    protected Obstacle br;
    public BrickDecorator(Obstacle br)
    {
    this.br = br;
    }
    
    /**
     * Act - do whatever the BrickDecorator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        action();
       // Add your action code here.
    }   
    public void action(){
        br.action();
    }
}
