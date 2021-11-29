package Abstract_Pattern;

import Abstract_Pattern.Sam.SamFactory;
import Abstract_Pattern.abst.BikeFactory;
import Abstract_Pattern.abst.Body;
import Abstract_Pattern.abst.Wheel;
import Abstract_Pattern.gt.GtBikeFactory;

public class Main {

	public static void main(String[] args) {
		//BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtBikeFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		
	}

}
