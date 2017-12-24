//Inheriting from Inner Interface

interface A
{
	interface B
	{
		int y=20;
		void add();
	};
};

class D implements A.B 						//D is inheriting from the inner interface B
{
	int z;
	D()
	{	
		z=11;
	}
	public void add()
	{
		System.out.println("SUM: "+(y+z));
	}
	public static void main(String args[])
	{
		D d1 = new D();
		d1.add();
	}
};