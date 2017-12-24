class A extends Thread
{
	public static void naming(String s)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(s+" : "+i);
		}
	}
	public void run()
	{
		A a=new A();
		A b=new A();
		A c=new A();
		A d=new A();
		a.naming("a");
		b.naming("b");
		c.naming("c");
		d.naming("d");
	}
}
class B
{
	public static void main(String args[])
	{
		A a1=new A("main");
		a1.start();
	}
}