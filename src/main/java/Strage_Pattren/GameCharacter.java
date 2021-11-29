package Strage_Pattren;

public class GameCharacter {
	
	//접근점
	private Weapon weapon;
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if(weapon == null) {
			System.out.println("맨 손 공격");
		}else {
		//델리게이트 = 위임하다.
			weapon.attack();
		}
	}

}
