package com.onb.abstractclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showroom p = new Showroom();
		p.purchase(new Dell());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		p.purchase(new Hp());
		
	}

}
