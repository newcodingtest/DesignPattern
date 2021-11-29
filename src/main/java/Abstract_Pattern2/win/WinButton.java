package Abstract_Pattern2.win;

import Abstract_Pattern2.abst.Button;
import Abstract_Pattern2.abst.GuiFac;

public class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 버튼 클릭");
	}

}
