/**
 * Write a description of class ConcreteObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteObserver implements Observer
{
    // instance variables - replace the example below with your own
    protected String observerState;
	protected ConcreteSubject subject ;
	
    /**
     * Constructor for objects of class ConcreteObserver
     */
    public ConcreteObserver()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     */
    	
	public ConcreteObserver(ConcreteSubject sub) {
		// TODO Auto-generated constructor stub
		this.subject = sub;
	}
	
	public void updateScore() {
		// TODO Auto-generated method stub
		
		
	}
	
	public void showState(){
		System.out.println("Observer:" + this.getClass().getName() + "=" + observerState);
	}
}
