/**
 * Write a description of class ConcreteSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteSubject implements Subject  
{
    // instance variables - replace the example below with your own
    private static int subjectStateBananaScore = 0;
    private static int subjectStateLivesScore = 3;
    private static int subjectStateAmmoScore = 1000;
    /**
     * Constructor for objects of class ConcreteSubject
     */
    ConcreteObserver obj = new ConcreteObserver(null);
    
    public ConcreteSubject()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public int getStateBananaScore(){
		return subjectStateBananaScore;
	}
	
	public int getStateLivesScore(){
		return subjectStateLivesScore;
	}
	
	public int getStateAmmoScore(){
		return subjectStateAmmoScore;
	}
	
	public void setState(int bananas, int lives, int ammo){
		this.subjectStateBananaScore = bananas;
		this.subjectStateLivesScore = lives;
		this.subjectStateAmmoScore = ammo;
		notifyObserver();
	}
	
	public void showStateBananaScore(){
		System.out.println("Subject State of Banana"+ getStateBananaScore());
	}
	
	public void showStateLivesScore(){
		System.out.println("Subject State of Lives"+ getStateLivesScore());
	}
	
	public void showStateAmmoScore(){
		System.out.println("Subject State of Ammo"+ getStateAmmoScore());
	}
	
	public void notifyObserver() {
		obj.updateScore();
	}
}
