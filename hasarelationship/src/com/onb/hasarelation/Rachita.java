package com.onb.hasarelation;

public class Rachita {

	public static void main(String[] args) {
		Processor processor = new Processor("intel i11",4,2.4);
		HardDisk hardDisk = new HardDisk("WD", 1, "SSD");
		Operatings operatings = new Operatings("Windwos", 11, 64);
		Battery battery = new Battery(3000, 3, "Thoshiba");
		Laptop laptop = new Laptop(69999, battery, operatings, hardDisk, processor);
		System.out.println(laptop);
		// TODO Auto-generated method stub

	}

}
