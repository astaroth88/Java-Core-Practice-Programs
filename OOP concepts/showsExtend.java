class A
{
	int x;
	A()
	{ 
		x=5;
	}
	A(int p)
	{
		x=p;
	}
	A get()
	{
		return this;
	}
};
class B extends A
{
	int y;
	B()
	{
		y=8;
	}
	B(int p,int q)
	{
		super(p);
		y=q;
	}
};
class C extends B{ };

class D
{
	public static void main(String args[])
	{
		B b1 = new B(14,16);
		B b2 =(B) b1.get();			//explicit reference casting
		System.out.println(b2.x+","+b2.y);
		C c1 = new C();
		C c2 =(C) c1.get();			//explicit reference casting
		System.out.println(c1.x+","+c2.y);
	}
}