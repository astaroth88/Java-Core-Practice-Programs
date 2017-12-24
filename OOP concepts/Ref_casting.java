class A
{
	int x,y;
	A()
	{
		x=5;
		y=7;
	}
	A(int p,int q)
	{
		x=p;
		y=q;
	}
	void add()
	{
		System.out.println("SUM: "+(x+y));
	}
};
class B extends A
{
	int p,q;
	B()
	{	
		p=11;q=13;
	}
	B(int a,int b,int c,int d)
	{
		super(a,b);
		p=c;
		q=d;
	}
	void diff()
	{
		System.out.println("Diff :"+ (x+y-p-q));
	}
};
class C
{
	public static void main(String args[])
	{
		A a1=new A();
		B b1=new B(3,4,5,6);
		a1.add();
		b1.add();
		b1.diff();
		
		//b1=a1;
		
		/* In case of Inheritance, b1 is an object of child class 'B' which is the Lower Data Type,
			hence it cannot hold the address of a1 object of parent class 'A' which is the Higher Data Type.
			Therefore compilation error will occur. */
			
		//B b2 = (B) a1;		//explicit casting of object is not possible
		
		a1=b1;			// The address of B1 is stored in a1;
		
		a1.add();
		a1.x=10;
		a1.y=12;
		
		//a1.diff();	
		
		//a1.p=14;
		
		//a1.q=16;
		
		B b3 = (B) a1;
		b3.add();
		b3.diff();
	}
};