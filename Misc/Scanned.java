import java.util.*;

class Scanned{
public static void main(String args[]){

Scanner s=new Scanner(System.in);

System.out.println("Enter Your name:");
String na= s.nextLine();

System.out.println("Enter roll:");
int ro= s.nextInt();

System.out.println("Enter sem:");
String se= s.next();

System.out.println("Enter Marks:");
float ma= s.nextFloat();

System.out.println(na+"\n roll "+ro+"\n sem "+se+"\n Marks"+ma);

}};