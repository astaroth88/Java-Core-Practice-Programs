class Que
{
	static int cnt=72;
	synchronized void booking(String na)
	{
		System.out.println("booking ticket for: "+na);
		int x=0;
		while(x<100000)
		{
			x=x+2;
			x=x-1;
		}
		System.out.println("	ticket no. for "+na+" is "+cnt--);
	}
};
class Person extends Thread
{
	String p;
	Que ob;
	Person(String pp,Que qq)
	{
		p=pp;
		ob=qq;
	}
	public void run()
	{
		//synchronized(ob)
		//{
			ob.booking(p);
		//}
	}
};
class Station
{
	public static void main(String args[])
	{
		Que q1=new Que();
		
		Person p1=new Person("Bell",q1);
		Person p2=new Person("Dell",q1);
		Person p3=new Person("Sell",q1);
		Person p4=new Person("Hell",q1);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
	}
};