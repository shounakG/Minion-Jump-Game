import greenfoot.*;

/**
 * Class MyWorld: sample world to show how to make use of my world super-class SWorld
 */
public class MyWorld extends SWorld
{
    private ScoreBoard scoreBoard;
    static GreenfootSound gametheme = new GreenfootSound("gametheme.wav");

    /**
     * Creates a scrolling world using a main actor, a background, some obstacles, and a non-scrolling score.
     */
     public void resetStaticVariables(){
    
       
       if(!(MinionContext.currentState instanceof MinionS)){
        MinionContext.currentState = new MinionS();
            }
            
        
    }
    
    public void rebuild(){
    ChangeScore change = new ChangeScore(new ConcreteSubject());
        int livesLeft =  change.livesScore();
        
        if (livesLeft == 0)
        {
         //   stopMusic();
          //  CollectPoints cp = new CollectPoints();
            gametheme.stop();
            Greenfoot.setWorld(new GameOver());
            resetScore();
          //  updatePointScoreboard();
        }
    }
    
    public MyWorld()
    {    
        super(1000, 400, 1, 8000);
       //  lives = 3;
       // bananas = 0;
       // scroll world constructor call; last parameter is scroll width
       
         if(gametheme.isPlaying() == false)
         {
             gametheme.playLoop();
             gametheme.setVolume(25);
         }
       
        setStage();
        
    }
    
    
    public void setStage(){
    
        resetStaticVariables();
        
        // in the following statement, the main actor is placed at (400, 342) in scroll area coordinates
        addMainActor(new MinionS(), 400, 342, 250, 300); // the last two int parameters are centered window x and y ranges
        GreenfootImage bg = new GreenfootImage("WorldBg.png");
        setScrollingBackground(bg); // set the scolling background image
        // add other scrollable objects using scroll area coordinates
        
       //     updatePointScoreboard();
        
        addObject(new Ground(), 100, 390);
  
addObject(new Ground(), 300, 390);
addObject(new Banana(), 182, 358);
// addObject(new Banana(), 332, 358);


addObject(new Brick(), 150, 290);
addBricks(182, 290);
addObject(new Banana(), 250, 140);
//addObject(new Brick(), 214, 290);
//addObject(new Brick(), 225, 170);
addObject(new Brick(),214, 290);
//addBricks(214, 290);
addObject(new Platform(), 257, 170);
//addBricks(289, 170);
addBricks(300, 290);
//addBricks(332, 290);
addObject(new Oneup(), 332, 290);
//addObject(new Oneup(), 332, 290);
addBricks(364, 290);

addBricks(456, 358);
addObject(new Brick(),488, 358);
addObject(new Brick(),520, 358);
addObject(new Brick(),552, 358);
addObject(new Pumpkin(), 590, 358);
addBricks(488, 326);
addObject(new Brick(),520, 326);
addObject(new Brick(),552, 326);
//addBricks(584, 326);
addBricks(520, 294);
addObject(new Brick(),552, 294);
//addBricks(584, 294);
addBricks(552, 262);
//addBricks(584, 262);
//addBricks(584, 230);

addObject(new Brick(),700, 170);
addObject(new Banana(),700, 80);

addObject(new Ground(), 1250, 390);

addBricks(950, 358);
addObject(new Brick(),950, 326);
addObject(new Brick(),950, 294);

addObject(new Banana(), 1050, 358);
addObject(new Banana(), 1200, 358);

addObject(new Platform(), 1125, 170);
addObject(new Oneup(), 1125, 294);
//addBricks(1200, 170);

addObject(new Brick(),1300, 358);
addObject(new Brick(),1300, 326);
addBricks(1300, 294);

addBricks(1500, 294);

addObject(new Ground(), 1900, 390);

addObject(new Brick(),1615, 358);

//addObject(new Oneup(), 1867, 290);
addBricks(1900, 290);
//addObject(new Oneup(), 1932, 290);

addObject(new Banana(), 1800, 358);
addObject(new Pumpkin(), 2000, 358);

addObject(new Banana(), 2185, 358);

addObject(new Ground(), 2632, 390);
addObject(new Ground(), 3200, 390);

addObject(new Pumpkin(), 2347, 358);

addObject(new Brick(),2550, 290);
addBricks(2582, 290);
addBricks(2614, 290);
addBricks(2646, 290);
addBricks(2678, 290);
addBricks(2710, 290);
addObject(new Brick(),2742, 290);
addObject(new Brick(),2742, 258);
addBricks(2550, 258);
addBricks(2550, 226);
addBricks(2550, 194);
addBricks(2550, 162);
addBricks(2550, 130);
addBricks(2550, 98);
addObject(new Brick(),2550, 66);
addBricks(2582, 66);
addBricks(2614, 66);
addBricks(2646, 66);
addBricks(2678, 66);
addBricks(2710, 66);
addObject(new Brick(),2742, 66);

//addObject(new Oneup(), 2630, 162);
//addObject(new Oneup(), 2662, 162);
addObject(new Banana(), 2582, 258);
addObject(new Oneup(), 2660, 160);
addObject(new Banana(), 2710, 258);

//addObject(new Pumpkin(), 2700, 358);

addObject(new Brick(),2840, 290);
addObject(new Brick(),2872, 290);

addObject(new Brick(),3000, 358);
addObject(new Brick(),3000, 326);
addBricks(3000, 294);

//addObject(new Pumpkin(), 3100, 358);
addObject(new Banana(), 3250, 175);

addObject(new Brick(),3485, 358);
addObject(new Brick(),3485, 326);
addBricks(3485, 294);
addObject(new Brick(),3453, 358);
addBricks(3453, 326);
addBricks(3421, 358);

addObject(new Banana(), 3555, 340);

addObject(new Ground(), 3950, 390);
addObject(new Ground(), 4244, 390);

addObject(new Brick(),3665, 358);
addObject(new Brick(),3665, 326);
addBricks(3665, 294);
addObject(new Brick(),3697, 358);
addBricks(3697, 326);
addBricks(3729, 358);

addObject(new Pumpkin(), 3950, 358);

//addObject(new Oneup(), 3929, 290);

addBricks(4129, 358);
addBricks(4129, 326);
addObject(new Brick(),4129, 294);
addBricks(4129, 0);
addBricks(4129, 32);
addBricks(4129, 64);
addBricks(4129, 96);
addBricks(4129, 128);
addObject(new Brick(),4129, 160);
addObject(new Brick(),4129, 192);

addObject(new Banana(), 4200, 358);
addObject(new Banana(), 4300, 358);
addObject(new Banana(), 4400, 358);
addObject(new Banana(), 4495, 358);
addObject(new Oneup(), 4329, 290);

addObject(new Pipe(),4529, 340);
//addBricks(4529, 358);
//addBricks(4529, 326);
//addBricks(4529, 294);

addObject(new Ground(), 5000, 390);
addObject(new Ground(), 5315, 390);

addBricks(4865, 358);
addBricks(4865, 326);
addObject(new Brick(),4865, 298);

addBricks(5155, 358);
//addBricks(5155, 326);
addObject(new Pumpkin(), 5155, 300);

addObject(new Brick(),5450, 358);
addBricks(5450, 326);
//addDecoratedBricks(5450, 298);
addObject(new Oneup(), 5950, 150);
addObject(new Platform(), 6100, 220);
addObject(new Banana(), 6100, 188);
addObject(new Platform(), 6300, 260);
addObject(new Banana(), 6300, 228);
addObject(new Platform(), 6500, 300);
addObject(new Banana(), 6500, 268);
addObject(new Oneup(), 6750, 160);
addObject(new Pipe(), 7000, 340);
addObject(new Platform(), 7450, 200);
addObject(new Oneup(), 7450, 160);
addObject(new Ground(), 6500, 390);
addObject(new Pipe(), 7900, 340);

addScoreboard();
//addObject(new Oneup(), 7900, 260);

addObject(new Score(), 40, 390, false);
       
       EnemyFactory E = new EnemyFactory();
       this.addObject(E.makeEnemy("EM"), 600, 342);
       this.addObject(E.makeEnemy("EM"), 800, 342);
       this.addObject(E.makeEnemy("GM"), 1100, 342);
       this.addObject(E.makeEnemy("GM"), 1300, 342);
       this.addObject(E.makeEnemy("GH"), 1500, 280);
       this.addObject(E.makeEnemy("GH"), 1400, 240);
       this.addObject(E.makeEnemy("GH"), 2000, 280);
       this.addObject(E.makeEnemy("GM"), 2900, 342);
       this.addObject(E.makeEnemy("GM"), 4000, 342);
       this.addObject(E.makeEnemy("GH"), 4000, 320);
       this.addObject(E.makeEnemy("GM"), 4500, 342);
       this.addObject(E.makeEnemy("EM"), 5200, 342);
       this.addObject(E.makeEnemy("EM"), 4900, 342);
       this.addObject(E.makeEnemy("GM"), 6500, 342);
       this.addObject(E.makeEnemy("GM"), 5800, 342);
       this.addObject(E.makeEnemy("EM"), 6300, 342);
       this.addObject(E.makeEnemy("GM"), 6100, 342);
       this.addObject(E.makeEnemy("GM"), 6800, 342);
       this.addObject(E.makeEnemy("SO"), 7500, 332); 
    }
    
    public void addDecoratedBricks(int x, int y){
        
       
        //addObject(br, x, y);
    }
    
    public void updatePointScoreboard()
    {   
     //   CollectPoints collect = new CollectPoints();
    //    collect.collectPoints(bananas, lives);
        scoreBoard.updatedScore();
        
    }
    
    public void addBricks(int x, int y){
    Castlebricks cb = new Castlebricks(new Brick());
    addObject(cb, x, y);
    }
     
    private void addScoreboard()
    {
        scoreBoard = new ScoreBoard();
          CollectPoints cp = new CollectPoints();
        addObject(scoreBoard, 100, 50, false);
        
        scoreBoard.updatedScore();
    }
    
     private void resetScore(){
         CollectPoints cp = new CollectPoints();
         cp.bananas = 0;
         cp.lives= 3;
         cp.ammo= 1000;
         cp.collectBanana(0);
         cp.collectLives(0);
         cp.decreaseAmmo(1000);
    }
   
}
