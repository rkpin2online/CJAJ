package com.rk.Impli;

import com.rk.Interf.Interf1;

public class Implemented1 implements Interf1{

	@Override
	public void add(int a, int b) {
		System.out.println("Sum Is :: "+ (a+b));
	}
	
}
