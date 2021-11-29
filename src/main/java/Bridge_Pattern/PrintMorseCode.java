package Bridge_Pattern;

public class PrintMorseCode extends MorseCode {

	public PrintMorseCode(MorseCodeFunction function) {
		super(function);
		// TODO Auto-generated constructor stub
	}
	
	public PrintMorseCode y() {
		dash();
		dash();
		dot();
		space();
		return this;
	}
	public PrintMorseCode o() {
		dot();
		dash();
		dot();
		space();
		return this;
	}
	public PrintMorseCode n() {
		space();
		dash();
		space();
		space();
		return this;
	}

}
