import java.util.Scanner;
public class CounDig {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	str=str.toLowerCase();
	sc.close();
	System.out.println("Number of integer is:"+str.length());
}
}
