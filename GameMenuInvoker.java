/**
 * Write a description of class GameMenuInvoker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMenuInvoker  
{
  private ICommand command;
  
  public void setCommand(ICommand command){
    this.command = command;
  }
  
  public void clickMenuOption(){
    command.execute();
  }
}
