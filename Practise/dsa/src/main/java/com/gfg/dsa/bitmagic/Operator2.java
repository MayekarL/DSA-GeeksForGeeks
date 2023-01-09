package com.gfg.dsa.bitmagic;

public class Operator2 {

	public static void main(String[] args) {

		System.out.println("Left Shift : " + (leftShift(3, 3))); // 3 * (2^3) = 3 * 8 = 24
		System.out.println("Right Shift : " + (rightShift(12, 2))); // 12 / (2^2)
		System.out.println("Not Operator : "+notOperator(1));
	}

	/*
	 * Left Shift x * 2 ^ y
	 */
	public static int leftShift(int x, int y) {
		return x << y;
	}

	/*
	 * Right Shift x / 2 ^ y
	 */
	public static int rightShift(int x, int y) {
		return x >> y;
	}

	/*
	 * Not Operator
	 */
	public static int notOperator(int x) {
		return ~x;
	}

}
