// This Java Program demonstrates the Default values of all the data types in JAVA

class DefaultVal{

	static int i;		//the GLOBAL VARIABLES are Auto-Initialised with their Default Values

	static boolean boo;	//Boolean has Default Value as "FALSE"



//All Data types will have defaults values as "0" or "0.0 or "FALSE"(in case of Boolean)




public static void main(String args[]){

	
	//the LOCAL VARIABLES must be initialized
		//*else COMPILATION ERROR*


	float flo = 0.0f; //We specify the float data type after the value with 'f' or 'F'



	double dou = 0.0d; //We specify the double data type after the value with 'd' or 'D'



	System.out.println("The Default Values of all the Data Types are:");
	
	System.out.println(" INTEGER: "+ i +"\n\n FLOAT: "+ flo +"\n\n DOUBLE: "+ dou +"\n\n BOOLEAN: " + boo );

}};
	