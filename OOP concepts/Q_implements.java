//Question #1

// You are Only allowed to make changes inside B to make the Main Program valid!!

interface A
{
	void show();
};
class B
{
	static A get()
	{
		class Z implements A		//Nested inner class
		{
			public void show()
			{
				System.out.println("This is the 'Show() of A' ");
			}
			
		};
		
		Z obj = new Z();
		return obj;
	}
			
};
class C
{
	public static void main(String args[])
	{
		A a1 = B.get();				//explicit reference casting
		a1.show();
	}
};