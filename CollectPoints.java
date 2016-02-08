/**
 * Write a description of class CollectPoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollectPoints extends ConcreteSubject 
{
    // instance variables - replace the example below with your own
   static int bananas = 0;
   static int lives = 3;
   static int ammo = 1000;

    /**
     * Constructor for objects of class CollectPoints
     */
    public CollectPoints()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     */
	public void collectBanana(int noOfBanana) {
		bananas = bananas + noOfBanana;
		if(bananas == 10){
		  ammo = ammo + 20;
		  bananas = 0;
		  }
		 		setState(bananas, lives, ammo);
				
	}
	
	public void collectLives(int noOfLives) {
		lives = lives + noOfLives;
		//setState(bananas, lives, ammo);
		setState(bananas, lives, ammo);
	}
	
	public void decreaseAmmo(int bulletCount) {
		ammo = bulletCount;
		setState(bananas, lives, ammo);
				
	}
}
