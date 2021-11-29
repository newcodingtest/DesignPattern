package Template_Pattern.ConnectionHelper;

public class DefaultGameConnectionHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String test) {
		System.out.println("디코드");
		return test;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		
		//추가사항: 서버에서 유저의 나이를 판별하여 셧다운제 적용
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속단계!");
		return info;
	}

}
