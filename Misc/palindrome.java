import java.util.Scanner;

class Palindrome
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter String: ");
		String lol=in.nextLine();
		
		String rev="";
		for(int i=lol.length()-1;i>=0;i--)
		{
			rev+=lol.charAt(i);
		}
		
		if(lol.equals(rev))
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
				
	}
	
};