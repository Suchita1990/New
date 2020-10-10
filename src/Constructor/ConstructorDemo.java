package Constructor;

public class ConstructorDemo {
  	String name;
	int age;
	public ConstructorDemo()
	{
		System.out.println("Default Constructor");
	}
	public ConstructorDemo(int i)
	{
		System.out.println("First Constructor");
		System.out.println(i);
	}
	public  ConstructorDemo(int i,int j)
	{
		System.out.println("Second Constructor");
		System.out.println(i+" "+j);
	}
	public ConstructorDemo(String name,int age)
	{
		this.name=name;//when we initiallize class variabl to local variable
		this.age=age;
	/*	
		name=name1;
		age=age1;*/ //without this keyword use this method 
	}
	
	public static void main(String[] args) {
		 ConstructorDemo a =new  ConstructorDemo();
		 ConstructorDemo a1=new  ConstructorDemo(10);
		 ConstructorDemo a2=new  ConstructorDemo(10,20);
		 ConstructorDemo a3=new  ConstructorDemo("Tom",25);
		 
		 System.out.println(a3.name);
		 System.out.println(a3.age);
		 
	}

		 
		
	}

