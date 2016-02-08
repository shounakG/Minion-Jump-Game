import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AllMinionState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AllMinionState extends Actor implements MinionInterface
{
    /**
     * Act - do whatever the AllMinionState wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public MinionContext minion = MinionContext.getInstanceMinion(); 
    
    public AllMinionState(){}
    
    public AllMinionState(MinionContext minion ){
        this.minion = minion;
    }
     public void grow(int x , int y){
        
     };
    public void shrink(int x, int y){
    
    };
    final int jSpeed = 20; // the initial 'jump' speed
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
    
    
    
}
