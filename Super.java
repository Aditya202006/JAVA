//  Write a JAVA program give example for "super" keyword.

import java.util.*;
class A
{
	float salary=10000.0f;
}
class B extends A
{
	float salary=20000.0f;
	void display()
	{
		System.out.println(super.salary);
	}
	public static void main(String args[])
	{
		B obj=new B();
		obj.display();
		System.out.println(obj.salary);
	}
}

/*
Output:
10000.0
20000.0
*/
