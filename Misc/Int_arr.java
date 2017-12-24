// question 4

class Int_arr{
public static void main(String args[]){

int n;
int array[]=new int[20];
n=Integer.parseInt(args[0]);

for(int i=1;i<=n;i++)
{
	array[i]=Integer.parseInt(args[i]);
}

for(int i=1;i<=n;i++)
{	
	
	System.out.print(array[i]+" ");
}

}};