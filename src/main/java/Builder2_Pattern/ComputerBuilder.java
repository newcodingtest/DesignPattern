package Builder2_Pattern;

public class ComputerBuilder {

	private Computer computer;
	private ComputerBuilder() {
		computer = new Computer("default", "default", "default");
	}
	
	public static ComputerBuilder start(){
		return new ComputerBuilder();
	}
	
	public ComputerBuilder setCpu(String string) {
		computer.setCpu(string);
		return this;
	}
	
	public ComputerBuilder setRam(String string) {
		computer.setRam(string);
		return this;
	}
	
	public Computer build() {
		return this.computer;
	}
}
