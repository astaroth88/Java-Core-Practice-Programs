import java.util.Scanner;

class CountChar
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String susu;
		String spa=" ";
		int space=0,cha=0;
		
		System.out.println("Enter the string: ");
		susu=s.nextLine();
		
		String sulu[]=susu.split("");
		
		for(int i=0;i<sulu.length;i++)
		{
			if(sulu[i].contains(" "))
				space++;
			else
				cha++;
		}
		System.out.println(" The no. of spaces is "+space+" and the number of characters are "+cha+".");
	}
};