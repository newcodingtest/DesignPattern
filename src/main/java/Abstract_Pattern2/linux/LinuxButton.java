package Abstract_Pattern2.linux;

import Abstract_Pattern2.abst.Button;

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅스 버튼 클릭");
	}

}
