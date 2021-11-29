package FactoryMethod_Pattern.framework;

public abstract class ItemCreator {

	//이 함수 자체가 템플릿 메소드 처럼 동작한다.
	public Item create() {
		Item item;
		//1
		requestItemsInfo();
		//2
		item = createItem();
		//3
		createItemLog();
		
		return item;
	}
	
	//아이템을 생성하기 전에 DB에서 아이템 정보를 요청합니다.
	abstract protected void requestItemsInfo();
	//아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 DB에 아이템을 생성합니다.
	abstract protected void createItemLog();
	//아이템을 생성하는 알고리즘
	abstract protected Item createItem();
	
	
}
