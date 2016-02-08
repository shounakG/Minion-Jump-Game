import greenfoot.*;

/**
 * Write a description of class ChangeScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChangeScore extends ConcreteObserver
{
    /**
     * Act - do whatever the ChangeScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ChangeScore(){
    }
    
    public ChangeScore(ConcreteSubject sub){
		super( sub);
	}
	
     public int bananaScore(){
         return subject.getStateBananaScore();
        }
        
     public int livesScore(){
         return subject.getStateLivesScore();
        }
        
     public int ammoScore(){
         return subject.getStateAmmoScore();
        }
        
}
