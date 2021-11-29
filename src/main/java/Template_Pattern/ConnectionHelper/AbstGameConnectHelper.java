package Template_Pattern.ConnectionHelper;


//�ٸ� ��Ű����  ����� �и������ν� ���̺귯�� ���·� �ѷ��ش�.
public abstract class AbstGameConnectHelper {
	
	//���� ��Ű�� �� ���� Ŭ���� ������ �޼ҵ带 ����� �� �ִ�.
	protected abstract String doSecurity(String test);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);

	//���ø� �޼ҵ�
	public String requestConnection(String encodedInfo) {
		//���� �۾� -> ��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encodedInfo);
		
		//��ȯ�� ���� ������ ���̵�,��ȣ �Ҵ��Ѵ�.
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}
		
		String userName = "";
		
		int i = authorization(userName);
		
		switch(i) {
			case -1:
				throw new Error("�˴ٿ�");
				
			case 0:
			System.out.println("���� �Ŵ���");
			break;
			
			case 1:
				System.out.println("���� ȸ��");
				break;
				
			case 2:
				System.out.println("���� ȸ��");
				break;
				
			case 3:
				System.out.println("���� ����");
				break;
				
			default:
				break;
		}
		
		return connection(decodedInfo);
	}
}
