package com.string.practice;

public class Test {

	public static void main(String[] args) {
		Boolean X = new Boolean("yes");
		Boolean Y = new Boolean("no");
		System.out.println(X);
		System.out.println(Y);
		System.out.println(X.equals(Y));

		Boolean B = new Boolean("TRUE");
		Boolean B1 = new Boolean("true");
		Boolean B2 = new Boolean("True");
		Boolean B3 = new Boolean("malaika");
		Boolean B4 = new Boolean("mallika");

		System.out.println(B);
		System.out.println(B1);
		System.out.println(B2);
		System.out.println(B3);
		System.out.println(B4);

	}
}
