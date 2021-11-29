package Adapter_Pattern;
import Adapter_Pattern.Adapter;
import Adapter_Pattern.Math;

public class AdapterImpl implements Adapter {

	//Math math;
	
	//강화된 알고리즘 적용 전
	/*
	 * @Override public Float twiceOf(Float f) {
	 * 
	 * return (float) Math.twoTime(f.doubleValue()); }
	 */
	
	//강화된 알고리즘 적용 후
	@Override
	public Float twiceOf(Float f) {

		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("절반 함수 호출 시작");
		return (float) Math.half(f.doubleValue());
	}

}
