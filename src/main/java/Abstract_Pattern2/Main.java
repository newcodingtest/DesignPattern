package Abstract_Pattern2;

import Abstract_Pattern2.abst.Button;
import Abstract_Pattern2.abst.GuiFac;
import Abstract_Pattern2.abst.TextArea;
import Abstract_Pattern2.concreate.FactoryInstance;
import Abstract_Pattern2.linux.LinuxGuiFac;
import Abstract_Pattern2.mac.MacGuiFac;

public class Main {

	public static void main(String[] args) {
		
		//1. 이런식으로 리눅스,맥 형태로 만들수있도록 외부에 노출되서는 안된다.
		//GuiFac fac = new LinuxGuiFac();
		//GuiFac fac = new MacGuiFac();
		
		
		GuiFac fac = FactoryInstance.getGuiFac();
		
		Button button = fac.createButton();
		TextArea area =  fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
		System.out.println(System.getProperty("os.name"));
	}

}
