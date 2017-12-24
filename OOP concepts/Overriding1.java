class A
{
	void show()
	{
		System.out.println("show in A");
	}
};

class B extends A
{
	void show()
	{
		System.out.println("show in B");
	}
};

class C extends B
{
	void show()
	{
		System.out.println("show in C");
	}
};

class D extends C
{
	void show()
	{
		System.out.println("show in D");
	}
};

class E
{
	public static void main(String args[])
	{
		A ob;
		int x=Integer.parseInt(args[0]);
		
		if(x>0 && x<100)
			ob=new A();
		else if(x>100 && x<500)
			ob=new B();
		else if(x>500 && x<1000)
			ob=new C();
		else 
			ob=new D();
		ob.show();
	}
};