class A extends Thread
{
	public void start()
	{
		System.out.println("Hi Start");
	}
	public void run()
	{	
		int x=0;
		while(x<6)
			System.out.println("Running"+ x++);
	}
};
class B
{
	public static void main(String args[])
	{
		System.out.println("Begin Main");
		A a1=new A();
		a1.start();
		System.out.println("End Main");
	}
};