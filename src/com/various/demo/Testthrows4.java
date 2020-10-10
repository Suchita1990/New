package com.various.demo;

	import java.io.*;  
	class Testthrows{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
	class Testthrows4{  
	   public static void main(String args[])throws IOException{//declare exception  
	     Testthrows m=new Testthrows();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	}  


