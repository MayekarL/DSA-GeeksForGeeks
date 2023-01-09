package com.gfg.dsa.bitmagic;

public class Operator1 {

	public static void main(String[] args) {
	
		System.out.println("And Operator : "+andOperator(3, 6));
		System.out.println("Or Operator : "+orOperator(3, 4));
		System.out.println("XOr Operator : "+xOrOperator(3, 4));
	}
	
	/*
	 * And Operator &
	 */
	public static int andOperator(int x, int y) {	 	 
		return x&y;									 			
	}												
	
	public static int orOperator(int x,int y) {
	return x | y;	
	}
	
	public static int xOrOperator(int x,int y) {
	return x ^ y;	
	}
}
