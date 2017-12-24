class A
{
	int x;
	static int cnt;
	A()
	{
		x=4;
		cnt++;
	}
	A(int p)
	{
		x=p;
		cnt++;
	}
	void show()
	{
		System.out.println(x+" : "+cnt);
	}
	static void objCount()
	{
		System.out.println("the no. object :"+cnt);
	}
}
class ShowStatic
{
	public static void main(String args[])
	{
		System.out.println(A.cnt);	//cnt=0
		A a1=new A();				//a1.x=4,cnt=1
		A.objCount();				//cnt=1
		A a2=new A(13);				//a2.x=13,cnt=2	
		a1.show();					//a1.x=4,cnt=2
		a2.show();					//a2.x=13,cnt=2
		
		new A().objCount();	// ***Anonymous object Creation***
		
		a2.show();					//a2.x=13,cnt=3
		System.out.println(a1.cnt);	//a1.cnt=3
	}
}