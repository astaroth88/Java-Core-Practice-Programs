class Que
{
	int x;
	synchronized int get()
	{
		System.out.println("got : "+x);
		return x;
	}
	synchronized void put(int p)
	{
		System.out.println("	put : "+x);
	}
};
class Consumer extends Thread
{
	Que q;
	Consumer(Que qq)
	{
		q=qq;
	}
	public void run()
	{
		while(true)
			q.get();
	}
};
class Producer extends Thread
{
	Que q;
	Producer(Que qq)
	{
		q=qq;
	}
	public void run()
	{
		int i=0;
		while(true)
			q.put(++i);
	}
};
class Shop
{
	public static void main(String args[]) throws Exception
	{
		Que ob=new Que();
		
		Consumer c=new Consumer(ob);
		Producer p=new Producer(ob);
		
		c.setDaemon(true);
		p.setDaemon(true);
		
		c.start();
		p.start();
		
		Thread.sleep(1000);
	}
};
		