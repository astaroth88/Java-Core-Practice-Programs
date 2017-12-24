class Fibo
{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		System.out.println("No. of terms is "+n);
		int a=0,b=1,temp=0;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n-2;i++)
		{	temp=a;
			a=b;
			b=temp+b;
			System.out.print(b+" ");
		}
	}
}