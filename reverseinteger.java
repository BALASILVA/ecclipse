package fibonasis;
import java.util.Scanner;
public class reverseinteger {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	String num=sc.nextLine();
	sc.close();
	String bnum=new StringBuffer(num).reverse().toString();
	System.out.println("The reverse of number is:"+bnum);
}
}
