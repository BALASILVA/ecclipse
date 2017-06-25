package fibonasis;
import java.util.Scanner;
public class StringToInt {
	public static void main(String[]args){
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String Str=sc.next();
	sc.close();
	int num=Integer.parseInt(Str);
	System.out.println("The Strings Int value is:"+num);
	}
}
