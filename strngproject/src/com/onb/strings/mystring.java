package com.onb.strings;

public class mystring {

	public static void main(String[] args) {
		String name = "My name is Akshay";
		name = name.toUpperCase();
		System.out.println(name);
		System.out.println(name.length());
		//System.out.println(name);
		String[] s = name.split(" ",4);
		for(String x : s) {
			System.out.println(x);
		}

	}

}
