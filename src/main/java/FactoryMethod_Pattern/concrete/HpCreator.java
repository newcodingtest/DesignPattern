package FactoryMethod_Pattern.concrete;

import java.util.Date;

import FactoryMethod_Pattern.framework.Item;
import FactoryMethod_Pattern.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("DB���� ü�� ȸ�� ������ ������ �����´�.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("ü�� ȸ�� ������ ���� ���� �߽��ϴ�."+ new Date());
		
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
