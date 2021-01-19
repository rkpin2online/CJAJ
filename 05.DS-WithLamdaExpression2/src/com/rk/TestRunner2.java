package com.rk;

import com.rk.interf.Interf2;

public class TestRunner2 {
	
	public static void main(String[] args) {
		Interf2 i = (s)->s.length();
		System.out.println(i.getLength("Hello"));
		System.out.println(i.getLength("Lamda Expression"));
	}
}
