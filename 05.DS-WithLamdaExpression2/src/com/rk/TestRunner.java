package com.rk;

import com.rk.interf.Interf1;

public class TestRunner {
	
	public static void main(String[] args) {
		Interf1 i = (a,b)->System.out.println("Sum Is :: "+ (a+b));
		i.add(2,3);
		i.add(200,300);
	}
}
