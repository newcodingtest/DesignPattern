package Abstract_Pattern2.win;

import Abstract_Pattern2.abst.Button;
import Abstract_Pattern2.abst.GuiFac;
import Abstract_Pattern2.abst.TextArea;

public class WinGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea();
	}

}
