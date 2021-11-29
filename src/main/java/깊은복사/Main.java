package 깊은복사;


public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		// ================ 깊은 복사		
		// 자바에서 String 또는 Integer 는 자동으로 깊은 복사가 이루어진다.
		// 그러나 Cat의 멤버변수에서 깊은 복사가 이루어지지 않으면?
		// 명시적으로 Cat의 copy함수에서 명시적으로 복사를 해야한다.
		// ex 
		/*
		  public Cat copy() throws CloneNotSupportedException {
		  
		  Cat ret = (Cat)this.clone(); ret.setAge(new Age(this.age.getYear(),
		 
		  this.age.getValue())); return ret; }
		 */
		
		Cat navi = new Cat();
		navi.setName("나비");
		navi.setAge(new Age(2012, 3));
		
		Cat yo = navi.copy();
		yo.setName("요");
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
