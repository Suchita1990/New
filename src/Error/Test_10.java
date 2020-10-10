/*
 * ExceptionInitializerError
 * Here is error bcoz i is not intialize.
 * This error usually occures inside static block/methods
 */
package Error;

public class Test_10
{
  static
  {
	int i=10/0;  
  }
  public static void main(String[] args)
  {
	 
  }
}
