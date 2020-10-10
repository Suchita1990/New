package exception;

public class ExecutionEngine {

	public static void main(String[] args)
	{
		/*Vehicle1 v=new Vehicle1();
	   System.out.println( v.setMaxSpeed(120));
	    */
		Threewhlr m=new Threewhlr();
		int maxSpeed=m.setMaxSpeed(65);
		System.out.println("Max Speed for Auto is set to:"+maxSpeed+"kmph");
		
		Twowheelr honda=new Twowheelr();
		maxSpeed=honda.setMaxSpeed(115);
		System.out.println("Max Speed for Honda is set to:"+maxSpeed+"kmph");
		
		Fourwhlr Verana=new Fourwhlr();
		maxSpeed=Verana.setMaxSpeed(230);
		System.out.println("Max Speed for Verana is set to:"+maxSpeed+"kmph");
	}
}
