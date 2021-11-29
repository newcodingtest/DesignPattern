package Abstract_Pattern2.concreate;

import Abstract_Pattern2.abst.Button;
import Abstract_Pattern2.abst.GuiFac;
import Abstract_Pattern2.abst.TextArea;

//��Ű�� ���� �������ִ� �κ��� �ѱ���� ��� ���� Ŭ������ ����ȭ ��Ų���̴�.
public class FactoryInstance {

	public static GuiFac getGuiFac() {

		switch (getOsCode()) {
		case 0: return new MacGuiFac();
		case 1: return new WinGuiFac();
		case 2: return new LinuxGuiFac();
		}
		return null;
	}

	private static int getOsCode() {
		if(System.getProperty("os.name").equals("Mac OS X")) {
			return 0;
		}else if(System.getProperty("os.name").equals("Windows 10")) {
			return 1;
		}else {
			return 2;
		}
	}

}

class LinuxGuiFac implements GuiFac{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}

}

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("������ ��ư Ŭ��");
	}

}

class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "������ �ؽ�Ʈ �����";
	}

}

class MacGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new MacTextArea();
	}

}

class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("�� ��ư Ŭ��");
	}

}

class MacTextArea implements TextArea {

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "�� �ؽ�Ʈ �����";
	}

}

class WinGuiFac implements GuiFac {

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

class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("������ ��ư Ŭ��");
	}

}

class WinTextArea implements TextArea {

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "������ �ؽ�Ʈ �����";
	}

}




