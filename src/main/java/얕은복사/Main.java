package ��������;

public class Main {

	public static void main(String[] args) {

// ================ ���� ����		
		
		Cat navi = new Cat();
		navi.setName("����");
		navi.setAge(new Age(2021, 3));
		
		
		Cat yo = navi;
		yo.setName("��");
		navi.setAge(new Age(2015, 1));
		
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		
	}

}
