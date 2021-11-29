package FactoryMethod_Pattern.concrete;

import java.util.Date;

import FactoryMethod_Pattern.framework.Item;
import FactoryMethod_Pattern.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("DB에서 체력 회복 물약의 정보를 가져온다.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 회복 뭉약을 새로 생성 했습니다."+ new Date());
		
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
