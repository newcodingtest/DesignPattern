package Abstract_Pattern.gt;

import Abstract_Pattern.abst.BikeFactory;
import Abstract_Pattern.abst.Body;
import Abstract_Pattern.abst.Wheel;

public class GtBikeFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
