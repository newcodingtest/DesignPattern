package Template_Pattern.ConnectionHelper;

public class DefaultGameConnectionHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String test) {
		System.out.println("���ڵ�");
		return test;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵�/��ȣ Ȯ�� ����");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
		
		//�߰�����: �������� ������ ���̸� �Ǻ��Ͽ� �˴ٿ��� ����
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("������ ���Ӵܰ�!");
		return info;
	}

}
