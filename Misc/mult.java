class Mult{
public static void main(String args[]){

int i,j,n;

n=Integer.parseInt(args[0]);

for(i=1;i<=3;i++)
{
	for(j=1;j<=10;j++)
	{
		if(i==1)
			System.out.print(n*j + "\t ");
		if(i==2)
			System.out.print(j + "\t");
		if(i==3)
			System.out.print(n + "\t ");
	}
	System.out.println();
	System.out.println();
}

}};		