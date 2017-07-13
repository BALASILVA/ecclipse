package player;
import java.util.Scanner;
public class player14 {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	String rev=new StringBuffer(str).reverse().toString();
	System.out.println("Output1:"+rev);
	String volRem;
	volRem=str.replaceAll("[a,e,i,o,u]","");
	System.out.println("Outut2:"+volRem);
}
}
