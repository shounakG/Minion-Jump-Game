import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MinionContext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinionContext extends Actor
{
    /**
     * Act - do whatever the MinionContext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MinionInterface minionS;
    public MinionInterface minion;
    public MinionInterface minionL;
    public static MinionInterface currentState;
    
    public World w;
    
    //Declaring static variables to get a single instance of this class
    public static MinionContext getInstanceMinion; // this would be used by the child classes of MinionInterface
    public static MinionContext getInstanceCurrentState; // this would be used by other objects with which the minion usually interacts.
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public MinionContext(){
        
    }
    
    public MinionContext(World w){
       //this.w = w;
       minion = new Minion(this);
       minionS = new MinionS(this);
       minionL = new MinionGun(this);
       
       currentState = minionS;
       
    }
    
    public static MinionContext getInstanceMinion(){
     
        if(getInstanceMinion == null){
            getInstanceMinion = new MinionContext();
        }
        return getInstanceMinion;
    }
    
    public static MinionContext getInstanceCurrentState(World w){
    
       if(getInstanceCurrentState == null){
             getInstanceCurrentState = new MinionContext(w);
        }
        
        return getInstanceCurrentState;
    
    }
    
    public void shrink(World w){
    
       
        
        List<MinionGun> minionGList = new ArrayList<MinionGun>();
        List<Minion> minionList = new ArrayList<Minion>();
        List<MinionS> minionSList = new ArrayList<MinionS>();
        
        minionGList = w.getObjects(MinionGun.class);
        minionList  = w.getObjects(Minion.class);
        minionSList = w.getObjects(MinionS.class);
        
        if( currentState instanceof MinionGun){
            
            if(!(minionGList.isEmpty())){
                    int x = minionGList.get(0).getX();
                    int y = minionGList.get(0).getY();
                    minionGList.get(0).shrink(x,y);
       
                }
        
        }
        
        if(currentState instanceof Minion){
          
              if(!(minionList.isEmpty())){
       
                  int x = minionList.get(0).getX();
                  int y = minionList.get(0).getY();
                  minionList.get(0).shrink(x,y);
                }
        
        }
        
        if( currentState instanceof MinionS){
      
             if(!(minionSList.isEmpty())){
                    int x = minionSList.get(0).getX();
                    int y = minionSList.get(0).getY();
                    minionSList.get(0).shrink(x,y);
       
             }
          
        }
    
    }
    
    public void grow(World w){
    
       
        List<MinionS> minionSList = new ArrayList<MinionS>();
        List<Minion> minionList = new ArrayList<Minion>();
        
        minionSList = w.getObjects(MinionS.class);
        minionList  = w.getObjects(Minion.class);
        
        if( currentState instanceof MinionS){
            
            if(!(minionSList.isEmpty())){
                    int x = minionSList.get(0).getX();
                    int y = minionSList.get(0).getY();
                    minionSList.get(0).grow(x,y);
       
                }
        
        }
        
        if(currentState instanceof Minion){
          
              if(!(minionList.isEmpty())){
       
                  int x = minionList.get(0).getX();
                  int y = minionList.get(0).getY();
                  minionList.get(0).grow(x,y);
                }
        
        }
        
    
    }
    
    public void setState(MinionInterface state){
        this.currentState = state;
    }
    
    public MinionInterface getMinion(){
        return new Minion();
    }
    
    public MinionInterface getMinionSmall(){
        return new MinionS();
    }
    
    public MinionInterface getMinionGun(){
        return new MinionGun();
    }
}
