package ��������;


public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		// ================ ���� ����		
		// �ڹٿ��� String �Ǵ� Integer �� �ڵ����� ���� ���簡 �̷������.
		// �׷��� Cat�� ����������� ���� ���簡 �̷������ ������?
		// ��������� Cat�� copy�Լ����� ��������� ���縦 �ؾ��Ѵ�.
		// ex 
		/*
		  public Cat copy() throws CloneNotSupportedException {
		  
		  Cat ret = (Cat)this.clone(); ret.setAge(new Age(this.age.getYear(),
		 
		  this.age.getValue())); return ret; }
		 */
		
		Cat navi = new Cat();
		navi.setName("����");
		navi.setAge(new Age(2012, 3));
		
		Cat yo = navi.copy();
		yo.setName("��");
		yo.getAge().setYear(2013);
		yo.getAge().setValue(2);
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(yo.getAge().getValue());
		
	}

}
