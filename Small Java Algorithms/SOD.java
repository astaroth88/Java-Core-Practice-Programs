import java.util.Scanner;
class SOD
{
	static int sum,n,rem;
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=s.nextInt();
		while(n!=0)
		{
			sum = sum+(n%10);
			n = n/10;
		}
		System.out.println("The Sum of digits is "+sum);
	}
}