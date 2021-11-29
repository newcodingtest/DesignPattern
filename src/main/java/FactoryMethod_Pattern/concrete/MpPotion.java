package FactoryMethod_Pattern.concrete;

import FactoryMethod_Pattern.framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마력 회복!");
	}

}
