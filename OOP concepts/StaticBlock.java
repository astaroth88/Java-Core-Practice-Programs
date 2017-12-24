class NoMain1
{
	static int z;
	public static void main(String args[])
	{
		System.out.println("main method");
	}
	static
	{
		z=123;
		System.out.println("val: "+z);
		System.out.println("First static block!");
	}
	static
	{
		System.out.println("Second static block!");
	}
}
class NoMain2
{
	static int r;
	
	static
	{
		r=6969;
		System.out.println("val: "+r);
		System.exit(0);
	}
}