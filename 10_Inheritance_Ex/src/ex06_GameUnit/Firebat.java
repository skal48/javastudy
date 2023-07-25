package ex06_GameUnit;

public class Firebat extends GameUnit{
  private final int POWER =10;
  
  public Firebat() {
    super();
  }
  
  public Firebat(String name) {
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
