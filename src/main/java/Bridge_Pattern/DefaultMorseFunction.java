package Bridge_Pattern;

import java.util.function.Function;

public class DefaultMorseFunction implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.println(".");
	}

	@Override
	public void dash() {
		System.out.println("-");
	}

	@Override
	public void space() {
		System.out.println(" ");
	}

	
}
