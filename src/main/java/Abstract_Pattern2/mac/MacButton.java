package Abstract_Pattern2.mac;

import Abstract_Pattern2.abst.Button;
import Abstract_Pattern2.abst.GuiFac;

public class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("¸Æ ¹öÆ° Å¬¸¯");
	}

}
