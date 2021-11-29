package Decorate_Pattern;

import java.util.Scanner;

import Decorate_Pattern.concreate.Base;
import Decorate_Pattern.concreate.Espresso;
import Decorate_Pattern.concreate.Milk;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IBeverage beverage = new Base();
		boolean done = false;
		while(!done) {
			System.out.println("���� ���� ����: "+beverage.getTotalPrice());
			System.out.println("����: 1:�� �߰� / 2:���� �߰�");
			
			switch (sc.nextInt()) {
			case 0: done = true;
				break;
			case 1: 
				beverage = new Espresso(beverage);
				break;
			case 2: 
				beverage = new Milk(beverage);
				break;
			}
		}
		
		System.out.println("���� ����: " + beverage.getTotalPrice());
		sc.close();
	}

}
