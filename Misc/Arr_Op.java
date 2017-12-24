class Arr_Op{

static void print(int z[][]){

for(int m[]: z){
	for(int n: m)
		System.out.print(n+"\t ");
	System.out.println();
		}
System.out.println();
}

public static void main(String args[]){

int a[][]={ {1;2;3}{10;20;30}{100;200;300}};
int b[][]={ {1;2;3}{1;2;3}{1;2;3}};

print(a);
print(b);

for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		a[i][j]++;
		b[i][j]++;
	}
}
print(a);
print(b);

}};