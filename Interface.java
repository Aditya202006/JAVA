//  Write a JAVA program to implement Interface.What kind of Inheritence can be achieved ?

import java.util.*;
interface A
{
	void show();
}
class Interface implements A
{
	public void show()
	{
		System.out.println("Interface");
	}
 	public static void main(String args[])
 	{
 		Interface obj=new Interface();
 		obj.show();
 	}
}


Output:
Interface
//  Multiple inheritence can be achieved
