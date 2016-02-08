/**
 * Write a description of class EnemyFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyFactory  
{
    public Enemy makeEnemy(String E)
    {
        if(E.equals("EM"))
        {
            return new EvilMinion();
        }
        else if(E.equals("GM"))
        {
            return new GreenEvilMinion();
        }
        else if(E.equals("GH"))
        {
            return new Ghost();
        }
        else if(E.equals("SO"))
        {
            return new Scarlet();
        }
        else
        {
            return null;
        }
    }
}
