package com.rk;

import com.rk.interf.Interf1;

public class TestRunner {
	
	public static void main(String[] args) {
		Interf1 i = ()->System.out.println("m1() method implementd by Lamda Expression");
		i.m1();
	}
}
