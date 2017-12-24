class LabeledTest{

public static void main(String args[]){

System.out.println("==================================Break==================================");

	stop:					//Labeled break 'stop'
	for(int i=1;i<=5;i++)
	{
		
		System.out.println("Outer Loop: "+i);
		
		for(int j=10;j<=15;j++)
		{
			
				if(j==12)
				break stop;	//Here 'stop' acts as a Labeled Break	

		System.out.println("\tInner Loop: "+j);
		}
	}



System.out.println("=================================Continue=================================");



	chalo:					//Labeled continue 'chalo'
	for(int i=1;i<=5;i++)
	{
		
		System.out.println("Outer Loop: "+i);
		
		for(int j=10;j<=15;j++)
		{
			
				if(j==12)
				continue chalo;	//Here 'stop' acts as a Labeled Break	

		System.out.println("\tInner Loop: "+j);
		}
	}



}};