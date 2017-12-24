// question 5

import java.util.*;

class IntArr2{
public static void main(String args[]){

char ch='y';
Scanner s=new Scanner(System.in);
int ar[]=new int[10];
int x,i,j;
i=0;

while(ch=='y'){

	System.out.println("Enter Your Choice!\n (1)->add\t(2)->delete\t(3)->disp\t(4)->continue\t(5)->exit");
	x=s.nextInt();

	if(x==1)
	{
		System.out.print("Number to Add :");
		ar[i]=s.nextInt();
		i++;
		System.out.println("Added");
	}
	else if(x==2)
	{	
		i--;
		System.out.println("deleted");
	}
	else if(x==3)
	{
		System.out.println("displaying...");
		for(j=0;j<i;j++)
		{	
			System.out.println(ar[j]+" ");
		}
	}
	else if(x==4)
	{	
		System.out.println("Continued");
		continue;
	}
	else if(x==5)
	{
		System.out.println("exiting");
		ch='n';
	}
	else
	{
		System.out.println("Invalid Entry. Hurrrrr!");
	}

}

}};

