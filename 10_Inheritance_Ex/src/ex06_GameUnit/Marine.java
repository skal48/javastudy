package ex06_GameUnit;

public class Marine extends GameUnit{
  private  final int POWER = 5;
  
  public Marine(String name) {
    super(name);
  }
  
  @Override
  public void attack(GameUnit unit) {
    
      System.out.println(getName() + "의 공격!");
      System.out.println(); 
      if(unit.getHp() <= POWER ) {
        unit.setHp(0);
      }else {
      unit.setHp(unit.getHp() - POWER);
      }
    }
  
  
  
  
  
  
  
}
