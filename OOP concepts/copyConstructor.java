class A
{
	int x;
	String y;
	A()
	{
		x=3;
		y=" people care ";
	}
	
	A(A ob)
	{
		x=ob.x;
		y=ob.y;
	}
		

	A(int p,String q)
	{
		x=p;
		y=q;
	}
}
class CopyCons
{
	public static void main(String args[])
	{
		A ob1=new A(0,"fucks");
		System.out.println(ob1.x+" : "+ob1.y);
		A ob2=new A();
		System.out.println(ob2.x+" : "+ob2.y);
		A ob3=new A(ob1);
		System.out.println(ob3.x+" : "+ob3.y);
		A ob4=new A(ob2);
		System.out.println(ob4.x+" : "+ob4.y);
		
		
		
		
		
		
		
		
		/*A ob1=new A();
		System.out.println(ob1.x+" : "+ob1.y);
		A ob2=new A(0," fucks given ");
		System.out.println(ob2.x+" : "+ob2.y);
		ob1.x=ob2.x;
		ob1.y=ob2.y;
		System.out.println(ob1.x+" : "+ob1.y);*/
	}
}
	