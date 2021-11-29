package Bridge_Pattern;

public class MorseCode {
	
	private MorseCodeFunction function;

	public MorseCode(MorseCodeFunction function) {
		super();
		this.function = function;
	}

	public void setFunction(MorseCodeFunction function) {
		this.function = function;
	}
	
	//��������Ʈ: �����Ѵ�.
	public void dot() {
		function.dot();
	}
	
	public void dash() {
		function.dash();	
	}
	
	public void space() {
		function.space();	
	}	
}
