package gameCharacter;

public class GameTester {
	public static void main(String args[])
	{
		GameCharacter gc = new GameCharacter();
		System.out.println(gc.characterName);
		System.out.println(gc.health);
		System.out.println(gc.weapon);
		System.out.println(gc.level);
		System.out.println(gc.showSecretCode());
	}
}
