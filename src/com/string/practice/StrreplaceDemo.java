package com.string.practice;

public class StrreplaceDemo {

	public static void main(String[] args) {
		
		String s1 = "Java is very good programming language";
		
		String replaceStr = s1.replace('a', 'e');
		System.out.println("Replace String is :" + replaceStr);

		String replaceStr1 = s1.replace("is", "was");
		System.out.println("Replace String is :" + replaceStr1);
		
		String str="00000-hhhh-000000";
		String rs=str.replace("h", "s");
		System.out.println(rs);
		
		rs=rs.replace("s", "h");
		System.out.println(rs);
	}

}
