package com.rk;

import com.rk.Impli.Implemented1;
import com.rk.Interf.Interf1;

public class TestRunner {
	public static void main(String[] args) {
		
		Interf1 i = new Implemented1();
		i.add(2,5);
		i.add(500,100);
	}
}
