package exception;
/*
 * throw depends upon certain situation.It is the last line of program.
 * throws return on method level but throw return inside method.
 * custmised Exception-Programmer designed/developed exceptions.u can create own exception bye creating own class
 * with customised exception name
 * extends your exception class with Exception class of java or throwable class of java
 */
public class Exception1
{
 public void login(String username,String password)
 {
	 if(username.equals("Exist") && password.equals("Exist"))
	 {
		 System.out.println("Allowed");
	 }else{
		throw new ArithmeticException();//Customised Exception
		//System.out.println("Hello");//it will not allow.bcoz jvm remove the method out of stack
 }
	 System.out.println("Hello");
 }
}
