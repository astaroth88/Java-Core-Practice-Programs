import java.util.Scanner;
class dateException extends Exception
{
	String res;
	
	dateException(String r)
	{
		res=r;
	}
	
	public String toString()
	{
		return "The exception occured because :"+res;
	}
	
}
class myExp
{
	
	static void dateCheck(int d,int m,int y) throws dateException
	{
		if(d<0||d>31)
		{
			dateException ob=new dateException("Day number given is Out of Bounds");
			throw ob;
		}
		if(m<0||m>12)
		{
			dateException ob=new dateException("Month number is Out of Bounds. ");
			throw ob;
		}
		if((y%4==0)&&(m==2)&&(d>29))
		{
			dateException ob=new dateException("February doesn't have more than 29 days on a Leap year ");
			throw ob;
		}
		if((m==2)&&(d>28))
		{
			dateException ob=new dateException("February doesn't have more than 28 days on a non-Leap year ");
			throw ob;
		}
		if((m==2||m==4||m==6||m==9||m==11) && (d==31))
		{
			dateException ob=new dateException("Months of February,April,June,September,November do not have 31st");
			throw ob;
		}
			
	}
		
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int day,month,year;
		
		System.out.print("enter day :");
		day=s.nextInt();
		System.out.print("\nenter Month :");
		month=s.nextInt();
		System.out.print("\nenter Year :");
		year=s.nextInt();
		try
		{
			dateCheck(day,month,year);
			
		}catch(dateException d)
		{
			System.out.println(d);
		}
		finally
		{
			System.out.print("\n Your Date is "+day+":"+month+":"+year);
		}
	}

}