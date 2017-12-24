public class IncreTest{

static int a=6, b=12, c=0; 

static void print(){

	System.out.println("\n a= " + a + ", b= " + b + ", c= "+ c);
}



static public void main(String args[]){


print();

	a++;	b++;	++a;	++b;

print();

	a++;	b++;	c++;

print();

System.out.println("\n a= " + (++a) + ", b= " + (b++) + ", c= "+ (c = a++ + ++b));

print();

}};



