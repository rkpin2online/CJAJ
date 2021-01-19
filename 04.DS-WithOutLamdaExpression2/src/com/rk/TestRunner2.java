package com.rk;

import com.rk.Impli.Implemented2;
import com.rk.Interf.Interf2;

public class TestRunner2 {
	public static void main(String[] args) {
		
		Interf2 i = new Implemented2();
		System.out.println(i.getLenth("Hello"));
		System.out.println(i.getLenth("Lamda Expression"));
	}
}
