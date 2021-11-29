package Template_Pattern.ConnectionHelper;


//다른 패키지로  기능을 분리함으로써 라이브러리 형태로 뿌려준다.
public abstract class AbstGameConnectHelper {
	
	//같은 패키지 내 하위 클래스 까지만 메소드를 사용할 수 있다.
	protected abstract String doSecurity(String test);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);

	//템플릿 메소드
	public String requestConnection(String encodedInfo) {
		//보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		//반환된 것을 가지고 아이디,암호 할당한다.
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}
		
		String userName = "";
		
		int i = authorization(userName);
		
		switch(i) {
			case -1:
				throw new Error("셧다운");
				
			case 0:
			System.out.println("게임 매니저");
			break;
			
			case 1:
				System.out.println("무료 회원");
				break;
				
			case 2:
				System.out.println("유료 회원");
				break;
				
			case 3:
				System.out.println("권한 없음");
				break;
				
			default:
				break;
		}
		
		return connection(decodedInfo);
	}
}
