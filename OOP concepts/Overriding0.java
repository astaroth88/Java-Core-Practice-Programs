class A
{
	int x=4;
	A()
	{
		fool();
	}
	void fool()
	{
		System.out.println("method A");
		x=x+6;
	}
};
class B extends A
{
	B()
	{
		fool();
	}
	void fool()
	{	
		System.out.println("method in B");
		x=x+8;
	}
};
class E
{
	public static void main(String args[])
	{
		A a1=new B();				//implicit type reference casting  
		
//Above, the constructors A() and B() will be called but the fool() method in constructor A() will execute the fool() method in constructor B()
// This is because the object is created for class B even if the datatype is of object A 		
		a1.fool();
		System.out.println(a1.x);
	}
};