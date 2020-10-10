package com.trycatch.demo;

public class Withtrycatch {

	public static void main(String[] args) {
		System.out.println("Stmt1");
		try
		{
			System.out.println(10/0); //risky code handle
		}
		catch(ArithmeticException e)
		{
		  System.out.println(10/2);
		}
		System.out.println("Stmt3");
	}

}
