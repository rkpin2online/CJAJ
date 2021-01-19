package com.rk;

import com.rk.interf.Interf3;

public class TestRunner3 {
	
	public static void main(String[] args) {
		Interf3 i = (x)->x*x; 
		System.out.println(i.getSqure(12));
		System.out.println(i.getSqure(15));
	}
}
