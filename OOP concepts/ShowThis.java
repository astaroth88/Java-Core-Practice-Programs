class A
{
	int x,y;
	
	A()
	{
		x=5; y=10;
	}
	A(int x,int y)
	{
		this.x=x; this.y=y;
	}
	void show()
	{
		System.out.println(x+" : "+y);
	}
}
class ShowThis
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.show();
		A a2=new A(5000,10000);
		a2.show();
	}
}