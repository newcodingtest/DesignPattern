package Strage_Pattren;

public class Main {
	public static void main(String[] args) {
		
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		//추가 요청
		character.setWeapon(new Axe());
		character.attack();
		
	}

}
