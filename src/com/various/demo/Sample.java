package com.various.demo;

public class Sample {
	public void m2() {
		int[] a= {1,2,3,4,5};
		try
		{ 
		   System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			int lastIndex = a.length;
			System.out.println(a[lastIndex-1]);
		}
		System.out.println("Continue method m2");

	}

}
