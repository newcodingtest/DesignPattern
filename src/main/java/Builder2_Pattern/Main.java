package Builder2_Pattern;

public class Main {
	public static void main(String[] args) {
		Computer computer = ComputerBuilder
				.start()
				.setCpu("test")
				.setRam("test")
				.build();
				
		
	}
}
