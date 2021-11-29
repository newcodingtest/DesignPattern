package Decorate_Pattern.abst;

import Decorate_Pattern.IBeverage;

public class AbstAdding implements IBeverage {

	private IBeverage base;

	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}

	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}

	public IBeverage getBase() {
		return base;
	}
	
	
}
