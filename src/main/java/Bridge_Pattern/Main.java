package Bridge_Pattern;

public class Main {

	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new SoundMCF());
		code.y().o().n();
	}

}
