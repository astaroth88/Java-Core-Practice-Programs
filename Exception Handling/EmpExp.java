import java.util.Scanner;
class EmployeeExp extends Exception
{
	String res;
	
	EmployeeExp(String r)
	{
		res=r;
	}	
	public String toString()
	{
		return "An Exception Occured. Reason:  "+ res;
	}
}
class EmpExp
{
	static void checkNo(String no)throws EmployeeExp
	{
		int len=no.length();
		try
		{
			int phno=Integer.parseInt(no);
		}
		catch(NumberFormatException op)
		{
			System.out.println("The Phone Number has to be a Number!");
		}
		if(len!=10)
		{
			EmployeeExp ob=new EmployeeExp(" The number is Wrong,bro! ");
			throw ob;
		}
	}
	static void checkAge(String a)throws EmployeeExp
	{
		try
		{
			int num=Integer.parseInt(a);
			if(num<20)
			{
				EmployeeExp ob=new EmployeeExp(" You are too Young. Bhaagja! ");
				throw ob;
			}
			else if(num>60)
			{
				EmployeeExp ob=new EmployeeExp(" You are too Old. Bhaagja! ");
				throw ob;
			}
		}
		catch(NumberFormatException op)
		{
			System.out.println(" Age has to be a number");
		}
			
		
	}
	public static void main(String args[])
	{
	
		String name,email,gender,number,age;
		Scanner s=new Scanner(System.in);
		
		try
		{
		
			System.out.print("\nEnter your Name: ");
			name=s.nextLine();
			System.out.print("\nEnter your gender(Male/Female/Transgender: ");
			gender=s.nextLine();
			System.out.print("\nEnter your age: ");
			age=s.nextLine();
			checkAge(age);
			System.out.print("\nEnter your email id: ");
			email=s.nextLine();
			System.out.print("\nEnter your Phone Number ");
			number=s.next();
			checkNo(number);
		}
		catch(EmployeeExp e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.print("\n Yay");
		}
	}
};
		