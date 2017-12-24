class Que
{
	int x;
	boolean flag;
	static int count=1;
	
	synchronized void put(int p)
	{
		if(flag)	//false
		{
			try
			{
				wait();
			}catch(Exception e){ }
		}
		x=p;
		System.out.println("	put: "+x);
		flag=true;
		notifyAll();
	}
	
	synchronized int get()
	{
		if(!flag)	//true
		{
			try
			{
				wait();
			}catch(Exception e){ }
		}
		System.out.println("got: "+x);
		count++;
		if(count%4==0)
		{
			try
			{
				wait();
			}catch(Exception e){ }
		}	
		flag=false;
		notifyAll();
		return x;
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
		c1.run();
		c2.run();
		c3.run();
		c4.run();
	}
};
class ShopWait
{
	public static void main(String args[]) throws Exception
	{
		Que ob=new Que();
		
		Producer p1=new Producer(ob);
		Producer p2=new Producer(ob);
		Producer p3=new Producer(ob);
		Producer p4=new Producer(ob);
		
		Consumer c1=new Consumer(ob);
		Consumer c2=new Consumer(ob);
		Consumer c3=new Consumer(ob);
		Consumer c4=new Consumer(ob);
		
		c.setDaemon(true);
		p.setDaemon(true);
		
		Thread.sleep(500);
	}
};
		