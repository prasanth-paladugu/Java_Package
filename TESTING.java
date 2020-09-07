//TESTING CLASS ON PACKAGE CREATION
import com.beans.TEST;				//GIVING TEST CLASS ADDRESS TO JVM
import com.red.DEMO;				//GIVING DEMO CLASS ADDRESS TO JVM
public class TESTING
{
	public static void main(String[]args)
	{
	TEST t=new TEST();				//CREATIN AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
	t.setX(10);						//CALLING A METHOD
	t.setY(20);
	System.out.println(t.getX()+"\t"+t.getY());
	DEMO d=new DEMO();
	/*d.m1();						//PRIVATE CANNOT BE ACESSED
	d.m2();							//DEFAULT CANNOT BE ACCESED OUT SIDE THE PACKAGE
	d.m3();*/						//PROTECTED CANNOT BE ACESSED OUTSIDE THE PACKAGE WITHOUT RELATION
	d.m4();
	}
}
