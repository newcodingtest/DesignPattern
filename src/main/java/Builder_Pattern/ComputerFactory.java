package Builder_Pattern;

public class ComputerFactory {

	private Blueprint print;
	
	public void setBlueprint(Blueprint print) {
		this.print = print;
	}
	
	public void make() {
		print.setRam();
		print.setCpu();
		print.setStorage();
	}
	
	public Computer getComputer() {
		return print.getComputer();
		
	}
	
}
