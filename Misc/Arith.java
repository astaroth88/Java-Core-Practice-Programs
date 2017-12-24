class H
{
	int add(int p, int q){
		return p+q;
	}
	int sub(int p, int q){
		return p-q;
	}
	int div(int p, int q){
		return p/q;
	}
}

class K
{
	public static void main(String args[])
	{	int a,s,d;
		H digits=new H();
		a=digits.add(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		s=digits.sub(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		d=digits.div(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		System.out.println("Added: "+a+" \nSubtracted: "+s+" \nDivision: "+d);
	}
}