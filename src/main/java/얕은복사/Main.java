package 얕은복사;

public class Main {

	public static void main(String[] args) {

// ================ 얕은 복사		
		
		Cat navi = new Cat();
		navi.setName("나비");
		navi.setAge(new Age(2021, 3));
		
		
		Cat yo = navi;
		yo.setName("요");
		navi.setAge(new Age(2015, 1));
		
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		
	}

}
