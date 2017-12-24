class A extends Thread
{
	public void run()
	{
		System.out.println("I am run()");
	}
	public void run(int p)
	{	
		System.out.println("I am overloaded run()");	//start will never call the overloaded run()
	}
};
class OverLoadRun
{
	public static void main(String args[])
	{	
		A a1=new A();
		A a2=new A();
		a1.start();
		a2.run(5);
	}
};