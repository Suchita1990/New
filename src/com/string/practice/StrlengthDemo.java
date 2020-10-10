package com.string.practice;

public class StrlengthDemo {

	public static void main(String[] args) {
       String s1="Automation";
       String s2="Software";
       String s3="";
       System.out.println(s1.length());
       System.out.println(s2.length());
       
       if(s1.length()>0)
       {
    	   System.out.println("String is not Empty & length is :"+s1.length());
       }
       if(s3.length()==0)
       {
    	   System.out.println("String is Empty & length is:"+s3.length());
       }
	}

}
