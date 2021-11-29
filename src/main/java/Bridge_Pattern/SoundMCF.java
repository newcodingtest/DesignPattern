package Bridge_Pattern;

public class SoundMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.println("»ß");
	}

	@Override
	public void dash() {
		System.out.println("»Ç");
	}

	@Override
	public void space() {
		System.out.println("Ã¢");
	}
}
