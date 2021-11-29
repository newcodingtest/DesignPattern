package Abstract_Pattern.Sam;

import Abstract_Pattern.abst.BikeFactory;
import Abstract_Pattern.abst.Body;
import Abstract_Pattern.abst.Wheel;

public class SamFactory implements BikeFactory  {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

}
