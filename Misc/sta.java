class A
{
	int x=10;
}
class B
{

	public static void main(String args[])
	{
		A a=new A();
		A a1=new A();
		a.x=20;
		
		System.out.println(a.x +" : "+A.x);
	}
}
