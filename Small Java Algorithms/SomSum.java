import java.util.Scanner;
class SomSum
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double fact=1;
		double sum=1.0f;
		System.out.print("Enter the no. of terms: ");
		int size=s.nextInt();
		size=size-1;
		for(int j=0;j<size;j++)
		{
			for(int i=2;i<(size*2);i=i+2)
			{
				fact=fact*i;
			}
			sum=sum + (1/fact);
		}

		System.out.println("The sum is: "+sum);
	}
}