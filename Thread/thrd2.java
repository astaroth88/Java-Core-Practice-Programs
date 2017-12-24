class B extends Thread
{
	public void run()
	{
		int x=0;
		while(x<10000)
			System.out.println("running:"+ x++);
	}
};
class UseRun
{
	public static void main(String args[])
	{
		System.out.println("begin main");
		A a1=new A();
		a1.run();			//here run() method of the thread class is used to call the overriden run() method
		int y=0;
		while(y<10000)
			System.out.println("	end main"+ y++);
	}
};