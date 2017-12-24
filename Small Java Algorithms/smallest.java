import java.util.Scanner;
class Smallest
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a=new int[10];
		int small=Integer.MAX_VALUE;
		System.out.println("Enter 10 Numbers:");
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("The smallest no. is "+small);
	}
}