package Template_Pattern;

import Template_Pattern.ConnectionHelper.AbstGameConnectHelper;
import Template_Pattern.ConnectionHelper.DefaultGameConnectionHelper;

public class Main {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		helper.requestConnection("���̵� ��ȣ �� ���� ����");
	}

	
}
