//  Write a JAVA program that implement Runtime polymorphism

class Vechicle
{
	void run()
	{
		System.out.println("Vechicle is Running");
	}
}
class Bike extends Vechicle
{
	void run()
	{
		System.out.println("Bike is Running");
	}
public static void main(String args[])
{
	Bike obj=new Bike();
	obj.run();
}
}

Output:
Bike is Running
