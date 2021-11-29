package Adapter_Pattern;
import Adapter_Pattern.Adapter;
import Adapter_Pattern.Math;

public class AdapterImpl implements Adapter {

	//Math math;
	
	//��ȭ�� �˰��� ���� ��
	/*
	 * @Override public Float twiceOf(Float f) {
	 * 
	 * return (float) Math.twoTime(f.doubleValue()); }
	 */
	
	//��ȭ�� �˰��� ���� ��
	@Override
	public Float twiceOf(Float f) {

		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("���� �Լ� ȣ�� ����");
		return (float) Math.half(f.doubleValue());
	}

}
