//question 3

class Arr1{
public static void main(String args[]){
int ar[]= new int[5];
for(int i=0;i<ar.length;i++)
{
	ar[i]=Integer.parseInt(args[i]);
}

for(int z:ar)
{
	System.out.println(z+" ");
}

}};