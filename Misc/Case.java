import java.util.Scanner;

class Upper
{
	static String high="";
	
	Upper(String su)
	{
		for(int i=0;i<su.length();i++)
		{
			char cha;
			cha=su.charAt(i);
			if(cha>='a' && cha<='z')
			{
				cha=(char)(cha-32);
			}
			high+=cha;
		}
		if(high=="")
		{
			System.out.print("NOTHING HERE!!");
		}
	}
	static String giveUpper()
	{
		return high;
	}
}
class Lower
{
	static String low="";
	
	Lower(String su)
	{
		for(int i=0;i<su.length();i++)
		{
			char cha;
			cha=su.charAt(i);
			if(cha>='A' && cha<='Z')
			{
				cha=(char)(cha+32);
			}
			low+=cha;
		}
		if(low=="")
		{
			System.out.print("nothing here!!");
		}
	}
	static String giveLower()
	{
		return low;
	}
};

class Sentence
{
	static String sen="";
	Sentence(String yo)
	{
		String ho[]=yo.split(" ");
		for(int i=0;i<ho.length;i++)
		{
			sen+=(ho[i].substring(0,1).toUpperCase()+ho[i].substring(1)+" ");
		}
	}
	static String giveSentence()
	{
		return sen;
	}
}


class Test
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Type string to convert into Upper Case: ");
		String t=s.nextLine();
		
		Upper up=new Upper(t);
		System.out.println(up.giveUpper());
		
		System.out.print("\nType string to convert into Lower Case: ");
		String tut=s.nextLine();
		
		Lower lol=new Lower(tut);
		System.out.println(lol.giveLower());
		
		System.out.print("\nType string to convert into Sentence Case: ");
		String chup=s.nextLine();
		
		Sentence sunu=new Sentence(chup);
		System.out.println(sunu.giveSentence());
	}
}