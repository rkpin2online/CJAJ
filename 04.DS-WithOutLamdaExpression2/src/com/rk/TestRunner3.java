package com.rk;

import com.rk.Impli.Implemented3;
import com.rk.Interf.Interf3;

public class TestRunner3 {
	public static void main(String[] args) {
		
		Interf3 i = new Implemented3();
		System.out.println("Squer is:: "+i.getSqure(5));
		System.out.println("Squer is:: "+i.getSqure(10));
	}
}
