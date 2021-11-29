package FactoryMethod_Pattern.concrete;

import java.util.Date;

import FactoryMethod_Pattern.framework.Item;
import FactoryMethod_Pattern.framework.ItemCreator;

public class MpCreator extends ItemCreator  {

	@Override
	protected void requestItemsInfo() {
		System.out.println("DB���� ���� ȸ�� ������ ������ �����´�.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("���� ȸ�� ������ ���� ���� �߽��ϴ�."+ new Date());
		
	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}
}
