//How to use Static Block
//static block,method and variable does not belongs to object.They are common to object.
public class DemoStatic {
    
	static //it is executed when your class is loaded into JVM.It will execute before main
	{
		System.out.println("Hello World In Static ");
	}
	public static void main(String[] args) {
		
		System.out.println("Hello World");

	}
	static
	{
		System.out.println("Bye In Static 2");
	}

}
//Actual use-