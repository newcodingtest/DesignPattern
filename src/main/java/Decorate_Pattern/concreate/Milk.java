package Decorate_Pattern.concreate;

import Decorate_Pattern.IBeverage;
import Decorate_Pattern.abst.AbstAdding;

public class Milk extends AbstAdding {

	public Milk(IBeverage material) {
		super(material);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}
}
