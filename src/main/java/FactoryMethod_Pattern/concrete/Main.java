package FactoryMethod_Pattern.concrete;

import FactoryMethod_Pattern.framework.Item;
import FactoryMethod_Pattern.framework.ItemCreator;

public class Main {

	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		
		item.use();
		
		creator = new MpCreator();
		item = creator.create();
		
		item.use();
	}
}
