import greenfoot.*;
import java.awt.Color;


/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    private static final String livesLabel = "Lives: "; //This will be displayed on the scoreboard before the number of lives
    private static final String bananaLabel = "Bananas: ";
    private static final String ammoLabel = "Ammo: ";
    //This will be displayed on the scoreboard before the amount of ammo
    private GreenfootImage box; //This is the background for the scoreboard
    private GreenfootImage bar;
    /**
     * This will create the scoreboard background box
     */
    public ScoreBoard ()
    {
        //box = new GreenfootImage (60, 30);
        
        box = new GreenfootImage (80, 50);
        box.setColor(new Color (0f,0f,0f,0.5f));
        //box.fillRect (0,0, 60, 30);
        box.fillRect (0,0, 80, 40);
        
        updatedScore();
    }
    
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        
    public void updatedScore(){
       
        GreenfootImage img = new GreenfootImage (box);
        
        
        ChangeScore change = new ChangeScore(new ConcreteSubject());
        img.setColor (Color.YELLOW);
        img.drawString(livesLabel + change.livesScore(), 5, 12);
        img.drawString(bananaLabel + change.bananaScore(), 5, 25);
        img.drawString(ammoLabel + change.ammoScore(), 5, 38);
                
              
        setImage (img);
        
        
        
        
    }    
    
    public void healthBar(){
        GreenfootImage imgbar = new GreenfootImage (bar);
        imgbar.setColor (Color.GREEN);
        
        setImage(imgbar);
    }
        
}
