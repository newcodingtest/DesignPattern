package FactoryMethod_Pattern.framework;

public abstract class ItemCreator {

	//�� �Լ� ��ü�� ���ø� �޼ҵ� ó�� �����Ѵ�.
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
	
	//�������� �����ϱ� ���� DB���� ������ ������ ��û�մϴ�.
	abstract protected void requestItemsInfo();
	//�������� ���� �� ������ ���� ���� �ҹ��� �����ϱ� ���� DB�� �������� �����մϴ�.
	abstract protected void createItemLog();
	//�������� �����ϴ� �˰���
	abstract protected Item createItem();
	
	
}
