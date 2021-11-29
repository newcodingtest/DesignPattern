package Builder_Pattern;

public class LgGramBlueprint extends Blueprint {

	private Computer computer;

	public LgGramBlueprint() {
		computer = new Computer("default","default","default");
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("I7");
	}

	@Override
	public void setRam() {
		computer.setRam("ssd 1TB");
	}

	@Override
	public void setStorage() {
		computer.setStorage("10TB");
	}

	@Override
	Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}

}
