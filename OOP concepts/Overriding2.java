class A
{
	void show()
	{
		System.out.println("Show in A");
	}
};
class B extends A
{
	public void show()
	{
		System.out.println("Overriden show in B");
	}	
	void show(int x)
	{
		System.out.println("Overriden show in B "+x);
	}
};
class C
{
	public static void main(String args[])
	{
		A a1=new A();
		B b1=new B();
		
		a1.show();
		b1.show();
		b1.show(10);
		
		a1=b1;			//implicit reference casting
		
		a1.show();		//parent class can only access overriden methods and instance variables in the child class, nothing else 4
		
		//a1.show();	// Parent class A has no idea about the methods in child class B
	}
};