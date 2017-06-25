package fibonasis;
import java.util.Scanner;
public class ReversString {
	public static void main(String[]args){
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String Str=sc.nextLine();
	sc.close();
	String sbuffer=new StringBuffer(Str).reverse().toString();
	System.out.println(sbuffer);
	}
}
